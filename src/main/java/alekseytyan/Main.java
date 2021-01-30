package alekseytyan;

import alekseytyan.codewars.PaginationHelper;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PaginationHelper<Integer> helper = new PaginationHelper<>(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9)), 4);

        helper.pageIndex(3);
        helper.pageItemCount(3);

    }
}
