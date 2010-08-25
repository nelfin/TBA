
public class Monster {
        int hp;
        int maxhp;
        int strength;
        Actor actor;
        Inventory inventory;
        int id;

        public Monster(int id) {
            this.id = id;
        }

        public boolean move(){
                return true;
        }

        public boolean attack(){
                return true;
        }
}
