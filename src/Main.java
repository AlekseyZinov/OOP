import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str1 = "Массив линий: ";
        String str2 = "Длина доманной: ";
        String str3 = "Длина массива линий: ";
        String str4 = "Результат сравнения: ";

        Point point1 = new Point(1,5);
        Point point2 = new Point(2,8);
        Point point3 = new Point(5,3);
        Point point4 = new Point(8,9);

        PolyLine polyLine = new PolyLine();
        polyLine.addPoint(point1);
        polyLine.addPoint(point2);
        polyLine.addPoint(point3);
        polyLine.addPoint(point4);
        System.out.println("Исходная ломаная");
        System.out.println(polyLine);
        System.out.println(str1 + Arrays.toString(polyLine.getLines()));
        System.out.println(str2 + polyLine.getLength());
        System.out.println(str3 + getLengthArrayLines(polyLine.getLines()));
        System.out.println(str4 + Double.valueOf(polyLine.getLength())
                .equals(Double.valueOf(getLengthArrayLines(polyLine.getLines()))));
        System.out.println("");

        changingCoordinatesPoint(point2);
        System.out.println("Измененная ломаная");
        System.out.println(polyLine);
        System.out.println(str1 + Arrays.toString(polyLine.getLines()));
        System.out.println(str2 + polyLine.getLength());
        System.out.println(str3 + getLengthArrayLines(polyLine.getLines()));
        System.out.println(str4 + Double.valueOf(polyLine.getLength())
                .equals(Double.valueOf(getLengthArrayLines(polyLine.getLines()))));
        System.out.println("");

    }

    public static double getLengthArrayLines (Line[] arrLines) {
        double res = 0;
        for (int i = 0; i < arrLines.length; i++) {
            res = res + arrLines[i].getLength();
        }
        return (Math.ceil(res * 100)) / 100;
    }

    public static void changingCoordinatesPoint (Point point) {
        point.x = point.x + 10;
    }
}