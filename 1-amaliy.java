import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        double pi = 3.14, S;
        Scanner oby = new Scanner(System.in);
        System.out.print("Katta radiusni kiriting: ");
        int R = oby.nextInt();
        System.out.print("Kichik radiusni kiriting: ");
        int r = oby.nextInt();
        S = pi * (R * R - r * r);
        System.out.print("Halqa yuzi " + S + " ga teng.");
    }
}
