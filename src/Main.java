import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int sideLength = 4;
        int sideLength1 = 5;
        Point point = new Point(1,8);
        Point point1 = new Point(3,9);
        Square square = new Square(point, sideLength);
        System.out.println(square);

        square.changeSquare(point1, sideLength1);
        System.out.println(square);
    }
}