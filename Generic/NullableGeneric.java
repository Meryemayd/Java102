package Generic;

public class NullableGeneric <T> {
    private final T value;

    public NullableGeneric(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public boolean isNull(){
        return this.getValue() == null;
    }

    public void run(){
        if(isNull()){
            System.out.println("Bu değişkene değer atanmamıştır. (null)");
        }else{
            System.out.println(this.getValue());
        }
    }
}
