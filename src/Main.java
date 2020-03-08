
public class Main {
public static void main (String args[]) {
    Resolution resolution = new Resolution(1920, 1020);
    Monitor monitor = new Monitor("VS197DE", "ASUS", "18.5", resolution);
    kasa kasa = new kasa("SHADOW BLADE", "SHADOW", "TEMPERLI CAM");
    Anakart anakart = new Anakart("B250-PRO", "ASUS", 10, "WIN-10");
    Bilgisayar bilgisayar = new Bilgisayar(monitor, kasa, anakart);
    
    bilgisayar.getKasa().bilisayariAc();
    bilgisayar.getMonitor().monitoruKapat();
    bilgisayar.getAnakart().isletimSisteiYukle("Linux");
}
}
