package pattern.composite;

public class Circle implements Shape {
    @Override
    public void draw(String color) {
        System.out.println("circle color : " + color);
    }
}
