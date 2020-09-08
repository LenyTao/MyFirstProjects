public class Bool {
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
        System.out.println(a % 10 == 4 || a % 10 == 7);
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
        System.out.println(10 <= a && 99 >= a);
    }

    public static void boolean12(int a) {
        System.out.println((a % 2 != 0 && a >= 100 && a < 1000) || (a % 2 == 0 && a < 100 && a >= 10));
    }

    public static void boolean13(int a) {
        int a1 = a / 1000; // 1
        int a2 = a / 100 % 10; // 2
        int a3 = a / 10 % 10;// 3
        int a4 = a % 10;// 3
        System.out.println(a1 == a4 && a2 == a3);
    }

    public static void boolean14(int n) {
        System.out.println((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0));
    }

    public static void boolean15(int a, int b, int c) {
       /* a < b + c &&
                b < a + c &&
                c < a + b*/
        int sum1 = Math.max(a, b);
        int sum2 = Math.max(b, c);
        int max = Math.max(sum1, sum2);
        System.out.println(max < Math.min(a, b) + Math.min(b, c));
    }


    public static void main(String[] args) {
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
//        boolean12(8);
//        boolean12(9);
//        boolean12(51);
//        boolean12(52);
//        boolean12(100);
//        boolean12(101);
//        boolean12(9998);
//        boolean12(9999);
//        boolean13(1001);
//        boolean13(9999);
//        boolean13(1233);
//        boolean14(2020);
//        boolean14(1996);
//        boolean14(1990);
//        boolean14(2000);
//        boolean14(1900);
//        boolean15(1, 1, 1);
//        boolean15(3, 4, 5);
//        boolean15(1, 2, 3);
//        boolean15(7, 3, 3);

    }
}


