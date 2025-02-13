import java.util.Random;

public class GenratePassword {

    public static void main(String[] args) {
        int length = 10;
        System.out.println(Geek_Value(length));
    }

    static char[] Geek_Value(int len){
        System.out.println("Genrates Password....");
        System.out.println("Your Password is...");
        String Cap = "ABCDEFGHIJKLMNOPQRSUVQXYZ";
        String Small = "abcdefghijklmnopqrtuvwxyz";
        String number = "0123456789";
        String Symbol = "!@#$%^&*()-";
        String Combine = Cap + Small + number + Symbol;

        Random rd = new Random();

        char[] Password = new char[len];

        for(int i=0; i<len; i++){
            Password[i] =Combine.charAt(rd.nextInt(Combine.length()));
        }
        return Password;

    }
}