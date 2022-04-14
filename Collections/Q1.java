import java.util.*;

public class question1 {

    public static void main(String[] args) {
        
       
        List<String> Listarg = Arrays.asList(args);
        Collections.shuffle(Listarg);

        
        Listarg.stream()
        .forEach(e->System.out.format("%s ",e));

        System.out.println("\nUsing enhanced for loop:");
        for (String arg: Listarg) {
            System.out.format("%s ", arg);
        }

        System.out.println();
    }
}