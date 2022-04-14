import java.util.*;
import java.util.stream.Collectors;

class Question3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> originalString= new ArrayList<String>();
        System.out.println("Enter number of inputs:");
        int counter = sc.nextInt();
        // taking list of strings as input
        System.out.println("Enter sentence:");
        while(counter >=0 ){
            originalString.add(sc.nextLine());
            counter--;
        }
        System.out.println("Before trim: "+originalString);

        // trmming strings to remove white spaces

        List<String> trimmedString =
                originalString.stream().map(String::trim).collect(Collectors.toList());
        System.out.println("After trim: "+trimmedString);
    }
}