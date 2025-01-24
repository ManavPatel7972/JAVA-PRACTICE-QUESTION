public class ShortestPath {
    public static double shortPath(String path) {

        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {

            char direction = path.charAt(i);

            // south
            if (direction == 'S') {
                y--;
            } else if (direction == 'N') {
                y++;
            } else if (direction == 'W') {
                x--;
            } else if (direction == 'E') {
                x++;
            }

        }

        return Math.sqrt((x*x)+(y*y));
    }

    public static void main(String argd[]) {

        String path = "WNEENESENNN";

        System.out.println("Shortest Disatne is = " + shortPath(path));
    }
}


