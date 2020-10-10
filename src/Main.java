public class Main {
    public static void main(String[] argc) throws InterruptedException {

        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz.");
        String sartlar="Yurtdışı Çıkış Kuralları....\n"
                +"Herhangi Bir Siyasi Yasağınızın Bulunmaması Gerekiyor..\n"
                +"15 TL Harç Bedelinizi Tam Olarak Yatırmanız Gerekiyor\n"
                +"Gideceğiniz Ülkeye Vizinizin Bulunması Gerekiyor..";

        String message="Yurtdışı Şartlarından Hepsini Sağlamnız Gerekiyor..";
        while (true){

            System.out.println("***************************");
            System.out.println(sartlar);
            System.out.println("***************************");


            Yolcu yolcu=new Yolcu();
            System.out.println("Harç Bedeli Kontrol Ediliyor..");

            Thread.sleep(3000);//PROGRAM 3 SANİYE BEKLEMEE!!!
            if(yolcu.yurtdisiHarciKontrol()==false);{
                System.out.println(message);
              //  continue;
            }

            System.out.println("Siyasi Yasak Kontrol Ediliyor..");
            Thread.sleep(3000);

            if(yolcu.siyasiYasakKontrol()==false){
                System.out.println(message);
                continue;
            }
            System.out.println("Vize Durumu Kontrol Ediliyor");
            Thread.sleep(3000);
            if(yolcu.vizeDurumuKontrol()==false){
                System.out.println(message);
                continue;
            }
            System.out.println("İşlemleriniz Tamam ! Yurtdışına çıkabilirsiniz....");

            break;

        }
    }
}
