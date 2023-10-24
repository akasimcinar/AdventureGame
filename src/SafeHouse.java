public class SafeHouse extends NormalLoc{

    SafeHouse (Player player, String name) {
        super(player, "Safe House");

    }

    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    public boolean getLocation(){
        player.setrHealthy(player.getrHealthy());
        System.out.println("Your health has been restored.");
        System.out.println("You've entered a safe house.");
        return true;
    }
}
