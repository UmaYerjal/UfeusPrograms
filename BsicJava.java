package UfeusPrograms;
public class BsicJava {
    public static void main(String[] args) {
        // 0 - 000
        // 1- 001
        // 2 - 010
        // 3 - 011
        // 4 - 100
        // 5 - 101
        // 6- 110
        // 7 - 111
        // 8 - 1000
        // 9 - 1001

         int a = 20;
         if((a & 1) == 1){
            System.out.println("Odd Number");
         }else{
            System.out.println("Even Number");
         }

    }
}
