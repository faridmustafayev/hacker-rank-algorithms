package hackerRank;

public class CatsAndMouse {
    public static void main(String[] args) {

        System.out.println(catAndMouse(2, 7, 4));

    }

    public static String catAndMouse(int x, int y, int z) {

        String name = null;

        if ((x <= 100 && x >= 1) && (y <= 100 && y >= 1) && (z <= 100 && z >= 1)) {

            if (z > x && z > y) {

                if (z - x < z - y) {
                    name = "Cat A";
                } else {
                    name = "Cat B";
                }

            } else if (z < x && z < y) {

                if (x - z < y - z) {
                    name = "Cat A";
                } else {
                    name = "Cat B";
                }

            } else if (y > z && x < z) {

                if (y - z < z - x) {
                    name = "Cat B";
                } else if (y - z == z - x) {
                    name = "Mouse C";
                } else {
                    name = "Cat A";
                }

            } else if (y == z || x == z) {

                if (y == z) {
                    name = "Cat B";
                } else {
                    name = "Cat A";
                }
            } else {

                if (x - z < z - y) {
                    name = "Cat A";
                } else if (x - z == z - y) {
                    name = "Mouse C";
                } else {
                    name = "Cat B";
                }

            }

            if (x == z && y == z) {
                name = "Mouse C";
            }
        }

        return name;
    }

}
