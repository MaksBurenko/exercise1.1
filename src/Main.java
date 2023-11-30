import java.util.*;

public class Main {

    public static void main(String[] args) {
        long m = System.currentTimeMillis();
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int i=0;
        int result;

 //       Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner("100 10 12 1");
        while (scanner.hasNext() && i < 4){

            switch (i){
                case 0:
                    a=scanner.nextInt();
                case 1:
                    b=scanner.nextInt();
                case 2:
                    c=scanner.nextInt();
                case 3:
                    d=scanner.nextInt();
            }
            i++;
        }
        if(b>=d){
             result = a;
        }else{
             result = a + (d - b) * c;
        }
        System.out.println("result = " + result);
        System.out.println((double) (System.currentTimeMillis() - m));
    }
}