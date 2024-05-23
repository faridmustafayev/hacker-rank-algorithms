package hackerrankAlgorithms;

import java.util.List;

public class SubarrayDivision2 {
    public static void main(String[] args) {



    }

    public static int birthday(List<Integer> s, int d, int m) {
        int result = 0;
        int length = s.size();
        for (int i = 0; i < length; i++) {
            int sum = s.get(i);
            int len = 1;
            if (sum == d && len == m){
                result++;
                continue;
            }
            while (i + len < length) {
                sum += s.get(i + len);
                len++;
                if (sum == d && len == m) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }

}
