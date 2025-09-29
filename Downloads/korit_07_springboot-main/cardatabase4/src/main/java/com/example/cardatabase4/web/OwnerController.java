package com.example.cardatabase4.web;

import com.example.cardatabase4.domain.Owner;
import com.example.cardatabase4.service.OwnerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }
    // Owner 전체 조회
    @GetMapping("/owners")
    public List<Owner> getOwner() {
        return ownerService.getOwner();
    }

    // Owner 객체 추가
    @PostMapping("/owners")
    public ResponseEntity<Owner> addOwner(@RequestBody Owner owner) {
        Owner savedOwner = ownerService.addOwner(owner);

        return new ResponseEntity<>(savedOwner, HttpStatus.CREATED);
    }

    @GetMapping("/owners/{ownerId}")
    public ResponseEntity<Owner> getOwner(@PathVariable Long ownerId){
        return ownerService.getOwnerById(ownerId)
                .map(owner -> ResponseEntity.ok().body(owner))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/owners/{ownerId}")
    public ResponseEntity<Void> deleteOwner(@PathVariable Long ownerId){
        if(ownerService.deleteOwner(ownerId)){
            return ResponseEntity.noContent().build();
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }


    @PutMapping("/owners/{ownerId}")
    public ResponseEntity<Owner> updateOwner(@PathVariable Long ownerId, @RequestBody Owner ownerDetails){
        return ownerService.updateOwner(ownerId, ownerDetails)
                .map(updateOwner -> ResponseEntity.ok().body(updateOwner)) //수정 성공 200ok
                .orElse(ResponseEntity.notFound().build());     // 수정할 차량 id 검색 실패시 404
    }
    // Owner 객체 삭제
    // Owner 객체 수정
}
