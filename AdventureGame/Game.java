package AdventureGame;

import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);

    public void start(){
        System.out.println("Macera Oyununa Hoşgeldiniz.");
        System.out.print("Lütfen bir isim giriniz: ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Sayın " + player.getName() + " bu karanlık ve sisli adaya Hoşgeldiniz. Burada yaşanan herşey gerçek !!");
        System.out.println("Lütfen bir karakter seçiniz.");
        System.out.println("-----------------------------------------------------------");
        player.selectChar();

        Location location = null;
        while(true){
            player.printInfo();
            System.out.println();
            System.out.println("############ Bölgeler ############");
            System.out.println();

            System.out.println("1 - Güvenli Ev --> Burası sizin için güvenli ev, düşman yoktur!");
            System.out.println("2 - Eşya Dükkanı --> Silah veya zırh satın alabilirsiniz !");
            System.out.println("3 - Mağara --> Ödül <Yemek> , dikkatli ol karşına Zombi çıkabilir !");
            System.out.println("4 - Orman --> Ödül <Odun> , dikkatli ol karşına Vampir çıkabilir !");
            System.out.println("5 - Nehir --> Ödül <Su> , dikkatli ol karşına Ayı çıkabilir !");
            System.out.println("0 - Çıkış Yap --> Oyunu Sonlandır !");

            System.out.println("Lütfen gitmek istediğiniz bölgeyi seçiniz : ");
            int selecLoc = input.nextInt();
            switch (selecLoc){
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    if(player.getInventory().getFood() == true){
                        System.out.println("Bu bölgeyi tamamladınız ! ");

                    }
                    else if (player.getInventory().getFood() == false){
                        location = new Cave(player);
                        player.getInventory().setFood(true);
                    }
                    else{
                        System.out.println("lütfen başka bölgeye geçiniz ! ");
                    }
                    break;
                case 4:
                    if(player.getInventory().getFirewood() == true){
                        System.out.println("Bu bölgeyi tamamladınız ! ");
                        break;
                    }
                    else{
                        location = new Forest(player);


                    }
                    break;
                case 5:
                    if(player.getInventory().getWater() == true){
                        System.out.println("Bu bölgeyi tamamladınız ! ");
                        break;

                    }else{
                        location = new River(player);
                    }
                    break;
                default:
                    System.out.println("Lütfen geçerli bir bölge giriniz.");
            }
            if(location == null){
                System.out.println("Bu karanlık ve sisli adadan çabuk vazgeçtin .");
                break;
            }
            if(!location.onLocation()){
                System.out.println("GAME OVER!");
                break;
            }
        }

    }
}
