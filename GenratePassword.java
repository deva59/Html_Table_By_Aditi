import java.util.Random;

public class GenratePassword {

    public static void main(String[] args) {
        int length = 10;
        System.out.println(Geek_Value(length));
    }

    static char[] Geek_Value(int len){
        System.out.println("Genrate Password.....");
        System.out.println("Your Password Is....");
        String Capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small ="abcdefghijklmnopqrstuvwxyz";
        String Number = "0123456789";
        String Symbol = "!@#$%^&*()_";
        String Combine = Capital+Small+Number+Symbol;

        Random rd = new Random();
        char[]password = new char[len];

        for(int i=0;i<len;i++){
            password[i] = Combine.charAt(rd.nextInt(Combine.length()));
        }
        return password;
    }
}