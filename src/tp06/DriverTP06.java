package tp06;

public class DriverTP06 {

    public static void main(String[] args) {
        Koordinat A = new Koordinat(30, 24);
        Koordinat3D B = new Koordinat3D(20, 14, 15);
        
        System.out.print("Jarak B dan A: ");
        System.out.println(B.hitungJarak(A));
        
        Koordinat3D C = new Koordinat3D(22, 52, 64);
        
        System.out.print("Jarak B dan C: ");
        System.out.println(B.hitungJarak(C));
        
        KoordinatLingkaran D = new KoordinatLingkaran(70, 120, 25.5);
        KoordinatLingkaran E = new KoordinatLingkaran(50, 100, 65.2);
        
        System.out.print("Jarak D dan E: ");
        System.out.println(D.hitungJarak(E));
    }
    
}
