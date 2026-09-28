import java.util.Arrays;

public class StramAPI {

    public static void main(String[] args) {
        System.out.println("Stream API example");

        java.util.List<String> evenNums=Arrays.asList("51", "66", "96", "28", "43", "84", "12");
       String evenNumbers = evenNums.stream()
                .filter(num -> Integer.parseInt(num) % 2 == 0)
                .sorted()
                .collect(java.util.stream.Collectors.joining(", "));
        System.out.println("Even numbers: " + evenNumbers);
    }
    
}
