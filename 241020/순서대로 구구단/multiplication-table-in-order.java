import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
    
        int length = 0;
        int[] arr = {};

        if(a < b) {    
            length = (b - a) + 1;
            arr = new int[length];

            for(int i = 0; i < arr.length; i++) {
                arr[i] = a;
                a++;
            }

            for(int i = 1; i <= 9; i++) {
                String c = "";
                for(int j = 0; j < arr.length; j++) {
                    c += arr[j] + " * " + i + " = " + (arr[j] * i) + "  ";
                }
                System.out.println(c);
            }
        }else {
            length = (a - b) + 1;
            arr = new int[length];
            for(int i = 0; i < arr.length; i++) {
                arr[i] = b;
                b--;
            }

            for(int i = 1; i <= 9; i++) {
                String c = "";
                for(int j = 0; j < arr.length; j++) {
                    c += arr[j] + " * " + i + " = " + (arr[j] * i) + "  ";
                }
                System.out.println(c);
            }
        }
    }
}