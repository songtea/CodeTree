import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int column = sc.nextInt();
        int row = sc.nextInt();
        int mul = sc.nextInt();
        String[] arr = new String[column];

        for(int i = 0; i < column; i++) {
            arr[i] = sc.next();
        }

        String[] result = new String[column];
        String a = "";

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length(); j++) {
                for(int k = 0; k < mul; k++) {
                    a += arr[i].charAt(j);
                }
            }
            result[i] = a;
            a = "";
        }

        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < mul; j++) {
                System.out.print(result[i]);
                System.out.println("");
            }
        }
    }
}