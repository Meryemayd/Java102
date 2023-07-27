package Generic;

public class Main {
    public static void main(String[] args) {
        //bu sadece stringe bakıyor ama ben bir çok tür için bakmak istiyorum
        String str = null;
        Nullable n = new Nullable(str);
        Integer a = null;
        NullableInteger ni = new NullableInteger(a);

        //n.run();
        //ni.run();

        //generic
        Integer b = 12;
        NullableGeneric<Integer> ng = new NullableGeneric<>(b);
        //ng.run();

        //generic test class
        Integer i = 10;
        String s = "patika";
        Double d = 3.14;
        String s2 = "dev";

        Test<Integer, String, Double> t = new Test<>(i,s,d);
        t.showInfo();
    }
}
