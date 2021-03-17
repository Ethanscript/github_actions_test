import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        double width = input.nextDouble();
        double height = input.nextDouble();
        ScaleCuboidBox mybox = new ScaleCuboidBox(length, width, height);
        int num = input.nextInt();
        int i;
        for (i = 0; i < num; i++) {
            int op = input.nextInt();
            switch (op) {
                case 1:
                    mybox.getLength();
                    break;
                case 2:
                    mybox.getWidth();
                    break;
                case 3:
                    mybox.getHeight();
                    break;
                case 4:
                    mybox.setLength(input.nextDouble());
                    break;
                case 5:
                    mybox.setWidth(input.nextDouble());
                    break;
                case 6:
                    mybox.setHeight(input.nextDouble());
                    break;
                default:
                    mybox.getVolume();
                    break;
            }
        }
    }
}
