
package Day3;
import java.util.Arrays;

public class DailyTempChange01 {

    public static void main(String[] args) {
        int temps[]={30, 40, 50, 60};
        int ans[]=new int[temps.length];

        for (int i = 0; i < temps.length; i++) {

            for (int j = i + 1; j < temps.length; j++) {

                if (temps[j] > temps[i]) {
                    ans[i] = j - i;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}