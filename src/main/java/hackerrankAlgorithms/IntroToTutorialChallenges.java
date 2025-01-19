package hackerrankAlgorithms;

import java.util.List;

public class IntroToTutorialChallenges {
    public static void main(String[] args) {
        System.out.println(introTutorial(3, List.of(1, 2, 3)));
    }

    public static int introTutorial(int V, List<Integer> arr) {
        int value = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (V == arr.get(i)) {
                value = i;
                break;
            }
        }

        return value;
    }

}
