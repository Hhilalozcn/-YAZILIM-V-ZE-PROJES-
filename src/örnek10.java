import java.util.Scanner;
public class örnek10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Çemberin yarı çapını giriniz: ");
        int yarıcap = scan.nextInt();

        System.out.println("Çemberin çevresi = " + (2 * Math.PI * yarıcap));
    }

}
