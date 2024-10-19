import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        b = Math.round(b * 100) / 100.0;
        c = Math.round(c * 100) / 100.0;

        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
    }
}