import java.util.Scanner;

public class ToolStore extends NormalLoc {
    Scanner scan = new Scanner(System.in);

    public ToolStore(Player player) {
        super(player, "Shop");
    }


    public boolean onEnter() {
        System.out.println("Welcome to the shop!");
        System.out.println("Money: " + player.getMoney());
        System.out.println("1. Weapons");
        System.out.println("2. Armors");
        System.out.println("3. Exit");
        System.out.print("Your choice: ");
        int selTool = scan.nextInt();
        int selItemID;
        switch (selTool) {
            case 1:
                selItemID = weaponMenu();
                buyWeapon(selItemID);
                break;
            case 2:
                // Armor menu (not implemented yet)
                break;
            default:
                break;
        }
        return true;
    }


    public int armorMenu() {
        System.out.println("1. Chains: Price 25 - Damage 2");
        System.out.println("2. Steel: Price 35 - Damage 3");
        System.out.println("3. Aedamantium: Price 45 - Damage 7");
        System.out.println("4. Cancel");
        System.out.print("Choose An armor: ");
        int selArmorID = scan.nextInt();
        return selArmorID;
    }


    public int weaponMenu() {
        System.out.println("1. Pistol: Price 25 - Damage 2");
        System.out.println("2. Sword: Price 35 - Damage 3");
        System.out.println("3. Rifle: Price 45 - Damage 7");
        System.out.println("4. Cancel");
        System.out.print("Choose a weapon: ");
        int selWeaponID = scan.nextInt();
        return selWeaponID;
    }

    public void buyArmor(int itemID) {
        int damage = 0, price = 0;
        String wName = null;
        if (itemID >= 1 && itemID <= 3) {
            switch (itemID) {
                case 1:
                    damage = 2;
                    wName = "Chain";
                    price = 25;
                    break;
                case 2:
                    damage = 3;
                    wName = "Steel";
                    price = 35;
                    break;
                case 3:
                    damage = 7;
                    wName = "Aedamantium";
                    price = 45;
                    break;
                default:
                    System.out.println("Invalid transaction");
                    break;
            }
        }
        if (price > 0) {
            if (player.getMoney() >= price) {
                player.getInventory().setArmor(damage);
                player.getInventory().setwName(wName);
                System.out.println("You got a new Armor, Armor: " + player.getArmor());
            } else {
                System.out.println("You don't have enough money!");
            }
        }
    }

    public void buyWeapon (int itemID){
        int damage = 0, price = 0;
        String wName = null;
        if (itemID >= 1 && itemID <= 3) {
            switch (itemID) {
                case 1:
                    damage = 2;
                    wName = "Pistol";
                    price = 25;
                    break;
                case 2:
                    damage = 3;
                    wName = "Sword";
                    price = 35;
                    break;
                case 3:
                    damage = 7;
                    wName = "Rifle";
                    price = 45;
                    break;
                default:
                    System.out.println("Invalid transaction");
                    break;
            }
        }
        if (price > 0) {
            if (player.getMoney() >= price) {
                player.getInventory().setDamage(damage);
                player.getInventory().setwName(wName);
                System.out.println("You got a new gun, Damage: " + player.getDamage());
            } else {
                System.out.println("You don't have enough money!");
            }
        }
    }
}

