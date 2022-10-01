package que3;

import java.util.stream.IntStream;

public class Source {

    public static void main(String[] args) {
        IntStream.rangeClosed(1,5).forEach(e->System.out.printf(e+" "));
        System.out.println();
        IntStream.range(1,5).forEach(e->System.out.printf(e+" "));
    }

}
