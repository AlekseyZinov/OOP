public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1,3);
        Point point2 = new Point(1,3);
        Point point3 = new Point(5,8);
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
        System.out.println(equalsPoints(point1, point2));
        System.out.println(equalsPoints(point2, point3));
        System.out.println(equalsPoints(point1, point3));

    }
    public static boolean equalsPoints (Point pointOne, Point pointTwo) {
        if (pointOne == pointTwo) {
            return true;
        } else return false;
    }
}
