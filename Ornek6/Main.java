package Ornek6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tutar giriniz: ");
        double price = input.nextDouble();

        System.out.println("Kart No giriniz: ");
        String cardNumber = input.next();

        System.out.println( "Son kullanım tarihini giriniz");
        String date = input.next();

        System.out.println("Güvenlik kodunu giriniz: ");
        String cvc = input.next();

        System.out.println("1. A Bankası");
        System.out.println("2. B Bankası");
        System.out.println("3. C Bankası");
        System.out.println("Banka Seçiniz: ");
        int selectBank = input.nextInt();

        switch (selectBank){
            case 1:
                ABankasi aPos = new ABankasi("ABankası","123123123123","234234234234");
                aPos.connect("127.0.0.1");
                aPos.payment(price, cardNumber, date, cvc);
                break;
            case 2:
                BBankasi bPos = new BBankasi("BBankası","123123123123","234234234234");
                bPos.connect("127.0.0.1");
                bPos.payment(price,cardNumber,date,cvc);
                break;
            default:
                System.out.println("GEÇERLİ BANKA GİRİNİZ");
        }
    }
}
