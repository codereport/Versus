// code_report
// 

public class Main {
    
    private static void print(List<String> a) {
        for (String s : a) System.out.print(s + ' ');
        System.out.println();
    }
    
    private static void sort_lambda() {
        List<String> arr = Arrays.asList("bear", "cat", "elephant", "mouse");
        arr.sort((a, b) -> Integer.compare(a.length(), b.length()));
        print(arr);        
    }

    private static void add_lambda() {
        List<Integer> arr = Arrays.asList( 1, 2, 3, 4, 5 );
        int x = arr.stream().reduce(0, (a, b) -> a + b);
        System.out.println(x);
    }
    
    private static void product_lambda() {
        List<Integer> arr = Arrays.asList( 1, 2, 3, 4, 5 );
        int x = arr.stream().reduce(1, (a, b) -> a * b);
        System.out.println(x);
    }
    
    public static void main(String args[]) {
        add_lambda();
        product_lambda();
        sort_lambda();
    }
}
