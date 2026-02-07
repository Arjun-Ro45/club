public class Operators {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        boolean x = true;
        boolean y = false;

        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int quot = a / b;
        int rem = a % b;

        a++;
        b--;

        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreater = (a > b);
        boolean isLesser = (a < b);

        boolean andRes = (x && y);
        boolean orRes = (x || y);
        boolean notRes = !x;

        int c = 5;
        c += 2;
        c *= 3;

        int max = (a > b) ? a : b;

        System.out.println(sum);
        System.out.println(isGreater);
        System.out.println(andRes);
        System.out.println(c);
        System.out.println(max);
    }
}
