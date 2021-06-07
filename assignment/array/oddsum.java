package newtonschool.assignment.array;
import java.util.*;
public class oddsum {
    public static void main(String k[])
    {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int a[] = new int[len];
        int oddsum = 0;
        for (int i=0;i<len;i++)
        {
            a[i] = sc.nextInt();
            if (a[i]%2 != 0)
            {
                oddsum += a[i];
            }
        }
        System.out.println(oddsum);
    }
}
