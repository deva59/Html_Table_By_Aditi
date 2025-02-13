//Genrate Odd Numbers Which Are Divisible by 5 And Greterthan 100 and Lessthan 150.

package Calculator;

public class GenOddNUmbers {
    //Logic First..
    // public static void main(String[] args) {
    //     for(int i=0;i<150;i++){
    //         if(i>100 && i<500){
    //         if(i%5==0){
    //             System.out.println( i);
    //         }
    //     }
    //     }
    // }


    //Same Second
    public static void main(String[] args) {
    // for(int i=0;i<500;i++){
    //     if(i>100 && i<500){
    //         if(i%5==0){
    //             System.out.println(i);
    //         }
    //     }
    // }


    for(int i=100;i<=150;i=i+5){
        System.out.println(i);
    }

    }
}
