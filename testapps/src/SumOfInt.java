import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfInt {
    public static void  main(List<Integer> mylist){
        //put the remainder after Modulus operation when dividing by 60 in a Hashmap
        // where the key is the remainder and the number of remainders of the same amount as the Hashmap value
        int remainder;
        int counter = 0;
        int countofsongs = 0;
        int addremainder;
        int remainderkey;
        int remaindercount;
        HashMap<Integer,Integer> tm=new HashMap<Integer,Integer>();
        for (int i=0;i<mylist.size();i++){
            remainder = mylist.get(i)%60;
            if (tm.containsKey(remainder)) {
                counter = tm.get(remainder);
                tm.replace(remainder, counter + 1);
            } else {
                tm.put(remainder, 1);
            }
        }
        //next use a for loop to go through each key in the Hashmap and multiply
        //the number of values where two remainders equal 60

        for (Map.Entry<Integer, Integer> entry : tm.entrySet()) {
            remainderkey = entry.getKey();
            remaindercount = entry.getValue();
            addremainder = 60-remainderkey;
            if (tm.containsKey(addremainder)){
                countofsongs+=tm.get(addremainder) * remaindercount;
            }



        }
    System.out.println(countofsongs);
    }
}
