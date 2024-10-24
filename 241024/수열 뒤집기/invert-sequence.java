import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrlength = sc.nextInt();
        int repeat = sc.nextInt();

        int[] arr = new int[arrlength];

        for(int i = 1; i <= arrlength; i++) {
            arr[i - 1] = i;
        }

        int[] arra = new int[2];
        arra[0] = sc.nextInt();
        arra[1] = sc.nextInt();
        int[] arrb = new int[2];
        arrb[0] = sc.nextInt();
        arrb[1] = sc.nextInt();

        for(int i = 0; i < repeat; i++) {
            int[] arratemp = new int[arra[1] - arra[0] + 1];
            int aidx = 0;
            for(int j = arra[0] - 1; j <= arra[1] - 1; j++) {
                arratemp[aidx] = arr[j];
                aidx++;
            }

            aidx = 0;

            for(int j = arra[1] - 1; j >= arra[0] - 1; j--) {
                arr[j] = arratemp[aidx];
                aidx++;
            }

            int[] arrbtemp = new int[arrb[1] - arrb[0] + 1];
            int bidx = 0;
            for(int j = arrb[0] - 1; j <= arrb[1] - 1; j++) {
                arrbtemp[bidx] = arr[j];
                bidx++;
            }

            bidx = 0;

            for(int j = arrb[1] - 1; j >= arrb[0] - 1; j--) {
                arr[j] = arrbtemp[bidx];
                bidx++;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}