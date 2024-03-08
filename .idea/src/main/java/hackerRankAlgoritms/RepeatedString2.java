package hackerRank;

public class RepeatedString2 {
    public static void main(String[] args) {

        System.out.println(repeatedString("ojowrdcpavatfacuunxycyrmpbkvaxyrsgquweh" +
                "hurnicgicmrpmgegftjszgvsgqavcrvdtsxlkxjpqtlnkjuyraknwxmnthfpt", 685118368975L));

    }

    public static long repeatedString(String s, long n) {

        long counter = 0;
        int length = s.length();

        for (int index = 0; index < s.length(); index++) {

            if (s.charAt(index) == 'a') {
                counter++;                   // 6
            }

        }

        if (n % s.length() == 0) {

            counter *= (double) n / length;

        }else {                         // counter = 6;

            int d = 0;
            long remain = n % length;    // 75

            String m = s.substring(0, (int) remain);  //

            for (int index = 0; index < m.length(); index++) {
                if (m.charAt(index) == 'a') {
                    d++;    // 5
                }
            }

            System.out.println(n / length);

            counter =  ((counter * (n / length)) + d);

        }


        return counter;
    }

}
