import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a no");
        int number = scan.nextInt();
        double Harmonic = 0.0;
        for(int i=1 ; i<=number ; i++) {
            Harmonic = Harmonic + 1.0/ i;
        }
        System.out.println("Harmonic Number:" +Harmonic);
    }

}