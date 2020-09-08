import java.util.Arrays;

public class Array {
    public static void array1(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public static void array2(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public static void array3(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public static void array4(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = n;
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public static void array5(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = n - i;
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public static void array6(int n) {
        int[] array = new int[n];
        for (int i = 1; i < n; i++) {
            array[i - 1] = n - i;
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public static void array7(int n, String s) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = s;
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public static void array8(int n) {
        int[] array = new int[n];
        int z = 0;
        for (int i = 0; i < n; i++) {
            array[i] = z;
            z += 2;
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public static void array9(int n) {
        int[] array = new int[n];
        int z = 1;
        for (int i = 0; i < n; i++) {
            array[i] = z;
            z += 2;
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public static void array10(int n) {
        int[] array = new int[n];
        int z = 2;
        for (int i = 0; i < n; i++) {
            array[i] = z;
            z += 2;
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public static void array11(int x, int y) {
        int[] array = new int[y - x + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = x + i;
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public static void array12(int x, int y) {
        int[] array = new int[y - x - 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = y - i - 1;
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public static void array13(int n) {
        int[] array = new int[n * 2];
        int z = 1;
        for (int i = 0; i < array.length; i += 2) {
            array[i] = z;
            array[i + 1] = z;
            z++;
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public static void array14(int n) {

//        int s = 0;
//        for (int i = 0; i < a.length; i++) {
//            s += i + 1;
//            a[i] = s;
//        }
//
//        a[0] = 1;
//        for (int i = 1; i < a.length; i++) {
//            a[i] = a[i - 1] + i + 1;
//        }
        int[] array = new int[n];
        int z = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = z;
            z = z + 2 + i;
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public static void array15(int n) {
        int[] array = new int[n];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 2] + array[i - 1];
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    public static void array16(int[] n) {
        for (int i = 0; i < n.length; i++) {
            n[i] *= 2;
        }
        System.out.println(Arrays.toString(n));
        System.out.println();
    }

    public static void array17(int[] a) {
        for (int i = 1; i < a.length; i += 2) {
            a[i] *= 2;
        }
        System.out.println(Arrays.toString(a));
        System.out.println();
    }

    public static void array18(int[] a) {
        for (int i = 0; i < a.length; i += 2) {
            a[i] *= 2;
        }
        System.out.println(Arrays.toString(a));
        System.out.println();
    }

    public static void array19(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println();
    }

    public static void array20(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i] *= 2;
            } else {
                a[i] /= 2;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println();
    }

    public static void array21(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                a[i] = 0;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println();
    }

    public static void array22(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                a[i] *= -1;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println();
    }

    public static void array23(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                a[i] = 0;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println();
    }

    public static void array24(int[] a) {

        for (int i = a.length - 1; i > 0; i--) {
            if (a[i] > a[i - 1]) {
                a[i] = 0;
            }
        }

        System.out.println(Arrays.toString(a));
        System.out.println();
    }

    public static void array25(int[] a) {
        for (int i = 1; i < a.length; i += 2) {
            System.out.println((a[i]));
        }
        System.out.println();
    }

    public static void array26(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
        System.out.println();
    }

    public static void array27(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 10 == 4 || a[i] % 10 == 7) {
                System.out.println(a[i]);
            }
        }
        System.out.println();
    }

    public static void array28(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0 && a[i] % 3 != 0) {
                System.out.println(a[i]);
            }
        }
        System.out.println();
    }

    public static void array29(int[] a) {
        int z;
        for (int i = 1; i < a.length; i += 2) {
            z = a[i];
            a[i] = a[i - 1];
            a[i - 1] = z;
        }
        System.out.println(Arrays.toString(a));
        System.out.println();
    }

    public static void array30(int[] a) {

        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
//        int z;
//        for (int i = 0, j = 1; i < a.length - 1; i++, j++) {
//            if (i >= a.length - j) {
//                break;
//            }
//            z = a[i];
//            a[i] = a[a.length - j];
//            a[a.length - j] = z;
//        }
        System.out.println(Arrays.toString(a));
        System.out.println();
    }

    public static void array31(int[] a) {
        int z;
        for (int i = 0, j = a.length / 2; j < a.length; i++, j++) {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
//        for (int i = 0, j = 1; i < a.length - 1; i++, j++) {
//            if (i >= a.length - j) {
//                break;
//            }
//            z = a[a.length / 2 - j];
//            a[a.length / 2 - j] = a[a.length - j];
//            a[a.length - j] = z;
//        }
        System.out.println(Arrays.toString(a));
        System.out.println();
    }

    public static void array32(int[] a) {
        int last = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = last;
//        int z = a[0];
//        int j = a[a.length - 1];
//        for (int i = 1; i < a.length; i++) {
//            int k = a[i];
//            a[i] = z;
//            z = k;
//        }
//        a[0] = j;
        System.out.println(Arrays.toString(a));
        System.out.println();
    }

    public static void array33(int[] a) {
        int first = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];
        }
        a[a.length - 1] = first;
//        int z;
//        int j = a[0];
//        for (int i = 1; i < a.length; i++) {
//            z = a[i];
//            a[i - 1] = z;
//        }
//        a[a.length - 1] = j;
        System.out.println(Arrays.toString(a));
        System.out.println();
    }

    public static void array34(int[] a) {
        int z;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                z = a[i + 1];
                a[i + 1] = a[i];
                a[i] = z;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println();
    }

    public static void array35(int[] a) {
        int z;
        for (int i = a.length - 1; i > 0; i--) {
            if (a[i] > a[i - 1]) {
                z = a[i - 1];
                a[i - 1] = a[i];
                a[i] = z;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println();
    }

    public static void array36(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] * 2;
        }
        System.out.println(Arrays.toString(b));
        System.out.println();
    }

    public static void array37(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {

            b[i] = i % 2 != 0 ? a[i] * 2 : a[i];

//            if (i % 2 != 0) {
//                b[i] = a[i] * 2;
//            } else {
//                b[i] = a[i];
//            }
        }
        System.out.println(Arrays.toString(b));
        System.out.println();
    }

    public static void array38(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                b[i] = a[i] * 2;
            } else {
                b[i] = a[i];
            }
        }
        System.out.println(Arrays.toString(b));
        System.out.println();
    }

    public static void array39(int[] a) {
        int[] b = new int[a.length / 2];
        for (int i = 0, k = 1; i < b.length; i++, k += 2) {
            b[i] = a[k];
        }
        System.out.println(Arrays.toString(b));
        System.out.println();
    }

    public static void array40(int[] a) {
        boolean[] b = new boolean[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] > 0;
        }
        System.out.println(Arrays.toString(b));
        System.out.println();
    }

    public static void array41(int[] a) {
        int[] b = new int[a.length];

        for (int i = 0, j = a.length - 1; i < b.length; i++, j--) {
            b[i] = a[j];
        }
//        int z;
//        for (int i = 0, k = 1; i < b.length; i++, k++) {
//            z = a[i];
//            b[i] = a[a.length - k];
//            b[b.length - k] = z;
//
//        }
        System.out.println(Arrays.toString(b));
        System.out.println();
    }

    public static void array42(int[] a) {
        int[] b = new int[a.length];

        int s = 0;
        for (int i = 0; i < b.length; i++) {
            s += a[i];
            b[i] = s;
        }
//        int z = a[0];
//        b[0] = z;
//        for (int i = 1; i < b.length; i++) {
//            b[i] = z + a[i];
//            z = b[i];
//
//        }
        System.out.println(Arrays.toString(b));
        System.out.println();
    }

    public static void array43(int[] a) {
        int[] b = new int[a.length];

        for (int i = 1; i < b.length; i += 2) {
            b[i] = a[i - 1];
            b[i - 1] = a[i];
        }
        if (b.length % 2 != 0) {
            b[b.length - 1] = a[a.length - 1];
        }

        int z;
        for (int i = 0; i < b.length - 1; i++) {
            if (i % 2 == 0) {
                z = a[i];
                b[i] = a[i + 1];
                b[i + 1] = z;
            } else {
                b[i + 1] = a[i + 1];
            }
        }
        System.out.println(Arrays.toString(b));
        System.out.println();
    }

    public static void array44(int[] a, int[] b) {
        int[] c = new int[a.length];
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] + b[i];
        }
        System.out.println(Arrays.toString(c));
        System.out.println();
    }

    public static void array45(int[] a, int[] b) {
        int[] c = new int[a.length];
        for (int i = 0; i < c.length; i++) {
            if (a[i] > b[i]) {
                c[i] = a[i];
            } else {
                c[i] = b[i];
            }
        }
        System.out.println(Arrays.toString(c));
        System.out.println();
    }

    public static void array46(int[] a, int[] b) {
        int[] c = new int[a.length];
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] - b[i];
            if (c[i] < 0) {
                c[i] *= -1;
            }
        }
        System.out.println(Arrays.toString(c));
        System.out.println();
    }

    public static void array47(int[] a, int m, int n) {
        int[] c = new int[n - m + 1];

        for (int i = m - 1, j = 0; i < n; i++, j++) {
            c[j] = a[i];
        }
        for (int i = 0; i < c.length; i++) {
            if (m <= n) {
                c[i] = a[m - 1];
                m++;
            }
        }
        System.out.println(Arrays.toString(c));
        System.out.println();
    }

    public static void array48(int[] a, int m, int n) {
        int[] c = new int[a.length / n];
        int k = 0;
        for (int i = m - 1; i < a.length; i += n) {
            c[k] = a[i];
            k++;
        }
        System.out.println(Arrays.toString(c));
        System.out.println();
    }

    public static void array49(int[] a, int n) {
        int[] c = new int[a.length * n];
        for (int i = 0; i < c.length; i += a.length) {
            for (int j = 0; j < a.length; j++) {
                c[j + i] = a[j];
            }
        }
        System.out.println(Arrays.toString(c));
        System.out.println();
    }

    public static void array50(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int k = 0;
        for (int i = 0; i < c.length; i++) {
            if (i < a.length) {
                c[i] = a[i];
            } else {
                c[i] = b[k];
                k++;
            }
        }
        System.out.println(Arrays.toString(c));
        System.out.println();
    }

    public static void main(String[] args) {

//        array1(0);
//        array1(1);
//        array1(3);
//        array2(0);
//        array2(1);
//        array2(3);
//        array3(0);
//        array3(1);
//        array3(3);
//        array4(0);
//        array4(1);
//        array4(3);
//        array5(0);
//        array5(1);
//        array5(3);
//        array6(0);
//        array6(1);
//        array6(3);
//        array7(0, "a");
//        array7(1, "a");
//        array7(3, "xyz");
//        array8(0);
//        array8(1);
//        array8(3);
//        array9(0);
//        array9(1);
//        array9(3);
//        array10(0);
//        array10(1);
//        array10(3);
//        array11(0, 1);
//        array11(5, 7);
//        array11(-2, 0);
//        array12(0, 1);
//        array12(5, 7);
//        array12(-2, 2);
//        array13(1);
//        array13(2);
//        array13(3);
//        array14(1);
//        array14(3);
//        array14(5);
//        array15(2);
//        array15(5);
//        array15(7);
//        array16(new int[]{});
//        array16(new int[]{1});
//        array16(new int[]{-2, 0, 5});
//        array17(new int[]{});
//        array17(new int[]{1, 1, 1});
//        array17(new int[]{1, 2, 2, 1});
//        array18(new int[]{});
//        array18(new int[]{1, 1, 1});
//        array18(new int[]{1, 2, 2, 1});
//        array19(new int[]{});
//        array19(new int[]{1, 1, 1});
//        array19(new int[]{1, 2, 3, 3});
//        array20(new int[]{});
//        array20(new int[]{1, 1, 2});
//        array20(new int[]{2, 4, 3, 5});
//        array20(new int[]{2, 4, 3, 5});
//        array21(new int[]{});
//        array21(new int[]{-1, 1, 2});
//        array21(new int[]{-1, 2, 3, -4});
//        array22(new int[]{});
//        array22(new int[]{-1, 1, 2});
//        array22(new int[]{-1, 2, 3, -4});
//        array23(new int[]{1, 2});
//        array23(new int[]{3, 2, 1});
//        array23(new int[]{1, 2, 1, 2});
        array24(new int[]{1, 2});
        array24(new int[]{3, 2, 1});
        array24(new int[]{1, 2, 1, 2});
//        array25(new int[]{1, 2, 4, 3});
//        array25(new int[]{2, 3, 4});
//        array25(new int[]{1, 2, 3, 4, 5, 6});
//        array26(new int[]{1, 2, 4, 3});
//        array26(new int[]{2, 3, 4});
//        array26(new int[]{1, 2, 3, 4, 5, 6});
//        array27(new int[]{41, 76, 0});
//        array27(new int[]{2, 3, 4});
//        array27(new int[]{4, 24, 107});
//        array28(new int[]{10, 9, 8});
//        array28(new int[]{2, 3, 4, 5, 6});
//        array28(new int[]{1, 5, 7, 9});
//        array29(new int[]{1, 2, 3, 4});
//        array29(new int[]{1, 2, 2, 1, 3});
//        array29(new int[]{1, 5, 7});
//        array30(new int[]{1});
//        array30(new int[]{10, 20, 15});
//        array30(new int[]{5, 3, 7, 4});
//        array31(new int[]{1, 2});
//        array31(new int[]{1, 2, 3, 4});
//        array31(new int[]{1, 2, 3, 3, 2, 1});
//        array32(new int[]{1, 2, 3});
//        array32(new int[]{4, 1, 2, 3});
//        array32(new int[]{3, 4, 1, 2});
//        array33(new int[]{1, 2, 3});
//        array33(new int[]{4, 1, 2, 3});
//        array33(new int[]{3, 4, 1, 2});
//        array34(new int[]{3, 1, 2, 4});
//        array34(new int[]{2, 1, 1, 2, 2});
//        array34(new int[]{6, 2, 3, 4, 5});
//        array35(new int[]{5, 4, 2, 3});
//        array35(new int[]{2, 2, 1, 1, 2});
//        array35(new int[]{5, 4, 3, 2, 6});
//        array36(new int[]{1});
//        array36(new int[]{1, 2});
//        array36(new int[]{5, 10, 5});
//        array37(new int[]{1});
//        array37(new int[]{1, 2, 3});
//        array37(new int[]{1, 1, 1, 1});
//        array38(new int[]{1});
//        array38(new int[]{1, 3, 2});
//        array38(new int[]{1, 1, 1, 1});
//        array39(new int[]{1});
//        array39(new int[]{1, 3, 2});
//        array39(new int[]{1, 2, 1, 3});
//        array40(new int[]{1});
//        array40(new int[]{1, -2, 0});
//        array40(new int[]{0, 1, 2});
//        array41(new int[]{1});
//        array41(new int[]{1, 0, 2});
//        array41(new int[]{9, 7, 4});
//        array42(new int[]{1, 1, 1});
//        array42(new int[]{2, 2, 2});
//        array42(new int[]{10, 5, 1, 0});
//        array43(new int[]{1, 2});
//        array43(new int[]{1, 2, 3});
//        array43(new int[]{10, 5, 1, 0});
//        array44(new int[]{1, 2}, new int[]{2, 3});
//        array44(new int[]{1, 2, 3}, new int[]{3, 2, 1});
//        array44(new int[]{1, 1, 1}, new int[]{3, 2, 1});
//        array45(new int[]{1, 2}, new int[]{2, 3});
//        array45(new int[]{1, 2, 3}, new int[]{3, 2, 1});
//        array45(new int[]{1, 1, 1}, new int[]{3, 2, 1});
//        array46(new int[]{1, 2}, new int[]{2, 3});
//        array46(new int[]{1, 2, 3}, new int[]{3, 2, 1});
//        array46(new int[]{1, 1, 1}, new int[]{3, 2, 1});
//        array47(new int[]{5, 4, 3}, 2, 3);
//        array47(new int[]{5, 6, 7, 8}, 1, 3);
//        array47(new int[]{9, 8, 7, 1, 2, 3}, 3, 5);
//        array48(new int[]{5, 4, 3}, 1, 1);
//        array48(new int[]{5, 6, 7, 8}, 1, 2);
//        array48(new int[]{9, 8, 7, 1, 2, 3}, 2, 3);
//        array49(new int[]{1}, 3);
//        array49(new int[]{1, 2}, 2);
//        array49(new int[]{9, 8}, 3);
//        array50(new int[]{1}, new int[]{2});
//        array50(new int[]{1, 2}, new int[]{3});
//        array50(new int[]{9, 8}, new int[]{9, 8, 7});
    }
}
