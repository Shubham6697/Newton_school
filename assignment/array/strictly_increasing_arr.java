import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for (int i=0;i<len;i++)
        {
            arr[i] = sc.nextInt();
        }
        // consider that first element should be replaced by one 
        arr[0] = 1;
        boolean flag=false;
        int start=2;
        for (int i=1;i<len;i++)
        {
            if (i<len-1)
            {
                if ((arr[i] > arr[i-1]) && (arr[i] < arr[i+1]))
                {
                    continue;
                }
                else
                {
                    for (int k=start;k<=arr[i]/2;k++)
                    {
                        if ((arr[i]%k==0) && ((k>arr[i-1]) && k<arr[i+1]))
                        {
                                arr[i] = k;
                                start=k+1;
                                flag=false;
                                break;
                        }
                        else
                        {
                            flag=true;
                            break;
                        }
                    }
                }
            }
            else
            {
                if ((arr[i] >= arr[i-1]))
                {
                    break;
                }
                else 
                {
                    flag=true;
                }
            }
        }
        if (flag==true)
        {
            System.out.println("No");
        }
        else if (flag==false)
        {
            System.out.println("Yes");
        }
    }
}