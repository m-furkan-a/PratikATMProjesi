import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    int right = 3 , select = 0 , balance = 1500;

	    while (right > 0){
            System.out.print("Kullanıcı Adınız : ");
            String name = input.nextLine();
            System.out.print("Parolanız : ");
            String password = input.nextLine();
            if (name.equals("furkan") && password.equals("ars123")){
                System.out.println("Sisteme Giriş Başarılı Bankamıza Hoşgeldiniz...");
                do {
                    System.out.println(" 1-Para Yatırma\n 2-Para Çekme\n 3-Bakiye Sorgula\n 4-Çıkış Yap" );
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
                    select = input.nextInt();
                    switch (select){
                        case 1: System.out.print("Para Miktarı : ");
                        int price = input.nextInt();
                        balance += price;
                        break;
                        case 2: System.out.print("Para Miktarı : ");
                        int priceT =input.nextInt();
                        if (priceT > balance)
                            System.out.println("Bakiye Yetersiz...");
                        else
                            balance -=priceT;
                        break;
                        case 3: System.out.println("Bakiyeniz : " + balance);
                    }
                }while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }else {
                right--;
                if (right == 0 ){
                    System.out.print("Hesabınız Bloke Olmuştur Lütfen Banka İle İletişime Geçiniz.");
                }else {
                    System.out.println("Hatalı Kullanıcı Adı veya Şifre. Tekrar Deneyiniz...");
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }

        }
    }
}
