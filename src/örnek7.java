public class örnek7 {
    public static void main(String[] args) {

        int sayi = 500;
        int toplam = 0;

        for(int i = 1; i <= sayi; ++i)
        {
            toplam += i;
        }

        System.out.println("1-500 arasındaki sayıların toplamı = " + toplam);
    }
}

