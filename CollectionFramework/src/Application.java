import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {


    public static void main(String[] args) {


        int[] num = {1,3,5,7,9};

        found : {
            for (int nums : num){
                if (nums==5)
                    break found;
            }
            throw new AssertionError("5 not found");
        }
        System.out.println("all ok");
//        int j=0;
//        List<String> vowels = new ArrayList<>();
//
//
//        System.out.println("Size of the arraylist " +vowels.size());
//
//        vowels.add("a");
//        vowels.add("e");
//        vowels.add("i");
//        vowels.add("o");
//        vowels.add("u");
//
//        System.out.println("Size of the arraylist " +vowels.size());
//
//        vowels.remove(3);
//
//        System.out.println("Size of the arraylist " +vowels.size());
//
//        for(String vowel:vowels){
//            System.out.println();
//        }


//        Map<String,Integer> marks = new HashMap<>();
//
//        marks.put("Bhagya",89);
//        marks.put("Madara",90);
//        marks.put("chathu",95);
//
//        for (Map.Entry<String,Integer> mark :marks.entrySet()){
//            System.out.println(mark.getKey() + " " +mark.getValue());
//        }
//    }

//    Printer p = new Printer();
//    p.start();
//        while(j< 100){
//            System.out.println("main" +j);
//            j++;
//        }

    }


}
