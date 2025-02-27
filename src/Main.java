import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }
        System.out.println("numbers list size: " + numbers.size());

        List<Integer> divisibleNumbers = numbers.stream()
                .filter(number -> number % 2 == 0 && number % 4 == 0)
                .collect(Collectors.toList());
        System.out.println("Divisible by 2 and 4 list size: " + divisibleNumbers.size());
        System.out.println("Divisible by 2 and 4 list: "+divisibleNumbers);


        List<Integer> oddNumbers = numbers.stream()
                .filter(number -> number % 2 != 0)
                .collect(Collectors.toList());

        int sumOdd = oddNumbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("OddNumbers list size: " + oddNumbers.size());
        System.out.println("SumOdd: " + sumOdd);


        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        int sumEvens = evenNumbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("EvenNumbers list size: " + evenNumbers.size());
        System.out.println("SumEven: " + sumEvens);




//// Stream kullanmadan:
//
//        ArrayList<Integer> divisible_2_4 = new ArrayList<>();
//        for (int i = 0; i < numbers.size(); i++) {
//            if (numbers.get(i) % 2 == 0 && numbers.get(i) % 4 == 0) {
//                divisible_2_4.add(numbers.get(i));
//            }
//        }
//
//        System.out.println("Divisible by 2 and 4 list size: " + divisible_2_4.size());
//        //   System.out.println(divisible_2_4);
//
//        ArrayList<Integer> odd_number = new ArrayList<>();
//        int sum_odd = 0;
//
//        for (int i = 0; i < numbers.size(); i++) {
//            if (numbers.get(i) % 2 != 0) {
//                odd_number.add(numbers.get(i));
//                sum_odd += numbers.get(i);
//            }
//        }
//        System.out.println("odd number list size: " + odd_number.size());
//       System.out.println("Sum odd: " + sum_odd);
//        //    System.out.println(odd_number);
//
//        ArrayList<Integer> even_number = new ArrayList<>();
//       int sum_even = 0;
//
//        for (int i = 0; i < numbers.size(); i++) {
//            if (numbers.get(i) % 2 == 0) {
//                even_number.add(numbers.get(i));
//                sum_even += numbers.get(i);
//            }
//       }
//       System.out.println("even number list size: " + even_number.size());
//        System.out.println("Sum even: " + sum_even);
//       //  System.out.println(even_number);


    }


}