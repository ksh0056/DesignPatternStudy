package pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

    private List<Shape> shapes = new ArrayList<Shape>();

    @Override
    public void draw(String color) {
        for(Shape sh : shapes) {
            sh.draw(color);
        }
    }

    public void add(Shape s) {
        this.shapes.add(s);
    }

    public void remove(Shape s) {
        this.shapes.remove(s);
    }

    public void clear() {
        this.shapes.clear();
    }
}
