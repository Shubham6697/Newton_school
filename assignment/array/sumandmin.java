package newtonschool.assignment.array;
import java.util.*;
public class sumandmin {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        int sum=0;
        for (int i=0;i<len;i++)
        {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println(sum + " "+ (sum/len));
    }
}
