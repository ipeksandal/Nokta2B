public class Nokta2B {
    private int x;
    private int y;
    public Nokta2B(){

    }
    public Nokta2B(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double mesafe(int x1, int x2, int y1, int y2){
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
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
}
