package hackerrankAlgorithms;

import java.util.Arrays;
import java.util.List;

public class DesignerPDFViewer {
    public static void main(String[] args) {

        System.out.println(designerPdfViewer(
                List.of(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5),
                "aybc")
        );

    }

    public static int designerPdfViewer(List<Integer> h, String word) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int max = 0;
        int length = word.length();

        for (int i = 0; i < length; i++) {
            char curr = word.charAt(i);

            for (int j = 0; j < alpha.length(); j++) {
                char cu = alpha.charAt(j);

                if (curr == cu) {
                    if (h.get(j) > max) {
                        max = h.get(j);
                    }
                }
            }
        }

        return length * max;
    }

}
