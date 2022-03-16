import java.util.Scanner;

public class Starpattern {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Right Angled Triangle Pattern Rows = ");
        int rows = sc.nextInt();

        System.out.println("Printing Right Angled Triangle Star Pattern");

        for (int i = 1; i <=rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=rows;i>0;i--)
        {
            for(int j=rows-i;j>0;j--)

            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)

            {
                System.out.print("*");
            }
            System.out.println();
        }
}
}



