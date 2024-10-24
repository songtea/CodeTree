import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrlength = sc.nextInt();
        int repeat = sc.nextInt();

        if(repeat % 9 == 0) {
            repeat = 9;
        }else if(repeat % 8 == 0) {
            repeat = 8;
        }else if(repeat % 7 == 0) {
            repeat = 7;
        }else if(repeat % 6 == 0) {
            repeat = 6;
        }else if(repeat % 5 == 0) {
            repeat = 5;
        }else if(repeat % 4 == 0) {
            repeat = 4;
        }else if(repeat % 3 == 0) {
            repeat = 3;
        }else if(repeat % 2 == 0) {
            repeat = 2;
        }

        int[] arr = new int[arrlength];

        for(int i = 1; i <= arrlength; i++) {
            arr[i - 1] = i;
        }

        int[] arrclone = Arrays.copyOf(arr, arr.length);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();

        // for(int i = 0; i < repeat; i++) {
        for(int i = 0; i < repeat; i++) {
            int[] arratemp = Arrays.copyOfRange(arr, a1 - 1, a2);
            int aidx = 0;

            for(int j = a2 - 1; j >= a1 - 1; j--) {
                arr[j] = arratemp[aidx];
                aidx++;
            }

            int[] arrbtemp = Arrays.copyOfRange(arr, b1 - 1, b2);
            int bidx = 0;

            for(int j = b2 - 1; j >= b1 - 1; j--) {
                arr[j] = arrbtemp[bidx];
                bidx++;
            }

            // if(Arrays.equals(arr,arrclone)) {
            //     System.out.println(i);
            //     break;
            // }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}