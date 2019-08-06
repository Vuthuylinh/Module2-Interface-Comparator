import java.util.Arrays;
import java.util.Comparator;

public class SquareComparatorTest {
    public static void main(String[] args) {
        Square square0= new Square();
        Square square1= new Square(9);
        Square square2= new Square(4);
        Square square3= new Square(12);
        Square[]squares= new Square[4];
        squares[0]=square0;
        squares[1]=square1;
        squares[2]=square2;
        squares[3]=square3;


        System.out.println("Square list before sorted: ");
        for(Square square:squares){
            System.out.println(square.getSide());
        }
        Comparator squareComparator = new SquareComparator();
        Arrays.sort(squares,squareComparator);

        System.out.println("Square list after sorted: ");
        for(Square square:squares){
            System.out.println(square.getSide());
        }
    }
}
