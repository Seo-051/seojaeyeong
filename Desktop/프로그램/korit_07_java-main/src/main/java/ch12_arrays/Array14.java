package ch12_arrays;

import java.util.Arrays;

public class Array14 {
    public static void main(String[] args) {
        int[][] nums = new int[20][5];
        int count=1;
        // 1부터 100까지의 숫자를 2차 배열에 순서대로 값을 넣으시오
        // 즉 nums[0][0] = 1, nums[0][1] = 2, nums[1][0] = 6

        for(int i=0; i< nums.length; i++) {
            System.out.println();
            for(int j=0; j<nums[i].length; j++){
                nums[i][j] = count++;
                System.out.print(nums[i][j] + " ");

            }
        }

        for(int[] firstArray : nums){
            for(int number : firstArray){
                System.out.println(number + " ");
            }
            System.out.println();
        }

        for(int[] firstArray : nums){
            System.out.println(Arrays.toString(firstArray));
        }

        // 2차 배열의 출력 : Arrays.deepToString(배열명);

        System.out.println(Arrays.deepToString(nums));

        //ch13_inheritance  / Animal / Human Tiger Main
    }
}
