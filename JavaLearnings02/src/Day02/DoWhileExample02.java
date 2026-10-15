package Day02;

import java.util.Scanner;

public class DoWhileExample02 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number= sc.nextInt();

//        int number=10;
        do {
            System.out.println("Your number is :"+ number);
            number++;
        } while(number<=5);

        System.out.println("Your number is increased to 5 (Only When it is less then 5))");
    }
}
