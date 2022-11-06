import java.util.Scanner;

public class _12_Area_of_Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float pi = 3.14f;
        System.out.println("Input Radius");
        float radius = input.nextFloat();

        float area = pi * (radius * radius);
        System.out.println(area);

        input.close();
 
    }

}
