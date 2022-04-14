import java.util.*;

class Question1{
    public static void main(String args[]){
        
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Abhi", 30);
        map.put("Prashasti", 20);
        map.put("Shaswat", 15);
 
        //Iterate using advanced for
        System.out.println("Iteration using advanced for loop:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	        System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        //Iterate using while loop
        System.out.println("\nIteration using while loop:");
        Iterator  it = map.entrySet().iterator();
        while(it.hasNext()){
            HashMap.Entry record = (HashMap.Entry)it.next();
            System.out.println(record.getKey() + " = "+ record.getValue());
        }
    }
}