import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] b = new int[sc.nextInt()];

        for(int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        for(int i = 1; i <= b[0]; i++) {
            if(b[0] % i == 0) {
                System.out.println(i);
            }
        }
    }
}