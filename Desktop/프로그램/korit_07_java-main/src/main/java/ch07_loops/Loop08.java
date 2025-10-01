package ch07_loops;

/*
     *
    **
   ***
  ****
 *****

 *****
  ****
   ***
    **
     *


 */

public class Loop08 {
    public static void main(String[] args) {
        /*
        // 개행을 책임지는 for문
        for(int i=0; i<6; i++){
            //공백을 책임지는 for문
            for(int j=6; j>i; j--){
                System.out.print(" ");
            }
            //별을 책임지는 for문
            for(int k=0; k<i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        //=====================

        for(int i=0; i<6; i++){
            for(int k=0; k<i; k++){
                System.out.print(" ");
            }
            for(int j=6; j - i > 0 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
