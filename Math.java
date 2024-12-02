
package learing.math;

import java.util.Scanner;


public class LEARINGMATH {


    public static void main(String[] args) {

        double num1 = (int) (Math.random ()*10);
        double num2 = (int) (Math.random()*10);
        System.out.println(num1+"-"+num2);
        int num = (int)(num1 - num2);
        System.out.println("Please enter the result");
        Scanner input = new Scanner(System .in);
           int ansur = input.nextInt();
       if (num == ansur){
           System.out.println("Your ansur is right");
       }else {
           System.out.println("Your ansyr is wrong");
       }
    }
    
}
