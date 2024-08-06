public class Line {
    Point point1;
    Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public double getLength() {
        double res = Math.sqrt(Math.pow((point2.x - point1.x),2) + Math.pow((point2.y - point1.y), 2));
        return res;
    }

    @Override
    public String toString() {
        return "Линия от " + point1 +
                " до " + point2;
    }
}

