package GenericMethods;

public class Main {
    public static void main(String[] args) {
        String[] a = {"Java","102","Patika","Dev"};
        Integer[] b = {1,2,3,4};
        Character[] c = {'J','A','V','A'};

        //Print.printArray(a);
        //Print.printTwoArray(b,c);

        ArrayUtil.arrayContains(a, "Java");
    }
}
