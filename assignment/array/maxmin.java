package newtonschool.assignment.array;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class maxmin {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
    	System.out.println("Reading number of test cases from custom input");
		int T = sc.nextInt();
		int Arraylength[] = new int[T];
		int min[] = new int[T];
		int max[] = new int[T];
		for (int i=0;i<T;i++)
		{
			System.out.println("Taking array "+i+" Length");
			Arraylength[i] = sc.nextInt();
			System.out.println("Reading number for array "+i);
			int arr[] = new int[Arraylength[i]];
			for (int k=0;k<Arraylength[i];k++)
			{
				arr[k] = sc.nextInt();
			}
			int minel = arr[0];
			for (int l=1;l<arr.length;l++)
			{
				if (arr[l]<minel)
				{
					minel = arr[l];
				}
			}
			min[i] = minel;
			int maxel = arr[0];
			for (int l=1;l<arr.length;l++)
			{
				if (arr[l]>maxel)
				{
					maxel = arr[l];
				}
			}
			max[i] = maxel;	
		}
		for (int m=0;m<min.length;m++)
		{
			System.out.println(max[m]+ " "+ min[m]);
		}
	}
}
