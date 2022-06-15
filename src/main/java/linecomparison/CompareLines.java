package linecomparison;

import java.util.Scanner;

public class CompareLines {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double x1,x2,y1,y2,x3,y3,x4,y4;
        int line1,line2;
        //first line
        System.out.println("enter x1 & y1 values of first point");
        x1=sc.nextDouble();
        y1=sc.nextDouble();

        System.out.println("enter x2 & y2 values of second point");
        x2=sc.nextDouble();
        y2=sc.nextDouble();

        line1=(int)Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Distance of first line = "+line1);
        //second line
        System.out.println("enter x3 & y3 values of third point");
        x3=sc.nextDouble();
        y3=sc.nextDouble();

        System.out.println("enter x4 & y4 values of fourth point");
        x4=sc.nextDouble();
        y4=sc.nextDouble();

        line2=(int)Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        System.out.println("Distance of second line = "+line2);

        //comparing lines
        if (line1 == line2)
            System.out.println("both lines are equal");
        else if (line1 > line2)
            System.out.println("line1 is greater");
        else
            System.out.println("line2 is greater");

    }
}
