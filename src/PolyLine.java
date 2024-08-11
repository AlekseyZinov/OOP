import java.util.Arrays;

public class PolyLine {
    Point[] arrPoints = new Point[0];

    public PolyLine() {
    }

    public Point[] addPoint(Point point) {
        Point[] arrPoints2 = new Point[arrPoints.length + 1];
        for (int i = 0; i < arrPoints.length; i++) {
            arrPoints2[i] = arrPoints[i];
        }
        arrPoints2[arrPoints2.length - 1] = point;
        arrPoints = arrPoints2;
        return arrPoints;
    }

    public Line[] getLines() {
        Line[] arrLines = new Line[arrPoints.length - 1];
        for (int i = 0; i < arrLines.length; i++) {
            Line line = new Line(arrPoints[i], arrPoints[i + 1]);
            arrLines[i] = line;
        }
        return arrLines;
    }

    public double getLength() {
        double res = 0;
        for (int i = 1; i < arrPoints.length; i++) {
            res = res +
                    (Math.sqrt
                            (Math.pow((arrPoints[i].x - arrPoints[i - 1].x), 2) +
                                    Math.pow((arrPoints[i].y - arrPoints[i - 1].y), 2)));
        }
        return (Math.ceil(res * 100)) / 100;
    }

    @Override
    public String toString() {
        return "Массив точек: " + Arrays.toString(arrPoints);
    }
}
