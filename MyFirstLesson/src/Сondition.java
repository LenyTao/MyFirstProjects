public class Сondition {
    public static void condition1(int a) {
        if (a > 0) {
            a++;
        }
        System.out.println(a);
    }

    public static void condition2(int a) {
        if (a > 0) {
            a++;
        } else {
            a -= 2;
        }
        System.out.println(a);
    }

    public static void condition3(int a) {
        if (a > 0) {
            a += 1;
        } else if (a < 0) {
            a -= 2;
        } else {
            a = 10;
        }
        System.out.println(a);
    }

    public static void condition4(int a, int b) {
        if (a % 2 == 0) {
            a += b;
        } else {
            b -= a;
        }
        System.out.println(a + " " + b);
    }

    public static void condition5(int a, int b, int c) {
        if (a % 2 == 0) {
            b += 1;
            c += 1;
        }

        if (b % 2 == 0 && c % 2 != 0) {
            a -= 2;
        }
        System.out.println(a + " " + b + " " + c);
    }

    public static void condition6(int a, int b, int c) {
        int sum = 0;
        if (a % 2 == 0) {
            sum += a;
        }
        if (b % 2 == 0) {
            sum += b;
        }
        if (c % 2 == 0) {
            sum += c;
        }
        System.out.println(sum);
    }

    public static void condition7(int a, int b, int c) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        System.out.println(max);
    }

    public static void condition8(int a, int b, int c) {
        int m;
        if (a > b) {
            m = a;
            a = b;
            b = m;
        }
        if (b > c) {
            m = b;
            b = c;
            c = m;
        }
        if (a > b) {
            m = a;
            a = b;
            b = m;
        }
        System.out.println(a + " " + b + " " + c);
    }

    public static void condition9(int a, int b, int c) {
        int m;
        if (a < b) {
            m = a;
            a = b;
            b = m;
        }
        if (b < c) {
            m = b;
            b = c;
            c = m;
        }
        if (a < b) {
            m = a;
            a = b;
            b = m;
        }
        System.out.println(a + " " + b + " " + c);
    }

    public static void condition10(int a, int b, int c) {
      /*  if (a >= b && a >= c) {
            System.out.println(1);
        }
        else if (b >= a && b >= c) {
            System.out.println(2);
        }
        else {
            System.out.println(3);
        }*/

        int max;
        int numMax;
        if (a > b) {
            max = a;
            numMax = 1;
        } else {
            max = b;
            if (a == b) {
                numMax = 1;
            } else {
                numMax = 2;
            }
        }
        if (c > max) {
            max = c;
            numMax = 3;
        }
        System.out.println(numMax);
    }

    public static void condition11(int a, int b, int c) {
       /* int max = a > b ? a : b;
        max = c > max ? c : max;*/
//        int min = a < b ? a : b;
//        min = c < min ? c : min;

        int max;
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        System.out.println(max - min);
    }

    public static void condition12(int a, int b, int c) {
        int count = 0;
        if (a % 2 == 0 || a % 10 == 7) {
            count++;
        }
        if (b % 2 == 0 || b % 10 == 7) {
            count++;
        }
        if (c % 2 == 0 || c % 10 == 7) {
            count++;
        }
        System.out.println(count);
    }

    public static void condition13(int a, int b, int c) {
       /* int q = (a + b + c) % 2 != 0 ? 2 : -1;
        a *= q;
        b *= q;
        c *= q;
        System.out.println(a + " " + b + " " + c);*/

        if ((a + b + c) % 2 != 0) {
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            a *= -1;
            b *= -1;
            c *= -1;
        }
        System.out.println(a + " " + b + " " + c);
    }

    public static void condition14(int a, int b, int c) {
      /*  int m = a;
        if (a % 10 == 4 || b % 10 == 4 || c % 10 == 4) {
            m = b > m ? b : m;
            m = c > m ? c : m;
        }
        else {
            m = b < m ? b : m;
            m = c < m ? c : m;
        }
        System.out.println(m);*/

        int max;
        int min;
        if ((a % 10 == 4) || (b % 10 == 4) || (c % 10 == 4)) {
            if (a > b) {
                max = a;
            } else {
                max = b;
            }
            if (max < c) {
                max = c;
            }
            System.out.println(max);
        } else {
            if (a < b) {
                min = a;
            } else {
                min = b;
            }
            if (min > c) {
                min = c;
            }
            System.out.println(min);
        }
    }

    public static void condition15(int a, int b, int c) {
        if (a + b == c) {
            System.out.println(String.format("%d + %d = %d", a, b, c));
        }
        else if (a - b == c) {
            System.out.println(String.format("%d - %d = %d", a, b, c));
        }
        else {
            System.out.println(String.format("%d + %d = %d, %d - %d = %d ", a, b, a + b, a, b, a - b));
        }
      //  String.format("%d + %d = %d", a, b, a + b);

        if (a + b == c) {
            System.out.println(a + " + " + b + " = " + c);
        } else if (a - b == c) {
            System.out.println(a + " - " + b + " = " + c);
        } else {
            int d, s;
            s = a + b;
            d = a - b;
            System.out.println(a + " + " + b + " = " + s + ", " + a + " - " + b + " = " + d);
        }
    }

    public static void condition16(int a, int b) {
        if (a > b) {
            System.out.println("Вася");
        } else if (a < b) {
            System.out.println("Петя");
        } else {
            System.out.println("Ничья");
        }
    }

    public static void condition17(int a, int b) {
        int c;
        if (a - b < 0) {
            c = ((a - b) * -1);
        } else {
            c = a - b;
        }
        System.out.println(c);
        //    System.out.println(Math.abs(a - b));
     //   System.out.println(a > b ? a - b : b - a);
    }

    public static void condition18(int a, int b) {
        //a - b > 2 || b - a >= 2 ? "YES" : "NO"

        int c;
        if (a - b < 0) {
            c = ((a - b) * -1);
        } else {
            c = a - b;
        }
        if (c >= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void condition19(char u, char p) {
     /*   if (v == p) {
            System.out.println("ничья");
        }
        else if (v == 'k' && p == 'n' || v == 'n' && p == 'b' || v == 'b' && p == 'k') {
            System.out.println("Вася");
        }
        else {
            System.out.println("Петя");
        }*/

        char win = 0;
        if (u == 'k' && p == 'n') {
            win = 'k';
        } else if (u == 'b' && p == 'n') {
            win = 'n';
        } else if (u == 'b' && p == 'k') {
            win = 'b';
        }
        if (u == p) {
            System.out.println("Ничья");
        } else if (win == u) {
            System.out.println("Вася");
        } else {
            System.out.println("Петя");
        }
    }

    public static void condition20(int r, int m, int s) {

        if (r >= m + s) {
            System.out.println("и то, и другое");
        }
        else if (r >= m) {
            System.out.println("мороженое");
        }
        else if (r >= s) {
            System.out.println("шоколад");
        }
        else {
            System.out.println("ничего");
        }

        if (m + s <= r) {
            System.out.println("И то, и другое");
        } else {
            if (m <= r) {
                System.out.println("Мороженное");
            } else if (s > r) {
                System.out.println("Ничего");
            } else {
                System.out.println("Шоколад");
            }
        }
    }

    public static void main(String[] args) {
//        condition1(5);
//        condition1(0);
//        condition1(-1);
//        condition2(5);
//        condition2(0);
//        condition2(-1);
//        condition3(5);
//        condition3(0);
//        condition3(-1);
//        condition4(4, 6);
//        condition4(5, 6);
//        condition4(7, 4);
//        condition5(4, 5, 6);
//        condition5(4, 3, 5);
//        condition5(7, 6, 5);
//        condition6(4, 7, 8);
//        condition6(3, 5, 6);
//        condition6(3, 5, 7);
//        condition7(5, 8, 2);
//        condition7(3, 5, 6);
//        condition7(7, 7, 2);
//        condition8(5, 8, 2);
//        condition8(3, 5, 6);
//        condition8(-1, -2, -3);
//        condition9(5, 8, 2);
//        condition9(3, 5, 6);
//        condition9(-1, -2, -3);
//        condition10(5, 8, 2);
//        condition10(3, 5, 6);
//        condition10(7, 7, 2);
//        condition11(5, 8, 2);
//        condition11(3, 5, 6);
//        condition11(20, 5, 10);
//        condition12(10, 17, 25);
//        condition12(3, 7, 9);
//        condition12(6, 7, 8);
//        condition12(11, 13, 15);
//        condition13(1, 2, 3);
//        condition13(2, 3, 4);
//        condition13(3, 3, 3);
//        condition14(3, 4, 5);
//        condition14(5, 6, 7);
//        condition14(4, 24, 14);
//        condition15(10, 20, 30);
//        condition15(30, 20, 10);
//        condition15(3, 4, 5);
//        condition16(20, 15);
//        condition16(15, 20);
//        condition16(10, 10);
//        condition17(20, 15);
//        condition17(20, 25);
//        condition17(10, 10);
//        condition18(20, 15);
//        condition18(20, 22);
//        condition18(10, 11);
//        condition18(10, 10);
//        condition19('k', 'n');
//        condition19('b', 'n');
//        condition19('b', 'k');
//        condition19('n', 'n');
//        condition20(100, 30, 40);
//        condition20(100, 50, 100);
//        condition20(100, 120, 100);
//        condition20(100, 120, 120);

    }
}
