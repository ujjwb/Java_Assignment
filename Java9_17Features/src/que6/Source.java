package que6;

import java.util.stream.*;
import java.util.*;

public class Source {
    public static void main(String[] args) {
        List<Integer> intList=Arrays.asList(1,2,3,4,5,6,7,8,9);
        intList.stream().takeWhile(e->e<7).forEach(System.out::println);
    }
}
