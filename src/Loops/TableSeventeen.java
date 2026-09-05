package Loops;

public class TableSeventeen {
    public static void main(String[] args) {

//        Method 1:
//        154 iteration hain loop ke
        for(int i = 17; i<=170; i=i+1){
            if (i % 17== 0) System.out.print(i+" ");
            }

// Method 2:
//        10 iteration hain loop ke
        for (int j =17; j<=170; j=j+17){
            System.out.print(j+" ");
        }

//        Method 3:
          for (int k =1; k<=10; k=k+1){
          System.out.print(k*17+" ");
        }
    }
}
