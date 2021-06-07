package newtonschool.assignment.array;
import java.util.*;
public class replaceelearray {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for (int i=0;i<len;i++)
        {
            arr[i] = sc.nextInt();
        }
        int b[] = new int[len];
        for (int i=0;i<len;i++)
        {
            if (i==0)
            {
                b[i] = arr[i]*arr[i+1];
            }
            else if(i>0 && i<(len-1))
            {
                b[i] = arr[i-1]*arr[i+1];
            }
            else if (i==len-1) {
                b[i] = arr[i-1]*arr[i];
            }
        }
        for (int i:b)
        {
            System.out.print(i+" ");
        }
    }
}
