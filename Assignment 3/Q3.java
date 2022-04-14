import java.util.*;
 
class question3 {

    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(10,20,30,40,50,60,70,80,90,100);
        System.out.println("for loop:");
        for (int i = 0; i < numbers.size(); i++)
            System.out.print(numbers.get(i) + " ");

        System.out.println("\n while loop:");
        int i = 0;
        while (i < numbers.size())
            System.out.print(numbers.get(i++) + " ");

        System.out.println("\n advance for loop:");
        for (Integer num : numbers)
            System.out.print(num + " ");
    }
}