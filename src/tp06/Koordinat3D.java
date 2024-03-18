package tp06;

public class Koordinat3D extends Koordinat{
    private int z;
    
    public Koordinat3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }
    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {
        return z;
    }

   
    public double hitungJarak(Koordinat3D k) {
        double diffX = this.getX() - k.getX();
        double diffY = this.getY() - k.getY();
        double diffZ = this.z - k.z;
        return Math.sqrt((diffX * diffX) + (diffY * diffY) + (diffZ * diffZ));
    }
}
