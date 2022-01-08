import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;

// Sum each value of array then sum them
public class Smallint {
    public static void main(String args[]){
        int mysum = 0;
        for (String eachval:args){
            mysum+=Integer.parseInt(eachval);



        }
        System.out.println("My sum is" + mysum);
        String[] mystring = {"d","r","e","n"};
        Arrays.sort(mystring);
        System.out.println("Output is " + Arrays.toString(mystring));
        String laststring = Arrays.toString(mystring);
        StringBuffer newbuffer = new StringBuffer(laststring);
        newbuffer.reverse();
        System.out.println("newbuffer" + newbuffer);
        List<String> mylist = Arrays.asList(mystring);
        //mylist.add("e");
        mylist.forEach(System.out::println);
        int one = 1;
        List theArrList = new ArrayList();
        theArrList.add(1);
        theArrList.add(one);
        theArrList.forEach(System.out::println);
        theArrList.get(0);
        System.out.println(theArrList.get(0));
        theArrList.remove(1);
        String oneString = Integer.toString(one);
        TreeMap<Integer, String> mytm = new TreeMap<Integer,String>();
        mytm.put(1,"First Val");
        mytm.put(2,"Second Val");
        Set set = mytm.entrySet();

    }
}
