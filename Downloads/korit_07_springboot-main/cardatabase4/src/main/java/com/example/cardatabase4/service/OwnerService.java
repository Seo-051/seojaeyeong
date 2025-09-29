package com.example.cardatabase4.service;

import com.example.cardatabase4.domain.Car;
import com.example.cardatabase4.domain.Owner;
import com.example.cardatabase4.domain.OwnerRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerService {
    private final OwnerRepository ownerRepository;

    public OwnerService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }
    // Owner 전체 조회
    public List<Owner> getOwner(){
        return ownerRepository.findAll();
    }

    public Owner addOwner(Owner owner){
        return ownerRepository.save(owner);
    }

    // id 별 조회
    public Optional<Owner> getOwnerById(Long ownerId){
        return ownerRepository.findById(ownerId);
    }

    // Owner 객체 추가
    @Transactional
    public Optional<Owner> updateOwner(Long ownerId, Owner ownerDetails){
        return ownerRepository.findById(ownerId)
                .map(owner -> {
                    owner.setFirstName(ownerDetails.getFirstName());
                    owner.setLastName(ownerDetails.getLastName());
                    return owner;
                    // carRepository.save(car); 가 아닙니다.
                    // @tra
                });
    }

    // Owner 객체 삭제

    public boolean deleteOwner(Long ownerId){
        if (ownerRepository.existsById(ownerId)) {
            ownerRepository.deleteById(ownerId);
            return true;
        }
        return  false;
    }
    // Owner 객체 수정
}
