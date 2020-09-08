public class Recursion {
    public static int req1(int n) {
        int result = 0;
        if (n == result) {
            return result;
        }
        result = req1(n - 1);
        System.out.println(n - 1);
        return result;
    }

    public static int req2(int n) {
        int result = 0;
        if (n == result) {
            return result;
        }
        result = req2(n - 1);
        System.out.println(n);
        return result;
    }

    public static int req3(int n) {
        int result = 0;
        if (n == result) {
            return result;
        }
        result = req3(n - 1);
        System.out.println(1);
        return result;
    }

    public static int req4(int n) {
 return n;
    }

    public static void main(String[] args) {
//        req1(0);
//        req1(1);
//        req1(3);
//        req2(0);
//        req2(1);
//        req2(3);
//        req3(0);
//        req3(1);
//        req3(8);
//        req4(0);
//        req4(1);
        req4(3);

    }
}
