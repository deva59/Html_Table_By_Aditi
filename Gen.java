import java.util.Random;

public class Gen {

    public static void main(String[] args) {
        int length = 10; 
        System.out.println(g(length));
    }
    static char[] g(int len){
        String c = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String s = "ajndfoisdhdfivslvmsvkkposvm";
        String sm = "!@#$%^&*()"  ;
        String n = "011233456789";
        String cm = c+s+sm+n;
        
        Random rd = new Random();
        char[] pass = new char[len];

        for(int i=0; i<len; i++){
            pass[i] = cm.charAt(rd.nextInt(cm.length()));
        }
        return pass;
    }
}