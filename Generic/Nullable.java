package Generic;

public class Nullable {
    private final String value;

    public Nullable(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
    //set metodu tanımlanamaz çünkü final tanımlanmış

    public boolean isNull(){
        return this.getValue() == null;
    }

    public void run(){
        if(isNull()){
            System.out.println("bu değişkene değer atanmamıştır (null)");
        }else{
            System.out.println(this.getValue());
        }
    }
}
