package Forms;

import java.util.Random;

public class passgen {
    public static void main(String[] args) {
        int length = 10;
        System.out.println(geek(length));
    }

    static char[] geek(int len){
        System.out.println("Genrate pass");
        System.out.println("Your pass");
        String cap = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String sam = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String sym = "!@#$%^&*()><";
        String combine = cap+sam+num+sym;

        Random r = new Random();
        char[] pass = new char[len];

        for(int i=0; i<len; i++){
            pass[i] = combine.charAt(r.nextInt(combine.length()));
        }
        return pass;
    }
}
