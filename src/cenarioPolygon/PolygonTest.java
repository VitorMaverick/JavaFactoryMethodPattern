package cenarioPolygon;

public class PolygonTest {
    public static void main(String[] args) {
        IPolygon triangle = PolygonFactory.createPolygon(3);
        System.out.println(triangle.getName());

        IPolygon square = PolygonFactory.createPolygon(4);
        System.out.println(square.getName());

        IPolygon pentagon = PolygonFactory.createPolygon(5);
        System.out.println(pentagon.getName());
    }
}
