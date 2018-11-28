// code_report
// 

import java.util.Arrays;
import java.util.List;

public class Main { 
    public static void main(String args[]) {
        List<String>  x = Arrays.asList("bear", "cat", "elephant", "mouse");
        List<Integer> y = Arrays.asList( 1, 2, 3, 4, 5 );
        x.sort((a, b) -> Integer.compare(a.length(), b.length()));
        System.out.println(x);      
        System.out.println(y.stream().reduce(0, (a, b) -> a + b));
        System.out.println(y.stream().reduce(1, (a, b) -> a * b));
    }
}
