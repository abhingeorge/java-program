import java.util.Scanner;

// ---------------------------------------------------------
// STEP 1: Define the Blueprint (Geometry Class)
// ---------------------------------------------------------
class Geometry {

    // A. Overloaded Method 1: Area of Circle
    // Signature: area(double)
    double area(double r) {

        // Return πr²
        return Math.PI * r * r;

    }

    // B. Overloaded Method 2: Area of Rectangle
    // Signature: area(double, double)
    double area(double l, double b) {

        // Return length * breadth
        return l * b;

    }

    // C. Overloaded Method 3: Area of Triangle
    // Signature: area(double, double, double)
    double area(double a, double b, double c) {

        // 1. Triangle Inequality Check
        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            System.out.println("Invalid Triangle!");
            return 0.0;
        }

        // 2. Semi-perimeter
        double s = (a + b + c) / 2;

        // 3. Heron's Formula
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));

    }
}


// ---------------------------------------------------------
// STEP 2: The Execution Logic (Main Method)
// ---------------------------------------------------------
public class MethodOverloadingDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Create Geometry object
        Geometry g = new Geometry();

        System.out.println("--- Method Overloading: Area Calculation ---\n");


        // -------------------------------------------------
        // Circle Area
        // -------------------------------------------------
        System.out.print("Enter radius of the Circle: ");
        double r = sc.nextDouble();

        // Call area method
        System.out.println("Area of Circle = " + g.area(r));


        // -------------------------------------------------
        // Rectangle Area
        // -------------------------------------------------
        System.out.print("\nEnter length and breadth of the Rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();

        // Call area method
        System.out.println("Area of Rectangle = " + g.area(l, b));


        // -------------------------------------------------
        // Triangle Area
        // -------------------------------------------------
        System.out.print("\nEnter three sides of the Triangle (a, b, c): ");
        double sideA = sc.nextDouble();
        double sideB = sc.nextDouble();
        double sideC = sc.nextDouble();

        // Call area method
        System.out.println("Area of Triangle = " + g.area(sideA, sideB, sideC));

        sc.close();
    }
}
