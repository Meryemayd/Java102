package Nested;

//outer class
public class Out {
    public int a = 5;

    //ınner class
    public class In{
        public int a  = 10;

        public void run(){
            System.out.println("In class çalıştı");
            int a = 1;
            System.out.println(a);//method içindeki a yı verir
            System.out.println(this.a);//this bulunduğu classtakini döndürür
            System.out.println(Out.this.a);//out class içindeki a yı yazdırır
        }
    }

    //farklı metodlardır
    public void run(){
        In in = new In();
        in.run();
    }

    public In getIn(){
        return new In();
    }
}
