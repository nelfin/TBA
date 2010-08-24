public class TestLevel {
    public static void main(String args[]) {
        Level debug_level = Level.debug_map();
        for (int i = 0; i < debug_level.xdim; i++) {
            for (int j = 0; j < debug_level.ydim; j++) {
                System.out.print(debug_level.map[i][j] < 0 ? "." : "Z");
            }
            System.out.println();
        }
    }
}

