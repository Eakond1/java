import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
      Scanner in = new Scanner(System.in);
      double x = in.nextDouble();
      double y = in.nextDouble();
        if(x * x + y * y >4 && y < x && x<2){
            System.out.println("YES");
        }
       else {
            System.out.println("NO");
        }

    }
}