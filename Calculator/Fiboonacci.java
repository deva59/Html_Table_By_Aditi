package Calculator;

public class Fiboonacci {
    public static void main(String[] args) {
        int a=0,b=1,num=5;
        while(num!=0){
            System.out.println(a);
            int temp=a+b;
            a=b;
            b=temp;

        }
    }
}
