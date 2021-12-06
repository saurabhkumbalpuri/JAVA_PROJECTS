 

import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the subject 1 mark");
        float p = in.nextFloat();
        System.out.println("Enter the subject 2 mark");
        float c = in.nextFloat();
        System.out.println("Enter the subject 3 mark");
        float m = in.nextFloat();
        System.out.println("Enter the subject 4 mark");
        float e = in.nextFloat();
        System.out.println("Enter the subject 5 mark");
        float h = in.nextFloat();
        float total;
        float average;

        total = p + c + m + e + h;
        average = (float)(total / 5.0);
        if(average>=4) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
