package hackerrankAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class FunnyString {
    public static void main(String[] args) {

        System.out.println(funnyString("bcxz"));

    }

    public static String funnyString(String s) {

        String result = "";

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        for (int index = 0; index < s.length(); index++) {
            list1.add((int) s.charAt(index));
        }

        StringBuilder builder = new StringBuilder(s);
        builder.reverse();

        for (int index = 0; index < builder.length(); index++) {
            list2.add((int) builder.charAt(index));
        }


        for (int index = 0; index < s.length(); index++) {
            int res = index;
            for (int i = ++res; i < builder.length(); i++) {

                if (Math.abs(list1.get(index) - list1.get(res)) == Math.abs(list2.get(index) - list2.get(res))) {
                    result += "Funny";
                }else {
                    result += "Not Funny";
                }

                break;
            }

            if (result.contains("Not")) {
                result = "Not Funny";
            }else {
                result = "Funny";
            }

        }

        return result;
    }

}