

public class örnek5 {
    public static void main(String[] args) {
        int taban = 2, kuvvet = 2;

        long sonuc = 1;

        for (;kuvvet != 0; --kuvvet)
        {
            sonuc *= taban;
        }

        System.out.println("CEVAP = " + sonuc);
    }
}
