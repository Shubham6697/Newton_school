package newtonschool.assignment.array;
import java.util.*;
public class max3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int k=0;k<T;k++)
        {
        int len,first,second,third;
        do{
            len = sc.nextInt();
        }while(len < 3);
        int a[] = new int[len];
        for (int i=0;i<len;i++)
        {
            a[i] = sc.nextInt();
        }
        first = second = third = Integer.MIN_VALUE;
        for (int j=0;j<len;j++)
        {
            if (a[j] > first)
            {
                third = second;
                second = first;
                first = a[j];
            }
            else if (a[j] > second)
            {
                third = second;
                second = a[j];
            }
            else if (a[j] > third)
            {
                third = a[j];
            }
        }
        System.out.println(first + " " + second + " " + third);
        }
    }
}
