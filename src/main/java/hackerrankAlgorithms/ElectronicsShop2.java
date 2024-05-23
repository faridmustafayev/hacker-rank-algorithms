package hackerrankAlgorithms;

public class ElectronicsShop2 {
    public static void main(String[] args) {



    }

    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max = -1;
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                int price = keyboard + drive;
                if (price <= b && price > max)
                    max = price;
            }
        }
        return max;
    }

}
