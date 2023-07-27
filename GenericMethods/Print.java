package GenericMethods;

public class Print {

    public static <T> void printArray(T[] arr){
        for(T i : arr ){
            System.out.println(i);
        }
    }

    public static <T, U> void printTwoArray(T[] arr, U[] arr2){
        for(T i : arr){
            System.out.println(i);
        }
        for(U i : arr2){
            System.out.println(i);
        }
    }
}
