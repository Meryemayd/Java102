package GenericMethods;

public class ArrayUtil {
    public static <T> boolean arrayContains(T[] array, T elem){
        for(T item : array){
            if(item != null && item.equals(elem))
                System.out.println(array.getClass().getName() + " i " + elem + "elemanı İçerir");
                return true;
        }
        System.out.println("içermez");
        return false;
    }

}
