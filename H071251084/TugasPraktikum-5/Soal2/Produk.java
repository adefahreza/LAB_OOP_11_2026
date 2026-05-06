package Soal2;

class SmartLamp extends PerangkatElektronik implements KontrolSuara{

    SmartLamp(String merk, int dayalistrik) {
        super(merk, dayalistrik);
    }

    @Override
    void cekFungsi() {
        System.out.println("Memeriksa sistem pencahayaan...");
    }

    @Override
    public void ProsesPerintah(String Perintah) {
        if (Perintah.equals("NYALA")){
            System.out.println("Lampu berpijar");
        } 
        
    }
}

class CCTV extends PerangkatElektronik implements InteraksiListrik{

    CCTV(String merk, int dayalistrik) {
        super(merk, dayalistrik);
    }

    @Override
    void cekFungsi() {
        System.out.println("Cek jaringan internet...");
    }

    @Override
    public void HubungkanWifi() {
        System.out.println("Mengirim data ke server...");
    }

    
}

class SmartSpeaker extends PerangkatElektronik implements InteraksiListrik, KontrolSuara{

    SmartSpeaker(String merk, int dayalistrik) {
        super(merk, dayalistrik);
    }

    @Override
    void cekFungsi() {
        System.out.println("Cek Speaker...");
    }

    @Override
    public void HubungkanWifi() {
        System.out.println("Speaker terhubung ke WiFi");
    }

    @Override
    public void ProsesPerintah(String Perintah) {
        System.out.println("Memutar lagu "+ Perintah);
    }

    
}