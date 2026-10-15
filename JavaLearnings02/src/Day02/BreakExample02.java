package Day02;

public class BreakExample02 {
    public static void main(String[] args){
        for(int i=1; i<=10; i++){
            if (i==5) {
                System.out.println("Iteration Stoped at Count : "+i);
                break;
            }

            System.out.println("Continues count : "+i);
        }

    }
}

// A for loop is used to repeat a block of code
// when the number of iterations is known or predictable.