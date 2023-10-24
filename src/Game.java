import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    Scanner scan = new Scanner(System.in);

    public void login() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Adventure Game:");
        System.out.print("Please Enter Your Name: ");
        String playerName = scan.nextLine();
        player = new Player(playerName);
        player.selectCharacter();
        start();
    }

    public void start() {
        while (true) {
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
            System.out.println("Choose a place to take action:");
            System.out.println("1. Safe House ----> Safe Place");
            System.out.println("2. Cave  ----- > Zombies may come out");
            System.out.println("3. Forest  ----- > Vampire may come out");
            System.out.println("4. River  ----- > Bear may come out");
            System.out.println("5. Shop  ----- > Buy Weapon and Armor");
            System.out.println("Gitmek istediğiniz yer :");
            int selLoc = scan.nextInt();
            while (selLoc < 0 || selLoc > 5) {
                System.out.println("Please select a valid location.");
                selLoc = scan.nextInt();
            }
            switch (selLoc) {
                case 1:
                    location = new SafeHouse(player);
                    break;

                default:
                    location = new SafeHouse(player);
            }
            if(location.getLocation());{
                System.out.println("Game Over");
                break;
            }
        }
    }
}