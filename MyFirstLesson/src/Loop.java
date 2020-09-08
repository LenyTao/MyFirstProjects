public class Loop {

    public static void loop1(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void loop2(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void loop3(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(1);
        }
        System.out.println();
    }

    public static void loop4(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(n);
        }
        System.out.println();
    }

    public static void loop5(int n, String s) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
        System.out.println();
    }

    public static void loop6(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(n - i);
        }
        System.out.println();
    }

    public static void loop7(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(n - 1 - i);
        }
        System.out.println();
    }

    public static void loop8(int n) {
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }

        for (int i = 0; i < n; i += 2) {
            System.out.println(i + 1);

        }
        System.out.println();
    }

    public static void loop9(int n) {
        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void loop10(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void loop11(int a, int b) {
        for (int i = b - 1; i > a; i--) {
            System.out.println(i);
        }

        for (int i = b; i > a + 1; i--) {
            System.out.println(i - 1);
        }
        System.out.println();
    }

    public static void loop12(double p, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i * p);
        }
        System.out.println();
    }

    public static void loop13(double p, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i * p * 0.1);
        }
        System.out.println();
    }

    public static void loop14(double p, int n) {
        int kg = 12;
        for (int i = 0; i < n; i++) {
            System.out.println(kg * p / 10.0);
            kg += 2;
        }

        for (int i = 1; i <= n; i++) {
            double result = p * (1 + (i * 0.2));
            System.out.println(String.format("%.1f", result));
        }
        System.out.println();
    }

    public static void loop15(int n) {


       /* for (int i = n - 1; i >= 0; i -= 2) {
            System.out.println(i);
        }*/

        for (int i = 0; i < n; i += 2) {
            System.out.println(n - 1 - i);

        }
        System.out.println();
    }

    public static void loop16(int n) {
        for (int i = n; i > 0; i -= 2) {
            System.out.println(i);
        }
//        for (int i = 0; i < n; i += 2) {
//            System.out.println(n - i);
//        }
        System.out.println();
    }

    public static void loop17(int n) {
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
    }

    public static void loop18(int n) {
        for (int i = n; i >= 2; i--) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
    }

    public static void loop19(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
            System.out.println(s);
        }

        int z = 1;
        for (int i = 0; i < n; i++) {
            z += i;
            System.out.println(i + z);
        }
        System.out.println();
    }

    public static void loop20(int n) {
        int z = 1;
        for (int i = 1; i <= n; i++) {
            z *= i;
            System.out.println(z);
        }
        System.out.println();
    }

    public static void loop21(int n) {

        int k = 0;
        for (int i = 4; k < n; i++) {
            if (i % 10 == 4 || i % 10 == 7) {
                System.out.println(i);
                k++;
            }
        }

        int x = 3;
        int s = 4;
        for (int i = 0; i < n; i++) {
            System.out.println(s);
            s += x;
            x = 10 - x;
        }
//        int z = 4;
//        for (int i = 0; i < n; i++) {
//            for (int j = z; j < Integer.MAX_VALUE; j++) {
//                if (j % 10 == 4 || j % 10 == 7) {
//                    System.out.println(j);
//                    z = j + 1;
//                    break;
//                }
//            }
//        }
        System.out.println();
    }

    public static void loop22(int n) {
        int x = 3;
        int s = 4;
        int a = 4;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            s += x;
            a += s;
            x = 10 - x;
        }
