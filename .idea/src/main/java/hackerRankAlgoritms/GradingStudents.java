package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {

        System.out.println(gradingStudents(Arrays.asList(73, 67, 38, 33)));
        
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {

        int a = 0;

        List<Integer> list = new ArrayList<>();

        for (int index = 0; index < grades.size(); index++) {

            a = grades.get(index);

            if (grades.get(index) >= 40) {

                if ((grades.get(index) % 5) != 0) {
                    a += (5 - a % 5);

                    if (a - grades.get(index) > 0 && a - grades.get(index) < 3) {

                    }
                    else {
                       a = grades.get(index);
                    }
                }

            }
            else {
                if (grades.get(index) >= 38) {
                    a = 40;
                }
                else {
                    a = grades.get(index);
                }

            }

            list.add(a);

        }

        return list;

    }

}
