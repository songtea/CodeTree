import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fit = 30.48;
        double a = Math.round((fit * sc.nextDouble()) * 10) / 10.0;

        System.out.print(a);
    }
}