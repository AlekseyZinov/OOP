public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1,3);
        Point point2 = new Point(5,3);
        Point point3 = new Point(10,11);
        Point point4 = new Point(15, 19);
        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point3, point4);
        Line line3 = new Line(point2, point3);

        System.out.println("Исходные линии");
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println ("Общая длина всех линий: " +
                getLinesLength(line1.getLength(),
                        line2.getLength(),
                        line3.getLength()));
        System.out.println("");

        System.out.println("Линии после изменения");
        changingCoordinatesPoint(line3);
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);

        System.out.println ("Общая длина всех линий: " +
                getLinesLength(line1.getLength(),
                        line2.getLength(),
                        line3.getLength()));
    }

    public static double getLinesLength (double length1, double length2 , double length3) {
        double res = (Math.ceil((length1 + length2 + length3) * 100)) / 100;
        return res;
    }

    public static void changingCoordinatesPoint (Line line3) {
        line3.point1.x += 2;
        line3.point1.y += 3;
        line3.point2.x -= 1;
        line3.point2.y -= 4;
    }
}