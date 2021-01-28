package alekseytyan;

import alekseytyan.hackerrank.datastructures.ArraysDS;
import alekseytyan.hackerrank.datastructures.TwoDArraysDS;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] sample = {{1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,0,2,4,4,0},
                {0,0,0,2,0,0},
                {0,0,1,2,4,0}};

        System.out.println(TwoDArraysDS.hourglassSum(sample));
    }
}
