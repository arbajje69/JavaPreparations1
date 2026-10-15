package Day02;

public class BreakExample01 {
    public static void main(String[] args){


        int count=1;
//Iterating using While loop

        while(count<=10){
            System.out.println("Counting Continued "+count);
            count++;
            if (count==5){
                System.out.println("Terminated on count "+ count);
                break;
            }
        }

    }
}

// A while loop is used to repeat a block of code
// as long as the given condition is true.
// It is useful when the number of iterations is not known in advance.