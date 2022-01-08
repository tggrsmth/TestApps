

//find all instances of the substring "la" in the string provided, the string to search is passed in as string args to main

import java.util.ArrayList;

public class StringFound {
    public static void main(String args[]){
        ArrayList<Integer> indexLocation = new ArrayList<Integer>();
        String stringtosearchfor = "la";
        String searchstring = args[0];
        for (int i=0; i<searchstring.length()-2;i++) {
            if (searchstring.substring(i, i + 1).equals("la")) {
                indexLocation.add(i);

            }
        }
        System.out.println(indexLocation);
    }
}
