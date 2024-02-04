package JD10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximumAndMinimumNumbers {
    public static void main(String[] args) {
        ArrayList<Integer>list =new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("Minimum Number= "+ Collections.min(list));
        System.out.println("Maximum Number=" +Collections.max(list));
    }
}
