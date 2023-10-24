import java.util.Scanner;

public class Player {
    private int damage, health, money,rHealthy, armor;
    private String name, cName;
    private Inventory inv;
    Scanner scan = new Scanner(System.in);

    public Player(String name) {

        this.name = name;
        this.inv = new Inventory();
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getDamage() {
        return damage;
    }

    public void selectCharacter() {
        int chaID = chaMenu();
        // Karakter seçimine göre özellikleri ayarla
        if (chaID == 1) {
            cName = "Samurai";
            damage = 10;
            health = 100;
            money = 50;
        } else if (chaID == 2) {
            cName = "Knight";
            damage = 8;
            health = 120;
            money = 40;
        } else {
            cName = "Archer";
            damage = 12;
            health = 80;
            money = 60;
        }
        System.out.println("Karakter: " + getClassName() + "\t Hasar:" + getDamage()+"\t Sağlık" + getHealth() + "\t Para:" + getMoney());
    }

    public int chaMenu() {
        System.out.println("Choose Your Class:");
        System.out.println("1. Class: Samurai");
        System.out.println("2. Class: Knight");
        System.out.println("3. Class: Archer");
        System.out.print("Your Choice: ");
        int chaID = scan.nextInt();

        while (chaID < 1 || chaID > 3) {
            System.out.println("Please Choose a Valid Character: ");
            chaID = scan.nextInt();
        }

        return chaID;
    }

    // Eksik olan metotları burada tanımlamalısınız.

    public int getrHealthy() {
        return rHealthy;
    }

    public void setrHealthy(int rHealthy) {
        this.rHealthy = rHealthy;
    }

    public int getHealth() {
        return health;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return cName;
    }

    public Inventory getInventory() {
        return inv;
    }
}