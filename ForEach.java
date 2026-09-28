

import java.util.List;
public class ForEach {
    public static void main(String[] args) {
       

        String[] fruits = {"Apple", "Banana", "Cherry", "Grape", "orange", "Mango"};
        java.util.Arrays.sort(fruits);

        List<String> fruitList = java.util.Arrays.asList(fruits);

        System.out.println("Fruit list: " + fruitList);
        
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("using forEach method to print fruit list");
        fruitList.forEach(fruit -> System.out.println(fruit));

        //enhancement for even odd number logics on given array elements
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] numbers2 = {19, 22, 83, 54,35, 66, 17, 88, 49, 10};
        sortNumbers(numbers2);
        printEvenOdd(numbers);
    }
    public static void sortNumbers(int[] numbers) {
        java.util.Arrays.sort(numbers);
        System.out.println("Sorted numbers: " + java.util.Arrays.toString(numbers));
    }  

    public static void printEvenOdd(int[] numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }
        }
    }
}