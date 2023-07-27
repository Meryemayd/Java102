package Ornek0;

public class Daire {
    public int r;
    public final double PI_SAYISI = 3.14;

    public Daire(int r){
        this.r = r;
    }

    public void calculateArea(){
        double area = PI_SAYISI*this.r*this.r;
        System.out.println("dairenin alanı " +area);
    }

    public static void main(String[] args) {
        Daire d = new Daire(10);
        d.calculateArea();
    }
}
