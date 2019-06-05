import java.util.Scanner;

public class mainProgram {
    public static void main(String[] args) {
        System.out.println("input Width: ");
        Scanner scanner= new Scanner(System.in);
        double width=scanner.nextDouble();
        System.out.println("input Height:");
        double height=scanner.nextDouble();

        Rectangle rectangle1=new Rectangle(width,height);
        Rectangle rectangle2= new Rectangle();

        System.out.println(rectangle1.display());
        System.out.println("S= "+rectangle1.getArea());
        System.out.println(rectangle2.display());
        System.out.println("S= "+rectangle2.getArea());
    }
}

