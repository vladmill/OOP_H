package homework01.task02;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this(0, 0);
    }

    public int calculateArea() {
        return width * height;
    }

    public int calculatePerimeter() {
        return (width + height) * 2;
    }

    public void showInfo() {
        System.out.printf("""
                Ширина = %d,
                Высота = %d,
                Площать = %d,
                Периметр = %d,
                """, width, height, calculateArea(), calculatePerimeter());
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
