
//Find the first uppercase letter in a string
public class FirstLetterUpper {
    public static void main(String args[]) {
        String value = "tesT";
        System.out.println(uppercaseFirst(value));


    }

    public static String uppercaseFirst(String s) {
        String returnstr = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
        return returnstr;
    }
}