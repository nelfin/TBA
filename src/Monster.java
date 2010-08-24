
public class Monster {
	int hp;
	int maxhp;
	int strength;
	Actor actor;
	Inventory inventory;
	
        public Monster() {
        }

	public boolean move(){
		return true;
	}
	
	public boolean attack(){
		return true;
	}
}
