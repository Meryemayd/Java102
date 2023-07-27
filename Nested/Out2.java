package Nested;

public class Out2 {

    public int a = 5;
    public static int b = 20;

    //ınner class
    public static class InStatic{
        public static int a  = 10;

        public static void run(){
            System.out.println("In class çalıştı");
            int a = 1;
            System.out.println(a);//method içindeki a yı verir
            System.out.println(InStatic.a);//static a ya ulaşmaya çalışırız
            //System.out.println(Out2.this.a);//out class içindeki a yı yazdırır
            System.out.println(Out2.b);
        }
    }

    //farklı metodlardır
    public void run(){
        InStatic.run();
    }

}
