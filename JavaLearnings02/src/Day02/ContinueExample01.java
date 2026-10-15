package Day02;

public class ContinueExample01 {
    public static void main(String[] args){
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipped number: "+i);
                continue;
            }
            System.out.println("Counting the Number: "+i);
        }

    }
}
