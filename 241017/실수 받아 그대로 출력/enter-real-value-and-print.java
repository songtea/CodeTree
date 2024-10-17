import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double num2 = Math.round(num*1000)/1000.0;

        System.out.printf("%.2f",num);
        sc.close();
    }
}