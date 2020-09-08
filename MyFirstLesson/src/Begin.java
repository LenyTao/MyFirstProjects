public class Begin {
    public static void begin1(int a) {
        System.out.println(4 * a);
    }

    public static void begin2(int a) {
        System.out.println((int) Math.pow(a, 2));
    }

    public static void begin3(int a, int b) {
        System.out.println(a * b + " " + 2 * (a + b));
    }

    public static void begin4(int a) {
        System.out.println(a * a * a + " " + 6 * a * a);
    }

    public static void begin5(int a, int b) {
        System.out.println((a + b) / 2.0);
    }

    public static void begin6(int a, int b) {
        System.out.println(Math.sqrt(a * b));
    }

    public static void begin7(int a, int b) {
        double c = Math.sqrt(a * a + b * b);
        System.out.println(c + " " + (a + b + c));
    }

    public static void begin8(int x1, int x2) {
        System.out.println(Math.abs(x2 - x1));
    }

    public static void begin9(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println(a + " " + b);
    }

    public static void begin10(int a, int b, int c) {
        int d = a;
        a = b;
        b = c;
        c = d;
        System.out.println(a + " " + b + " " + c);
    }

    public static void begin11(int a) {
        a *= a;
        System.out.println(a);
        a *= a;
        System.out.println(a);
        a *= a;
        System.out.println(a);
    }

    public static void begin12(double w1, double p1, double w2) {
        double oneKG = p1 / w1;
        double todayKG = w2 * oneKG;
        System.out.println(oneKG + " " + todayKG);
    }

    public static void begin13(int r) {
        System.out.println(r % 10);
    }

    public static void begin14(int m) {
        System.out.println(m % 60);
    }

    public static void begin15(int d) {
        System.out.println(d % 7);
    }

    public static void begin16(int d) {
        System.out.println((d + 1) % 7);
    }

    public static void begin17(int d) {
        System.out.println(d % 7);
    }

    public static void begin18(int d) {
        System.out.println(d % 7 + 1);
    }

    public static void begin19(int a) {
        System.out.println(a / 10 + " " + a % 10);
    }

    public static void begin20(int a) {
        int z = a / 10;
        int x = a % 10;
        System.out.println(z + x + " " + z * x);

        //  System.out.println(a / 10 + a % 10 + " " + (a / 10) * (a % 10));
    }

    public static void begin21(int a) {
        System.out.println(a % 2);
    }

    public static void begin22(int a) {
        System.out.println(a % 2 + 1);
    }

    public static void begin23(int a) {
        System.out.println(1 - a % 2);
    }

    public static void begin24(int a) {
        System.out.println(2 - a % 2);
    }

    public static void begin25(int n) {
        System.out.println((n - 1) % 3);
    }

    public static void boolean1(int a) {
        System.out.println(a > 0);
    }

    public static void boolean2(int a) {
        System.out.println(a % 2 == 0);
    }

    public static void boolean3(int a) {
        System.out.println(a % 2 != 0);
    }

    public static void boolean4(int a) {
        System.out.println(a % 10 == 4 | a % 10 == 7);
    }

    public static void boolean5(int a) {
        System.out.println(a % 2 == 0 && a % 10 != 4);
    }

    public static void boolean6(int a, int b) {
        System.out.println(a > 0 && b > 0);
    }

    public static void boolean7(int a, int b) {
        System.out.println(a > 0 || b > 0);
    }

    public static void boolean8(int a, int b) {
        System.out.println(a * b < 0);
    }

    public static void boolean9(int a, int b, int c) {
        System.out.println(a < b && b < c);
    }

    public static void boolean10(int a, int b, int c) {
        System.out.println((b < a && b > c) || (b > a && b < c));
    }

    public static void boolean11(int a) {
        System.out.println(a / 10 > 1 && a / 10 < 10);
    }

    public static void boolean12(int a) {
        System.out.println((a % 2 != 0 && a >= 100 && a < 1000) || (a % 2 == 0 && a < 100 && a >= 10));
    }

    public static void boolean13(int a) {
        System.out.println();
    }

    public static void main(String[] args) {
//        begin1(1);
//        begin1(12);
//        begin2(1);
//        begin2(12);
//        begin3(5, 4);
//        begin3(10, 10);
//        begin4(5);
//        begin4(10);
//        begin5(5, 7);
//        begin5(2, -3);
//        begin6(2, 8);
//        begin6(0, 5);
//        begin6(7, 9);
//        begin7(3, 4);
//        begin7(5, 7);
//        begin8(1, 4);
//        begin8(1, -4);
//        begin9(1, 4);
//        begin9(10, 15);
//        begin10(1, 4, 7);
//        begin10(10, 15, 20);
//        begin11(1);
//        begin11(2);
//        begin11(10);
//        begin12(3, 300, 2);
//        begin12(1.5, 450, 0.5);
//        begin13(5);
//        begin13(27);
//        begin13(150);
//        begin13(199);
//        begin14(5);
//        begin14(59);
//        begin14(70);
//        begin14(180);
//        begin15(0);
//        begin15(6);
//        begin15(7);
//        begin15(29);
//        begin16(0);
//        begin16(3);
//        begin16(6);
//        begin16(29);
//        begin17(0);
//        begin17(3);
//        begin17(7);
//        begin17(29);
//        begin18(0);
//        begin18(6);
//        begin18(7);
//        begin18(29);
//        begin19(10);
//        begin19(91);
//        begin20(27);
//        begin20(55);
//        begin21(0);
//        begin21(1);
//        begin21(5);
//        begin21(10);
//        begin22(0);
//        begin22(1);
//        begin22(5);
//        begin22(10);
//        begin23(0);
//        begin23(1);
//        begin23(5);
//        begin23(10);
//        begin24(0);
//        begin24(1);
//        begin24(5);
//        begin24(10);
        begin25(1);
        begin25(3);
        begin25(5);
        begin25(10);

//        boolean1(5);
//        boolean1(0);
//        boolean1(-4);
//        boolean2(5);
//        boolean2(0);
//        boolean2(6);
//        boolean3(5);
//        boolean3(0);
//        boolean3(6);
//        boolean4(4);
//        boolean4(57);
//        boolean4(75);
//        boolean5(14);
//        boolean5(57);
//        boolean5(42);
//        boolean6(5, 6);
//        boolean6(0, 3);
//        boolean6(-1, -2);
//        boolean7(5, 6);
//        boolean7(0, 3);
//        boolean7(-1, -2);
//        boolean8(5, -6);
//        boolean8(-5, 6);
//        boolean8(5, 6);
//        boolean8(-5, -6);
//        boolean8(5, 0);
//        boolean9(5, 10,11);
//        boolean9(5, 11,10);
////      boolean9(7, 7,7);
//        boolean10(5, 10, 11);
//        boolean10(11, 10, 5);
//        boolean10(11, 10, 10);
//        boolean11(50);
//        boolean11(9);
//        boolean11(100);
        boolean12(8);
        boolean12(9);
        boolean12(51);
        boolean12(52);
        boolean12(100);
        boolean12(101);
        boolean12(9998);
        boolean12(9999);


    }
}
