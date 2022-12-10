public class örnek6 {
    public static void main(String[] args) {
        int sayi = 56984, tersi = 0;
        int yedek=sayi;

        for(;sayi != 0; sayi /= 10) {
            int basamak = sayi % 10;
            tersi = tersi * 10 + basamak;
        }
        System.out.println("Sayının      : " + yedek);
        System.out.println("Sayının Tersi: " + tersi);
    }
}
