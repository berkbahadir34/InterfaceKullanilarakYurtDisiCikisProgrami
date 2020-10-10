import java.util.Scanner;

public class Yolcu implements IYurtdisiKurallari {
    private  int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu(){


        Scanner scanner=new Scanner(System.in);
        System.out.println("Yatirdiğiniz Harç Bedeli: ");
        this.harc=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Siyasi Yasağınız Bulunuyor Mu(evet ya da hayır) ? ");
        String cevap=scanner.nextLine();
        if(cevap.equals("evet")){
            this.siyasiYasak=true;
        }
        else{
           this.siyasiYasak=false;
        }
        System.out.println("Vizeniz Bulunuyor Mu (evet ya da hayır) ?");
        String cevap2=scanner.nextLine();
        if(cevap2.equals("evet")){
            this.vizeDurumu=true;
        }
        else{
            this.vizeDurumu=false;
        }

    }
    @Override
    public boolean yurtdisiHarciKontrol() {
       if(this.harc<15){
           System.out.println("Lütfen Yurt Dışı Çıkış Harcını Tam Yatırın.");
           return false;
       }
       else{
           System.out.println("Yurtdışı Harç İşlemi Tamam");
           return true;
       }

    }

    @Override
    public boolean siyasiYasakKontrol() {
        if(this.siyasiYasak==true){
            System.out.println("Siyası Yasağınız Bulunuyor Yurt Dışına Çıkamazsınız");
            return false;
        }
        else{
            System.out.println("Siyasi Yasağınız bulunmuyor.");
            return true;
        }

    }

    @Override
    public boolean vizeDurumuKontrol() {
        if(this.vizeDurumu==true){
            System.out.println("Vize İşlemleri Tamam");
            return true;
        }
        else{
            System.out.println("Vizeniz gideceğiniz ülkeye bulunmamaktadır.");
            return false;
        }

    }
}
