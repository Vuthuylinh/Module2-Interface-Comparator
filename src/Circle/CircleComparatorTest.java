package Circle;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter circle1 radius: ");
        double radius1=input.nextDouble();
        System.out.println("Enter circle1 color: ");
        String color1=input.next();
        System.out.println("Enter circle2 radius: ");
        double radius2=input.nextDouble();
        System.out.println("Enter circle2 color: ");
        String color2=input.next();
        Circle c1= new Circle(radius1,color1);
        Circle c2= new Circle(radius2,color2);
        Circle [] circles= new Circle[4];
        circles[0]=c1;
        circles[1]=c2;
        circles[2]= new Circle();
        circles[3]= new Circle(3.5,"black");

        System.out.println("Circles list before sort: ");
        for(Circle circle:circles){
            System.out.println(circle);
        }

        Comparator circleComparator= new CircleComparator();
        Arrays.sort(circles,circleComparator);
        System.out.println("After-sorted:");
        for(Circle circle:circles){
            System.out.println(circle.getRadius());
        }


    }
}
