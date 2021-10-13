package cenarioPolygon;

public class PolygonFactory {
    public static IPolygon createPolygon(int numberOfSides) {
        if(numberOfSides ==3) {
            return new Triangle("triangle");
        }else if(numberOfSides == 4) {
            return new Square("Square");
        }else if(numberOfSides == 5) {
            return new Pentagon("Pentagon");
        }
        return null;
    }
}
