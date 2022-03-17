import java.util.*;

public class Solution_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int count=0;
        int i,j,sum = 0;
        for(i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        scan.close();
        for(i=0;i<n;i++)
        {
            sum = 0;
            for(j=i;j<n;j++)
            {
                sum = arr[j] + sum;
                if(sum<0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

