package Day02;

public class DoWhileExample01 {
    public static void main(String[] args){

        int number= 5;
        int count=1;
        do {
            System.out.println("Your number is :"+ number);
//            System.out.println("Counts are :"+count);
            count++;
        } while(count<=5);

        System.out.println("Counts are :"+count);
    }
}
