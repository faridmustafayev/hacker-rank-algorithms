package hackerrankAlgorithms;

public class StrongPassWord {
    public static void main(String[] args) {

        System.out.println(minimumNumber(3, "Ab1"));

    }

    public static int minimumNumber(int n, String password) {

        int value = 0;

        int result = 0;

        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";

        if (password.equals(password.toLowerCase()) || password.equals(password.toUpperCase())) {



        }else  {

            label: for (int i = 0; i < password.length(); i++) {
                for (int j = 0; j < numbers.length(); j++) {

                    if (password.charAt(i) == numbers.charAt(j)) {
                        value++;
                        break label;
                    }
                }
            }

            if (value == 1) {

                label2: for (int i = 0; i < password.length(); i++) {
                    for (int j = 0; j < special_characters.length(); j++) {

                        if (password.charAt(i) == special_characters.charAt(j)) {
                            value++;
                            break label2;
                        }

                    }
                }

            }else {

                result++;

            }


            if (value == 2) {

                if (password.length() < 6) {

                }

            }else {
                result++;
            }


        }

        return 0;
    }

}
