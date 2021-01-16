package alekseytyan;

import alekseytyan.hackerrank.DiagonalDifference;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 1; i <= 9; i+=3) {
            List<Integer> row = new ArrayList<>();
            row.add(i);
            row.add(i+1);
            row.add(i+2);
            arr.add(row);
        }

        System.out.println(DiagonalDifference.diagonalDifference(arr));
    }
}
