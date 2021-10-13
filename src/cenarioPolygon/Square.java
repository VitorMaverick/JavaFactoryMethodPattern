package cenarioPolygon;

public class Square implements IPolygon{
    String name;

    public Square(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
