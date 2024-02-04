package JD10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,5,6));
        ArrayList<Integer>newlist=new ArrayList<>(list);

        newlist.removeIf(p->Collections.frequency(newlist,p)>1);
        System.out.println(newlist);
    }
}
