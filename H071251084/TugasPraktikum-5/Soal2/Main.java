package Soal2;

public class Main {
    public static void main(String[] args) {
        SmartLamp slamp = new SmartLamp("Philips", 25);
        SmartSpeaker sspeaker = new SmartSpeaker("Dolby", 40);
        CCTV scctv = new CCTV("Alexa", 15);

        System.out.println("--- Demonstrasi SmartLamp ---");
        slamp.infoPower();
        slamp.ProsesPerintah("NYALA");

        System.out.println("\n--- Demonstrasi SmartCCTV ---");
        scctv.infoPower();
        scctv.HubungkanWifi();

        System.out.println("\n--- Demonstrasi SmartSpeaker ---");
        sspeaker.infoPower();
        sspeaker.cekFungsi();
        sspeaker.HubungkanWifi();
        sspeaker.ProsesPerintah("Mainkan lagu jj");
    }
}
