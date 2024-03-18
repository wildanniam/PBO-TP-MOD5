package tp06;

public class Koordinat {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double hitungJarak(Koordinat k) {
        double diffX = this.x - k.x;
        double diffY = this.y - k.y;
        return Math.sqrt((diffX * diffX) + (diffY * diffY));
    }

    public Koordinat(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
