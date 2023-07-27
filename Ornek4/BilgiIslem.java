package Ornek4;

public class BilgiIslem extends Memur{

    private String gorev;

    public BilgiIslem(String adSoyad, String telefon, String eposta, String departman, String mesai, String gorev){
        super(adSoyad, telefon, eposta, departman, mesai);
        this.gorev = gorev;
    }

    public String getGorev(){
        return gorev;
    }

    public void setGorev(String gorev){
        this.gorev = gorev;
    }

    public void networkKur(){
        System.out.println(this.getAdSoyad() + " network kurdu");
    }

    @Override
    public void calis(){
        System.out.println(this.getAdSoyad() + " bi görevlsii calisiyor");
    }
}
