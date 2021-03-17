public class ScaleCuboidBox {
    private double length;
    private double width;
    private double height;

    public ScaleCuboidBox(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void getLength() {
        System.out.println(length);
    }

    public void getWidth() {
        System.out.println(width);
    }

    public void getHeight() {
        System.out.println(height);
    }

    public int getVolume() {
        System.out.println(length * width * height);
        return (int)(length * width * height);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
