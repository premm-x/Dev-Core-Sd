class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width; // breaks parent behavior
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height; // breaks parent behavior
    }
}

public class Before {
    public static void main(String[] args) {
        Rectangle rect = new Square();
        rect.setWidth(5);
        rect.setHeight(10);
        System.out.println(rect.getArea()); // expected 50, gets 100
    }
}
