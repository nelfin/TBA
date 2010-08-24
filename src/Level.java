import java.util.ArrayList;
import java.util.HashMap;

public class Level {
	static final int xdim = 20;
	static final int ydim = 20;
	int map[][];
	ArrayList<Monster> monsters;
        HashMap<Integer,Object> gazetteer;

        public Level() {
            map = new int[xdim][ydim];
            for (int i = 0; i < xdim; i++) {
                for (int j = 0; j < ydim; j++) {
                    map[i][j] = -1;
                }
            }
            monsters = new ArrayList<Monster>();
            gazetteer = new HashMap<Integer,Object>();
        }

        // TODO: figure out player API
        static Level debug_map() {
            Level level = new Level();
            //level.map = int map[xdim][ydim];
            //level.map[0][0] = player;
            for (int i = 4; i < 8; i++) {
                for (int j = 4; j < 8; j++) {
                    Monster zombie = new Zombie();
                    level.monsters.add(zombie);
                    level.gazetteer.put(i+j*ydim,zombie);
                    level.map[i][j] = i + j*ydim;
                }
            }
            return level;
        }
}
