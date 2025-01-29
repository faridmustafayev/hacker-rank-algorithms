package hackerrankAlgorithms;

public class BeautifulBinaryString {
    public static void main(String[] args) {
        System.out.println(beautifulBinaryString("0100101010"));
    }

    public static int beautifulBinaryString(String b) {
        int sum = 0;
        for (int i = 0; i <= b.length() - 3; i++) {
            if (b.startsWith("010", i)) {
                sum++;
                i += 2;
            }
        }
        return sum;
    }

}
