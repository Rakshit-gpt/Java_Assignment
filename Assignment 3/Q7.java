import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.stream.Collectors;
public class question7 {

    public static void main(String[] args) {
        String str="heleyu5ilooqqrqwfqb";
        Map<Character, Long> collect =  str.chars().mapToObj(i -> (char)i).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        Optional<Character> firstNonRepeat = collect.entrySet().stream().filter( (e) -> e.getValue() == 1).map(e -> e.getKey()).findFirst();
        if(firstNonRepeat.isPresent()) {
            System.out.println("First non-repeating:" + firstNonRepeat.get());
        }
        else{
            System.out.println("Every Character is repeating");
        }
    }
}