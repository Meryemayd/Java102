package Ornek5;

public class Kopek extends Hayvan{

    public Kopek(String name){
        super(name);
    }

    @Override
    public String konus(){
        return this.getName() + " havlıyor...";
    }
}
