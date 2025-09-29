package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int n=24;
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(n%i==0) result.add(i);
        }

        int [] answer = {result.size()};

        for(int i=0; i< result.size(); i++){
            answer[i] = result.get(i);
            System.out.println(answer[i]);
        }


    }
}
