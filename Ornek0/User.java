package Ornek0;

import java.util.Random;

public class User {

    public String name;
    public static int counter = 0;

    static{
        int random = (int)(Math.random()*10);
        System.out.println("Random sayı : " +random);
        counter = random;
    }

    public User(String name){
        this.name = name;
        counter++;
    }


    static {
        System.out.println("Ben bir static kod bloğuyum");
    }
}
