package Ornek5;

public class Hayvan {

    private String name;

    public Hayvan(String name){
        this.name = name;
    }

    public String getName(){
        return  name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String konus(){
        return "Hayvan konusuyor....";
    }
}
