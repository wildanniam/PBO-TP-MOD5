package tp06;

public class KoordinatLingkaran extends Koordinat {
    double r;
    public double getR() {
        return r;
    }

    public KoordinatLingkaran(int x, int y, double r) {
        super(x, y);
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public boolean isBersinggunan(KoordinatLingkaran k) {
        double jarakTengah = this.hitungJarak(k);
        double jmlJariJari = this.r + k.r;
        return (jarakTengah <= jmlJariJari);
    }

}
