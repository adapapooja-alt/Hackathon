import java.util.Scanner;

public class MainHack2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter waste collected in kg: ");
        Double waste = sc.nextDouble ();

        if (waste >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }

        sc.close();
    }
}