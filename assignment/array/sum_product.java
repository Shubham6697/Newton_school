package newtonschool.assignment.array;
import java.util.*;
public class sum_product {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        int sum_of_even_index=0,product_of_odd_index=1;
        for (int i=0;i<len;i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<len;i++)
        {
            if (i%2==0)
            {
                product_of_odd_index *= arr[i];
            }
            else
            {
                sum_of_even_index += arr[i];
            }
        }
        System.out.println(sum_of_even_index+" "+product_of_odd_index);
    }
}
