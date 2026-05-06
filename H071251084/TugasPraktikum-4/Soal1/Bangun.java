abstract class Bangun {
    abstract double hitungLuas();
}

// BANGUN DATAR
abstract class BangunDatar extends Bangun {
    abstract double hitungKeliling();
}

// persegi
class Persegi extends BangunDatar {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    double hitungLuas() {
        return sisi * sisi;
    }

    double hitungKeliling() {
        return 4 * sisi;
    }
}

// persegi panjang
class PersegiPanjang extends BangunDatar {
    double panjang, lebar;

    PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    double hitungLuas() {
        return panjang * lebar;
    }

    double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}

// lingkaran
class Lingkaran extends BangunDatar {
    double r;

    Lingkaran(double r) {
        this.r = r;
    }

    double hitungLuas() {
        return Math.PI * r * r;
    }

    double hitungKeliling() {
        return 2 * Math.PI * r;
    }
}

// trapesium
class Trapesium extends BangunDatar {
    double a, b, c, d, tinggi;

    Trapesium(double a, double b, double c, double d, double tinggi) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.tinggi = tinggi;
    }

    double hitungLuas() {
        return 0.5 * (a + b) * tinggi;
    }

    double hitungKeliling() {
        return a + b + c + d;
    }
}

// BANGUN RUANG
abstract class BangunRuang extends Bangun {
    abstract double hitungVolume();
}

// kubus
class Kubus extends BangunRuang {
    double sisi;

    Kubus(double sisi) {
        this.sisi = sisi;
    }

    double hitungLuas() {
        return 6 * sisi * sisi;
    }

    double hitungVolume() {
        return sisi * sisi * sisi;
    }
}

// balok
class Balok extends BangunRuang {
    double p, l, t;

    Balok(double p, double l, double t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }

    double hitungLuas() {
        return 2 * (p*l + p*t + l*t);
    }

    double hitungVolume() {
        return p * l * t;
    }
}

// bola
class Bola extends BangunRuang {
    double r;

    Bola(double r) {
        this.r = r;
    }

    double hitungLuas() {
        return 4 * Math.PI * r * r;
    }

    double hitungVolume() {
        return (4.0/3.0) * Math.PI * r * r * r;
    }
}

// tabung
class Tabung extends BangunRuang {
    double r, t;

    Tabung(double r, double t) {
        this.r = r;
        this.t = t;
    }

    double hitungLuas() {
        return 2 * Math.PI * r * (r + t);
    }

    double hitungVolume() {
        return Math.PI * r * r * t;
    }
}