package Ornek5;

public class Kedi extends Hayvan{

    public Kedi(String name){
        super(name);
    }

    @Override
    public String konus(){
        return this.getName() + " miyavlıyor...";
    }
}
