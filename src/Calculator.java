import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int n1,n2,select;
        int result;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayı : ");
        n1 = input.nextInt();

        System.out.print("İkinci Sayı : ");
        n2 = input.nextInt();

        System.out.println("İşlemi Seçiniz");
        System.out.println("1 - Topla");
        System.out.println("2 - Çıkar");
        System.out.println("3 - Böl");
        System.out.println("4 - Çarp");
        System.out.println("5 - Mod");

        select = input.nextInt();

        switch (select) {
            case 1:
                result = n1 + n2;
                System.out.println("Sonuç : " + result);
                break;
            case 2:
                result = n1 - n2;
                System.out.println("Sonuç : " + result);
                break;
            case 3:
                if(n2 != 0) {
                result = n1 / n2;
                System.out.println("Sonuç : " + result);
                }
                else{
                    System.out.println("Bir Sayı 0'a bölünemez.");
                }
                break;
            case 4:
                result = n1 * n2;
                System.out.println("Sonuç : " + result);
                break;
            case 5:
                result = n1 % n2;
                System.out.println("Sonuç : " + result);
                break;
            default:
                System.out.println("Geçersiz bir sayı girdiniz..");

        }



    }
}
