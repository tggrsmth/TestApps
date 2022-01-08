import java.util.TreeMap;
import java.util.Map;

public class WordNum {
    public static void main(String args[]) {
        int numarray[] = {111, 325, 777888}; //Integer array to run logic on
        //Create treemap to hold character representation of each number and number of each character
        TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
        for (int i : numarray) {
            tm.clear(); //clear the treemap for each entire number array element
            String outputstring = "";//clear outputstring for each number
            String numvalue = Integer.toString(i);
            for (int x = 0; x < numvalue.length(); x++) {
                char mychar = numvalue.charAt(x);
                if (tm.containsKey(mychar)) {
                    int counter = tm.get(mychar);
                    tm.replace(mychar, counter + 1);
                } else {
                    tm.put(mychar, 1);
                }
            }
            //Cycle through each TreeMap entry and determine number of the same digit for each number
            for (Map.Entry<Character, Integer> entry : tm.entrySet()) {
                Character outputchar = entry.getKey();
                Integer outputint = entry.getValue();

                switch (outputchar) {
                    case '1':
                        outputstring += outputint + " One ";
                        break;
                    case '2':
                        outputstring += outputint + " Two ";
                        break;
                    case '3':
                        outputstring += outputint + " Three ";
                        break;
                    case '4':
                        outputstring += outputint + " Four ";
                        break;
                    case '5':
                        outputstring += outputint + " Five ";
                        break;
                    case '6':
                        outputstring += outputint + " Six ";
                        break;
                    case '7':
                        outputstring += outputint + " Seven ";
                        break;
                    case '8':
                        outputstring += outputint + " Eight ";
                        break;
                    case '9':
                        outputstring += outputint + " Nine ";
                        break;
                }

            }
            System.out.println(outputstring);
        }
    }
}
