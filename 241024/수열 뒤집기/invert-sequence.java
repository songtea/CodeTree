import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrlength = sc.nextInt();
        int repeat = sc.nextInt();
        int minRepeat = repeat;

        int[] arr = new int[arrlength];

        for(int i = 1; i <= arrlength; i++) {
            arr[i - 1] = i;
        }

        int[] arrclone = Arrays.copyOf(arr, arr.length);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();

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

            if(Arrays.equals(arr,arrclone)) {
                minRepeat = repeat % (i + 1);
                break;
            }
        }

        for(int i = 1; i <= arrlength; i++) {
            arr[i - 1] = i;
        }

        for(int i = 0; i < minRepeat; i++) {
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
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}