package lab2.Task3;

import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class StringArr {
    public static void main(String[] args) {
        String[] array = new String[] {"a", "b", "c", "d", "e"};
        List<String> arr = new ArrayList<String> (Arrays.asList(array));
        System.out.println(arr);
        for(int i=0, j=arr.size()-1; i<j ; i++, j--) {
                Collections.swap(arr,i, j);
        }
        System.out.println(arr);
    }
}
