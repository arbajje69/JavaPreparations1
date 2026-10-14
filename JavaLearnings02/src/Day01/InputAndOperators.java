package Day01;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class InputAndOperators {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);


        System.out.println("Enter Numbers to add");
        System.out.println("Enter the First Number ");
        int a = sc.nextInt();

        System.out.println("Enter the Second Number");
        int b = sc.nextInt();

        int ans = a+b;

        System.out.println("First Number + Second Number is equal to :" + ans);


    }
}