//        int z = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = z + 1; j < Integer.MAX_VALUE; j++) {
//                if (j % 10 == 4 || j % 10 == 7) {
//                    z = j + z;
//                    System.out.println(z);
//                    break;
//                }
//            }
//        }
        System.out.println();
    }

    public static void loop23(int n) {
        int x, y;
        for (int i = 0; i < n; i++) {
            x = i + 1;
            y = x * 2;
            System.out.println(x + " * 2  = " + y);
        }
        System.out.println();
    }

    public static void loop24(int n, int m) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " * " + m + " = " + i * m);
        }

        int x, y;
        for (int i = 0; i < n; i++) {
            x = i + 1;
            y = x * m;
            System.out.println(x + " * " + m + " = " + y);
        }
        System.out.println();
    }

    public static void loop25(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i % 2);
        }
        System.out.println();
    }

    public static void loop26(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i % 3);
        }
        System.out.println();
    }

    public static void loop27(int n) {
        int x = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(x);
            x = -x;
        }

        int z = 1;
        for (int i = 1; i <= n; i++) {
            z = i / z;
            System.out.println(z / i);
            z = z / i * -1;
        }
        System.out.println();
    }

    public static void loop28(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println((i % 2) + 1);
        }
        System.out.println();
    }

    public static void loop29(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println((i % 3) + 1);
        }
        System.out.println();
    }

    public static void loop30(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(1 - (i % 2));
        }
        System.out.println();
    }

    public static void loop31(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(2 - (i % 3));
        }
        System.out.println();
    }

    public static void loop32(int n) {
        int k = 1;
        for (int i = 0; i < n; i++) {
            System.out.println((1 + (i % 3)) * k);
            k *= -1;
        }
        System.out.println();
    }

    public static void loop33(int n) {
        int k = 0;
        for (int i = 0; i < n; i++) {
           // System.out.println(i % 3 * 2);
            System.out.println((k % 6));
            k += 2;
        }
        System.out.println();
    }

    public static void loop34(int n) {
        int k = 0;
        for (int i = 0; i < n; i++) {
            System.out.println((2 + (k % 6)));
            k += 2;
        }
        System.out.println();
    }

    public static void loop35(int n) {
        for (int i = 1, j = n - 1; i <= j; i++, j--) {
            System.out.println(i + " " + j);
        }
        int j = n - 1;
        for (int i = 1; i < j; i++) {
            System.out.println(i + " " + j);
            j--;
        }
        for (int i = 1; i < n; i++) {
            if (i <= n - i) {
                System.out.println(i + " " + (n - i));
            } else {
                break;
            }
        }
        System.out.println();
    }

    public static void loop36(int n) {
        char numLetter = 'a';
        for (int i = 0; i < n; i++) {
            System.out.println(numLetter);
            numLetter++;
        }
        System.out.println();
    }

    public static void loop37(int n) {
        char numLetter = 'Z' + 1;
        for (int i = n; i > 0; i--) {
            System.out.println((char) (numLetter - i));
        }
        System.out.println();
    }

    public static void loop38(char c) {
        for (char i = 'a'; i <= c; i += 2) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void loop39(char a, char b) {
        for (char i = a; i < b; i++) {
            System.out.println(i + " " + b);
            b--;
        }
        System.out.println();
    }

    public static void loop40(int n) {
        char para = 'A';
        for (int i = 0; i < n; i++) {
            System.out.println(
                    (char) (para + i) + "" + (char) (para + 1 + i)
            );
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        loop1(0);
//        loop1(1);
//        loop1(3);
//        loop2(0);
//        loop2(1);
//        loop2(3);
//        loop3(0);
//        loop3(1);
//        loop3(3);
//        loop4(0);
//        loop4(1);
//        loop4(3);
//        loop5(0, "qwerty");
//        loop5(1, "qwerty");
//        loop5(3, "abc");
//        loop6(0);
//        loop6(1);
//        loop6(3);
//        loop7(0);
//        loop7(1);
//        loop7(3);
//        loop8(0);
//        loop8(1);
//        loop8(3);
//        loop8(6);
//        loop9(0);
//        loop9(1);
//        loop9(3);
//        loop9(6);
//        loop10(0, 1);
//        loop10(5, 7);
//        loop10(10, 10);
//        loop11(0, 1);
//        loop11(5, 7);
//        loop11(10, 15);
//        loop12(300, 3);
//        loop12(199.75, 4);
//        loop13(300, 3);
//        loop13(199.75, 4);
//        loop14(100, 3);
//        loop14(149.5, 4);
//        loop15(1);
//        loop15(3);
//        loop15(4);
        loop16(1);
        loop16(3);
        loop16(4);
//        loop17(3);
//        loop17(6);
//        loop18(5);
//        loop18(6);
//        loop19(3);
//        loop19(5);
//        loop20(3);
//        loop20(5);
//        loop21(1);
//        loop21(2);
//        loop21(4);
//        loop22(1);
//        loop22(2);
//        loop22(4);
//        loop23(2);
//        loop23(4);
//        loop24(2, 5);
//        loop24(4, 3);
//        loop25(2);
//        loop25(5);
//        loop26(2);
//        loop26(5);
//        loop27(2);
//        loop27(5);
//        loop28(2);
//        loop28(5);
//        loop29(2);
//        loop29(5);
//        loop30(2);
//        loop30(5);
//        loop31(2);
//        loop31(5);
//        loop32(2);
//        loop32(6);
//        loop33(2);
//        loop33(5);
//        loop34(2);
//        loop34(5);
//        loop35(8);
//        loop35(7);
//        loop36(1);
//        loop36(3);
//        loop37(1);
//        loop37(3);
//        loop38('f');
//        loop38('c');
//        loop39('a', 'c');
//        loop39('b', 'e');
//        loop40(1);
//        loop40(3);
    }
}
