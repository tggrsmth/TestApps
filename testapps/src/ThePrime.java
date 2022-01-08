
//find the prime number
public class ThePrime {
    public static void main (String args[]){
        //check which passed in args are prime, use a for loop to cycle through args first converting to int then
        //using a second for loop to use modulus operator to determine if 2 to square root of val is divisible without remainder
        int myprime;
        String primeoutput="";
        boolean prime;
        for(String val:args){
            myprime=Integer.valueOf(val);
            prime=false;
            for (int i=2;i<myprime;i++){
                if (myprime%i==0){
                    //myprime arg is a prime
                    prime=true;
                    break;
                }
            }
            if (prime==false) {
                primeoutput += myprime + ",";
            }
        }
        System.out.println(primeoutput);
    }
}
