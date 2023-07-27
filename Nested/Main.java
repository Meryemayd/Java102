package Nested;

public class Main {
    public static void main(String[] args) {
        //1
        //Out out = new Out();
        //out.run();

        //2
        //Out.In in = out.new In();
        //in.run();

        //3
        //Out.In in = out.getIn();
        //in.run();

        //4
        //static in
        //Out2.InStatic.run();

        //5
        //local class
        //Local l = new Local();
        //l.run();

        //6
        //Anonymus class
        /*Anonim a = new Anonim(){
            public int a = 20;
            @Override
            public void run(){
                System.out.println(this.a);
                System.out.println("Anonim olarak verilmiş run methodu");
            }
            //sınıf içine yazılmayan metodu burada yazamazsın. sadece override edebilirsin
            public void print(){
                System.out.println("Print metodu");
            }
        };
        a.run();
        //a.print();*/
    }
}
