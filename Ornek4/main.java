package Ornek4;

public class main {
    public static void main(String[] args) {
        //abstract olduğu için nesne üretemeyiz
        //Calisan c1 = new Calisan("Mustafa Çetindağ", "05456789898", "mustafa@gmail.com");
        //c1.giris();

        //abstract olduğu için artık nesne üretemeyiz
        //Akademisyen a1 = new Akademisyen("Meryem Aydın", "05373809917","meryem@gmail.com","CENG","Doçent");
        //a1.cikis();
        //a1.derseGir();

        //abstract old için artık nesne üretemeyiz
        //Memur m1 = new Memur("Ali Veli", "0101010101", "a.patika", "Bilgi İslem", "09.00-18.00");
        //m1.calis();

        OgretimGorevlisi o1 = new OgretimGorevlisi("İbrahim Aydın","05454564545","ibo@gmail.com","CENG","PROF","5");
        //o1.sinavYap();

        Asistan as1 = new Asistan("İlayda Sağkol", "05655675656","ilayda@gmail.com","CENG","ARGOR","12:00-14:00");
        //as1.quizYap();

        LabAsistanı las1 = new LabAsistanı("Zeynep Ilıkan", "02342342323", "zeynep@gmail.com","CENG","ARGOR","13:00-15:00");
        //las1.lablaraGir();

        BilgiIslem b1  =new BilgiIslem("Seher Aydın", "01231231212", "sehe@gmail.com", "bilgiislem", "01:00-04:00","network");
        //b1.networkKur();

        GuvenlikGorevlisi g1 = new GuvenlikGorevlisi("Zeliha Aydın", "02122343434","zeliha@gmail.com","güvenlik","13:00-20:00","sertifika");
        //g1.nobet();

        //o1.giris("10:00");
        //o1.giris("10:00","18:00");

        //o1.giris();
        //a1.giris();
        //c1.giris();
        //m1.giris();

        //polymorphism
        //int[] loginUser = new int[5];
        //Calisan[] loginUser = {c1,a1,m1,o1};
        //Calisan.girisYapanlar(loginUser);

        o1.derseGir("10:00");
    }
}
