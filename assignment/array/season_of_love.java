package newtonschool.assignment.array;

import java.util.Scanner;

public class season_of_love {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int number_of_roses = sc.nextInt();
        int yellow_roses = 0;
        yellow_roses += number_of_roses/3;
        if (number_of_roses%3==2)
        {
            yellow_roses += 1;
        }
        System.out.println(yellow_roses);
    }
}
