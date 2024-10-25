import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int[] arr = new int[length];
        int[] spaceArr = new int[length];
        int idx = 0;
        int input = 1;
        int spaceInput = 0;

        while(idx < length) {
            if((length / 2) > idx) {
                arr[idx] = input;
                spaceArr[idx] = spaceInput;
                input += 2;
                idx++;
                spaceInput++;
            }else {
                arr[idx] = input;
                spaceArr[idx] = spaceInput;
                input -= 2;
                idx++;
                spaceInput--;
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < spaceArr[i]; j++) {
                System.out.print(" ");
            }
            
            for(int j = 0; j < arr[i]; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}