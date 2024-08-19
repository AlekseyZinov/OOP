public class Square {
    private Point point;
    private int sideLength;

    public Square(Point point, int sideLength) {
        this.changeSquare(point, sideLength);
    }

    public void changeSquare (Point point, int sideLength) {
        this.point = point;
        if (sideLength < 0){
            throw new IllegalArgumentException("denominator mast be positive");
        } else {
            this.sideLength = sideLength;
        }
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + point + " со стороной " + sideLength;
    }
}
