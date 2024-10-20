import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a < b) {
            int[] arr = new int[(b - a) + 1];

            for(int i = 0; i < arr.length; i++) {
                arr[i] = b;
                b++;
            }

            for(int i = 0; i < arr.length; i++) {
                for(int j = 1; j <= 9; j++) {
                    System.out.print(arr[i] + " * " + j + " = " + (arr[i] * j) + "  ");

                    if(j % 3 == 0) {
                        System.out.println("");
                    }
                }
                System.out.println("");
            }
        }else{
            int[] arr = new int[(a - b) + 1];

            for(int i = 0; i < arr.length; i++) {
                arr[i] = a;
                a--;
            }

            for(int i = 0; i < arr.length; i++) {
                for(int j = 1; j <= 9; j++) {
                    System.out.print(arr[i] + " * " + j + " = " + (arr[i] * j) + "  ");

                    if(j % 3 == 0) {
                        System.out.println("");
                    }
                }
                System.out.println("");
            }
        }
    }
}