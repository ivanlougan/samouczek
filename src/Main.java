import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Main m = new Main();

        System.out.println(m.printAge());
        System.out.println(m.printName());

        int c = 4;
        int d = 5;
        m.calculations(c,d);
        System.out.println(m.even(5));
        System.out.println(m.odd(11));
        System.out.println(m.cube(3));
        System.out.println(m.root(256));
        System.out.println(m.rooot(125));
        System.out.println(m.isTriangleRight(4,5,3));
        System.out.println(m.pow(20.0));

    }

    public String printName() {
        return "Robertinio";
    }

    public int printAge() {
        return 28;
    }

    public void calculations(int a, int b) {
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
    }

    public boolean even(int a){
        return a % 2 == 0;
    }

    public boolean odd(int a) {
        return a % 3 == 0 || a % 5 == 0;
    }

    public double pow(double a) {
        return Math.pow(a, 5);
    }

    public int cube(int a) {
        return (int) Math.pow(a, 3);
    }

    public int root(int a) {
        return (int) Math.sqrt(a);
    }

    public int rooot(int a) {
        return (int) Math.cbrt(a);
    }

    public boolean isTriangleRight(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0)
            return false;
        int[] sides = {a,b,c};
        Arrays.sort(sides);
        return sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2];

    }
}
