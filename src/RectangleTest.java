import java.util.Arrays;
import java.util.Comparator;

public class RectangleTest  {
    public static void main(String[] args) {
        Rectangle rectangle0= new Rectangle();
        Rectangle rectangle1= new Rectangle(5,4);
        Rectangle rectangle2 = new Rectangle(9,5);
        Rectangle rectangle3= new Rectangle(4,2);
        Rectangle[]rectangles= new Rectangle[4];
        rectangles[0]=rectangle0;
        rectangles[1]=rectangle1;
        rectangles[2]=rectangle2;
        rectangles[3]=rectangle3;
        System.out.println("Rectangle list before sorted:");
        for(int i=0; i<rectangles.length;i++){
            System.out.println(rectangles[i]);
        }
        Comparator rectangleComparator= new RectangleComparator();
        Arrays.sort(rectangles,rectangleComparator);
        System.out.println("Rectangle list after sorted:");
        for(int i=0; i<rectangles.length;i++){
            System.out.println(rectangles[i]);
        }
    }


}
