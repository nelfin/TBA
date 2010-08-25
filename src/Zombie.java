
public class Zombie extends Monster {
    public Zombie(int id) {
        super(id);
        this.maxhp = 10;
        this.hp = 10;
        this.strength = 4;
        System.err.println("BRAAAAAAAAINS!");
    }
}
