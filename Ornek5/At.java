package Ornek5;

public class At extends Hayvan{

    public At(String name){
        super(name);
    }

    @Override
    public String konus(){
        return this.getName() + " kisniyor...";
    }
}
