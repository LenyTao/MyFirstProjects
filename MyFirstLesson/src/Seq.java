import java.util.*;

public class Seq {
    //    public static void seq1(Iterator<int[]> a) {
//        for (int num: a.next() ){                    //next() - Возвращает следующий указанный элемент во время итерации.
//            System.out.println(num);
//        }
//        System.out.println();
//
//    }
    public static void seq1(Iterator<Integer> a) {
        while (a.hasNext()) {
            System.out.println(a.next());
        }
        System.out.println();
    }

    public static void seq2(Iterator<Integer> a) {
        int sum = 0;
        while (a.hasNext()) {
            sum += a.next();
        }
        System.out.println(sum);
        System.out.println();
    }

    public static void seq3(Iterator<Integer> a) {
        double srAr = 0;
        int del = 0;
        while (a.hasNext()) {
            srAr += a.next();
            del++;
        }
        System.out.println(srAr / del);
    }

    public static void seq4(Iterator<Integer> a) {
        int max = a.next();
        while (a.hasNext()) {
            int num = a.next();
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
        System.out.println();
    }

    public static void seq5(Iterator<Integer> a) {
        int count = 1;
        int numPos = 1;
        int min = a.next();
        while (a.hasNext()) {
            count++;
            int num = a.next();
            if (min > num) {
                numPos = count;
            }
        }
        System.out.println(numPos);
    }

    public static void seq6(Iterator<Integer> a) {
        int count = 1;
        int numPos = 1;
        int max = a.next();
        while (a.hasNext()) {
            count++;
            int num = a.next();
            if (max <= num) {
                numPos = count;
            }
        }
        System.out.println(numPos);
    }

    public static void seq7(Iterator<Integer> a) {
        boolean negativ = false;
        while (a.hasNext()) {
            int num = a.next();
            if (num < 0) {
                negativ = true;
            }
        }
        System.out.println(negativ);
    }

    public static void seq8(Iterator<Integer> a) {

        boolean sort = true;
        int num;
        int z = a.next();
        while (a.hasNext()) {
            num = z;
            z = a.next();
            if (num >= z) {
                sort = false;
                break;
            }
        }
        System.out.println(sort);
    }

    public static void seq9(Iterator<Integer> a) {
        boolean unSort = true;
        int num;
        int z = a.next();
        while (a.hasNext()) {
            num = z;
            z = a.next();
            if (num < z) {
                unSort = false;
                break;
            }
        }
        System.out.println(unSort);
    }

    public static void seq10(Iterator<Integer> a) {
        int count = 0;
        int num;
        int z = a.next();
        while (a.hasNext()) {
            num = z;
            z = a.next();
            if (num < z) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void seq11(Iterator<Integer> a) {

//        int n = 0;
//        boolean found = false;
//        while (a.hasNext()) {
//            n++;
//            int x = a.next();
//            if (n % 2 == 0 && x <= 0) {
//                found = true;
//                break;
//            }
//        }

        a.next();
        boolean positiveNum = true;
        while (a.hasNext()) {
            int num = a.next();
            if (num < 0) {
                positiveNum = false;
                break;
            } else if (a.hasNext()) {
                a.next();
            }
        }
        System.out.println(positiveNum);
    }

    public static void seq12(Iterator<Integer> a) {
        int sumA = 0;
        int sumB = 0;
        while (a.hasNext()) {
            int num = a.next();
            sumB += num;
            sumA += sumB;
        }
        System.out.println(sumA);
    }

    public static void seq13(Iterator<Integer> a) {
        //        дописать через счётчик
        int num1 = 0;
        int count = 0;
        boolean isSort = true;
        while (a.hasNext()) {
            count++;
            int num = a.next();
            if (count % 2 == 0) {
                if (num < num1) {
                    isSort = false;
                    break;
                } else {
                    num1 = num;
                }
            }
        }
        System.out.println(isSort);
    }

    public static void seq14(Iterator<Integer> a) {

        int num1 = a.next();
        int count = 0;
        boolean isSort = true;
        while (a.hasNext()) {
            count++;
            int num = a.next();
            if (count % 2 == 0) {
                if (num1 < num) {
                    isSort = false;
                    break;
                } else {
                    num1 = num;
                }
            }
        }
        System.out.println(isSort);
    }

    public static void seq15(Iterator<Integer> a) {
//        int q = 1;
//        int sum = 0;
//        while (a.hasNext()) {
//            sum += a.next() * q;
//            q *= -1;
//        }

        int sum = a.next();
        while (a.hasNext()) {
            int num = a.next();
            sum += (num * -1);
            if (a.hasNext()) {
                sum += a.next();
            }
        }
        System.out.println(sum);
    }

    public static void seq16(Iterator<Integer> a) {
        int numPos = 0;
        int numNeg = 0;
        int num;
        while (a.hasNext()) {
            num = a.next();
            if (num > 0) {
                numPos++;
            } else {
                numNeg++;
            }
        }
        System.out.println(numPos + " " + numNeg);
    }

    public static void seq17(Iterator<Integer> a) {
        int count = 0;
        int num;
        while (a.hasNext()) {
            num = a.next();
            count++;
            if (num % 2 == 0) {
                break;
            }
            if (!a.hasNext()) {
                count = 0;
            }
        }
        System.out.println(count);
    }

    public static void seq18(Iterator<Integer> a) {
        int sum = 0;
        int count = 0;
        int num;
        while (a.hasNext()) {
            num = a.next();
            count++;
            if (num % 2 == 0) {
                sum += count;
            }
        }
        System.out.println(sum);
    }

    public static void seq19(Iterator<Integer> a) {
        int sumPos = 0;
        int sumNum = 0;
        int count = 0;
        int num;
        while (a.hasNext()) {
            num = a.next();
            count++;
            if (num % 2 != 0) {
                sumPos += count;
                sumNum += num;
            }
        }
        System.out.println(sumPos + " " + sumNum);
    }

    public static void seq20(Iterator<int[]> a) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int[] array;
        int[] finalArray = {};
        while (a.hasNext()) {
            array = a.next();
            sum = array[0] + array[1];
//            for (int z : array) {
//                sum += z;
//            }
            if (maxSum < sum) {
                maxSum = sum;
                finalArray = array;
            }
//            sum = 0;
        }
        System.out.println(Arrays.toString(finalArray));
    }

    public static void seq21(Iterator<int[]> a) {

        int minArea = Integer.MAX_VALUE;
        while (a.hasNext()) {
            int area = 1;
            for (int z : a.next()) {

                area *= z;
            }
            if (area < minArea) {
                minArea = area;
            }

        }
        System.out.println(minArea);
    }

    public static void seq22(Iterator<int[]> a) {
        int perimetr = 0;
        int maxPerimetr = 0;
        while (a.hasNext()) {
            for (int z : a.next()) {
                perimetr += z;
            }
            perimetr *= 2;
            if (perimetr > maxPerimetr) {
                maxPerimetr = perimetr;
            }
            perimetr = 0;
        }
        System.out.println(maxPerimetr);
    }

    public static void seq23(Iterator<Integer> a) {

        int m1 = a.next();
        int m2 = a.next();
        if (m2 > m1) {
            int t = m1;
            m1 = m2;
            m2 = t;
        }
        while (a.hasNext()) {
            int x = a.next();
            if (x > m1) {
                m2 = m1;
                m1 = x;
            } else if (x > m2) {
                m2 = x;
            }
        }

//        int max1 = a.next();
//        int num;
//        int max2 = 0;
//        while (a.hasNext()) {
//            num = a.next();
//            if (max2 == 0) {
//                max2 = num;
//            }
//            if (max1 <= num) {
//                max2 = max1;
//                max1 = num;
//            } else {
//                if (max2 < num) {
//                    max2 = num;
//                }
//            }
//        }
        System.out.println(m1 + " " + m2);
    }

    public static void seq24(Iterator<Integer> a) {
        int num;
        int finalSum = Integer.MIN_VALUE;
        int sum = a.next();
        while (a.hasNext()) {
            num = a.next();
            sum += num;
            if (sum > finalSum) {
                finalSum = sum;
            }
            sum = num;
        }
        System.out.println(finalSum);
    }

    public static void seq25(Iterator<Integer> a) {

//        int num = a.next();
//        int k = 1;
//        while (a.hasNext()) {
//            int x = a.next();
//            if (x != num) {
//                System.out.println(k);
//                num = x;
//                k = 1;
//            }
//            else {
//                k++;
//            }
//        }
//        System.out.println(k);

        int countOne = 1;
        int countZero = 1;
        int num = a.next();
        int num2;
        while (a.hasNext()) {
            num2 = a.next();
            if (num == num2) {
                if (num == 0) {
                    countZero++;
                } else {
                    countOne++;
                }
            } else {
                if (num == 0) {
                    System.out.println(countZero);
                } else {
                    System.out.println(countOne);
                }
            }
            num = num2;
            if (!a.hasNext()) {
                if (num2 == 1) {
                    System.out.println(countOne);
                } else {
                    System.out.println(countZero);
                }
            }
        }
        System.out.println();
    }

    public static void seq26(Iterator<Integer> a) {
        int num = a.next();
        int num2;
        int amount = 1;
        while (a.hasNext()) {
            num2 = a.next();
            if (num != num2) {
                amount++;
            }
            num = num2;
        }
        System.out.println(amount);
    }

    public static void seq27(Iterator<Integer> a) {
        int num = a.next();
        int len = 1;
        int maxLen = 1;
        while (a.hasNext()) {
            int x = a.next();
            if (x == num) {
                len++;
            } else {
                num = x;
                maxLen = Math.max(maxLen, len);
                len = 1;
            }
        }
        System.out.println(Math.max(maxLen, len));

//        int maxLong = 1;
//        int num = a.next();
//        int num2;
//        int maximumLong = 1;
//
//        while (a.hasNext()) {
//            num2 = a.next();
//            if (num == num2) {
//                maxLong++;
//            }
//            else {
//                maxLong = 1;
//            }
//            if (maximumLong < maxLong) {
//                maximumLong = maxLong;
//            }
//            num = num2;
//        }
//
//        System.out.println(maximumLong);
    }

    public static void seq28(Iterator<Integer> a) {
        int num = a.next();
        int len = 1;
        int maxLen = 1;
        int firstMaxStart = 1;
        int currentStart = 1;
        int i = 1;
        while (a.hasNext()) {
            i++;
            int x = a.next();
            if (x == num) {
                len++;
            } else {
                num = x;
                if (len > maxLen) {
                    firstMaxStart = currentStart;
                    maxLen = len;
                }
                len = 1;
                currentStart = i;
            }
        }
        System.out.println(len > maxLen ? currentStart : firstMaxStart);
//        int num = a.next();
//        int num2;
//        int longGroup = 1;
//        int count = 1;
//        int k = 0;
//        while (a.hasNext()) {
//            num2 = a.next();
//            if (num != num2) {
//                count++;
//                k = 0;
//            } else {
//                longGroup = count - k;
//                count++;
//                k++;
//            }
//            num = num2;
//        }
//        System.out.println(longGroup);
    }

    public static void seq29(Iterator<Integer> a) {
        int num = a.next();
        int len = 1;
        int maxLen = 1;
        int firstMaxStart = 1;
        int currentStart = 1;
        int i = 1;
        while (a.hasNext()) {
            i++;
            int x = a.next();
            if (x == num) {
                len++;
            } else {
                num = x;
                if (len >= maxLen) {
                    firstMaxStart = currentStart;
                    maxLen = len;
                }
                len = 1;
                currentStart = i;
            }
        }
        System.out.println(len >= maxLen ? currentStart : firstMaxStart);
//        int num = a.next();
//        int num2;
//        int position = 0;
//        int longGroup=0;
//        int k = 0;
//        int z = 0;
//        while (a.hasNext()) {
//            position++;
//            num2 = a.next();
//            if (num == num2) {
//                longGroup = position - k;
//                k++;
//                z++;
//            } else {
//                k = 0;
//            }
//            num = num2;
//        }
//        if (z == 0) {
//            longGroup = position + 1;
//        }
//        System.out.println(longGroup);
    }

    public static void seq30(Iterator<Integer> a) {
        int sum = a.next();
        int pos = 1;
        int ans = 0;
        while (a.hasNext()) {
            pos++;
            int x = a.next();
            if (x != sum) {
                ans = pos;
                break;
            }
            sum += x;
        }
        System.out.println(ans);

//        int position = 2;
//        int num = 0;
//        int num1 = a.next();
//        int num2;
//        int isTrueLaw = 0;
//        while (a.hasNext()) {
//            num2 = a.next();
//            num += num1;
//            if (num == num2) {
//                num1 = num2;
//                position++;
//            } else {
//                isTrueLaw = position;
//                break;
//            }
//        }
//        System.out.println(isTrueLaw);
    }

    public static void seq31(Iterator<Integer> a) {
        int position = 2;
        int num1 = a.next();
        int num2 = a.next();
        int isTrueLaw = 0;

        while (a.hasNext()) {
            position++;
            int num3 = a.next();
            if (num1 + num2 == num3) {
                num1 = num2;
                num2 = num3;
            } else {
                isTrueLaw = position;
                break;
            }

        }
        System.out.println(isTrueLaw);
    }

    public static void seq32(Iterator<Integer> a) {

        int i = 1;
        int sum1 = 0;
        int sum2 = 0;
        while (a.hasNext()) {
            i++;
            if (i % 2 == 0) {
                sum1 += a.next();
            } else {
                sum2 += a.next();
            }
        }

//        int num, num2;
//        int sum1 = 0, sum2 = 0;
//        while (a.hasNext()) {
//            num = a.next();
//            sum1 += num;
//            if (a.hasNext()) {
//                num2 = a.next();
//                sum2 += num2;
//            }
//        }
        System.out.println(sum1 == sum2);
    }

    public static void seq33(Iterator<Integer> a, int k) {
        int ak = 1;
        int pos = 0;
        while (a.hasNext()) {
            pos++;
            int x = a.next();
            if (x < ak) break;
            if (pos == k) {
                ak = x;
            }
        }
        System.out.println(pos-1);

        int num1 = 0;
        int counter = 0;
        int position = 0;
        while (a.hasNext()) {
            position++;
            int num = a.next();
            if (position == k && num != 0) {
                counter++;
                num1 = num;
            } else {
                if (num >= num1 && num != 0) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
//        ArrayList<Integer> newList = new ArrayList<Integer>();
//        while (a.hasNext()) {
//            num = a.next();
//            position++;
//            if (position == k) {
//                middleElem = num;
//            }
//            newList.add(num);
//        }
//        ListIterator<Integer> listIter = newList.listIterator();
//        while (listIter.hasNext()) {
//            num1 = listIter.next();
//            if (num1 >= middleElem && num1 != 0) {
//                counter++;
//            }
//        }
//        System.out.println(counter);
//        System.out.println();
    }


    public static void main(String[] args) {
//        seq1(Arrays.asList(4, 1, 2).iterator());
//        seq1(Arrays.asList(777).iterator());
//        seq1(Arrays.asList(-1, -2, -3).iterator());

//        seq1(Arrays.asList(new int[]{4, 1, 2}).iterator());
//        seq1(Arrays.asList(new int[]{777}).iterator());
//        seq1(Arrays.asList(new int[]{-1, -2, -3}).iterator());
//
//        seq2(Arrays.asList(4, -1, 2).iterator());
//        seq2(Arrays.asList(777).iterator());
//        seq2(Arrays.asList(-1, -2, -3).iterator());
//        seq3(Arrays.asList(4, 2, 6).iterator());
//        seq3(Arrays.asList(4, 3, -1).iterator());
//        seq3(Arrays.asList(7, 1, 1, 1).iterator());
//        seq4(Arrays.asList(4, 2, 6).iterator());
//        seq4(Arrays.asList(-4, -3).iterator());
//        seq4(Arrays.asList(7, 1, 1).iterator());
//        seq5(Arrays.asList(4, 5, 1, 6).iterator());
//        seq5(Arrays.asList(-3, -4).iterator());
//        seq5(Arrays.asList(3, 7, 3).iterator());
//        seq6(Arrays.asList(4, 5, 1, 6).iterator());
//        seq6(Arrays.asList(-3, -4).iterator());
//        seq6(Arrays.asList(3, 7, 3, 7).iterator());
//        seq7(Arrays.asList(4, 5, 1, 6).iterator());
//        seq7(Arrays.asList(-3, -4).iterator());
//        seq7(Arrays.asList(3, 7, -3, 7).iterator());
//        seq8(Arrays.asList(1, 4, 5, 10).iterator());
//        seq8(Arrays.asList(3, 4, 5, 4).iterator());
//        seq8(Arrays.asList(3, 3, 4).iterator());
//        seq8(Arrays.asList(-3, -2, -1).iterator());
//        seq9(Arrays.asList(10, 5, 4, 1).iterator());
//        seq9(Arrays.asList(4, 3, 2, 3).iterator());
//        seq9(Arrays.asList(4, 3, 3).iterator());
//        seq9(Arrays.asList(-3, -2, -1).iterator());
//        seq10(Arrays.asList(4, 7, 9).iterator());
//        seq10(Arrays.asList(-3, -2, -4).iterator());
//        seq10(Arrays.asList(10).iterator());
//        seq11(Arrays.asList(-4, 7, -9).iterator());
//        seq11(Arrays.asList(-3, 2, -4, -2).iterator());
//        seq11(Arrays.asList(10, 10).iterator());
//        seq12(Arrays.asList(2, 2, 3).iterator());
//        seq12(Arrays.asList(3, 2, 1).iterator());
//        seq12(Arrays.asList(1, 1, 1, 1).iterator());
//        seq13(Arrays.asList(-4, 7, -9).iterator());
//        seq13(Arrays.asList(-3, 2, -4, -2).iterator());
//        seq13(Arrays.asList(-1, 3, -2, 7, -3).iterator());
//        seq13(Arrays.asList(-1, 3, -2, 7, -3, 5).iterator());
//        seq14(Arrays.asList(1, 1, 1).iterator());
//        seq14(Arrays.asList(5, 2, 2).iterator());
//        seq14(Arrays.asList(-1, 3, 0, 7, -3).iterator());
//        seq14(Arrays.asList(1, 3, 0, 7, 2).iterator());
//        seq15(Arrays.asList(1, -1, 1).iterator());
//        seq15(Arrays.asList(5, 2, 2).iterator());
//        seq15(Arrays.asList(-1, 3, 0, 7, -3).iterator());
//        seq16(Arrays.asList(1, -1, 1).iterator());
//        seq16(Arrays.asList(5, 2, 2).iterator());
//        seq16(Arrays.asList(-1, 3, 0, 7, -3).iterator());
//        seq17(Arrays.asList(5, 2, 4).iterator());
//        seq17(Arrays.asList(2, 6, 4, 8).iterator());
//        seq17(Arrays.asList(7, 3, 1).iterator());
//        seq18(Arrays.asList(1, 2, 4).iterator());
//        seq18(Arrays.asList(2, 6, 4, 8).iterator());
//        seq18(Arrays.asList(7, 3, 1).iterator());
//        seq19(Arrays.asList(1, 2, 4).iterator());
//        seq19(Arrays.asList(7, 3, 1).iterator());
//        seq19(Arrays.asList(2, 6, 4, 8).iterator());
//        seq20(Arrays.asList(new int[]{1, 1}, new int[]{0, 3}, new int[]{2, 1}).iterator());
//        seq20(Arrays.asList(new int[]{-1, 1}, new int[]{0, 0}, new int[]{-2, 0}).iterator());
//        seq20(Arrays.asList(new int[]{5, 10}).iterator());
//        seq21(Arrays.asList(new int[]{1, 3}, new int[]{3, 1}, new int[]{2, 1}).iterator());
//        seq21(Arrays.asList(new int[]{5, 5}, new int[]{3, 4}, new int[]{4, 4}).iterator());
//        seq21(Arrays.asList(new int[]{5, 3}).iterator());
//        seq22(Arrays.asList(new int[]{1, 3}, new int[]{3, 1}, new int[]{2, 1}).iterator());
//        seq22(Arrays.asList(new int[]{5, 5}, new int[]{3, 4}, new int[]{4, 4}).iterator());
//        seq22(Arrays.asList(new int[]{5, 3}).iterator());
//        seq23(Arrays.asList(3, 1, 5, 2).iterator());
//        seq23(Arrays.asList(-1, -2, -3, -4).iterator());
//        seq23(Arrays.asList(4, 5, 3, 5).iterator());
//        seq24(Arrays.asList(3, 2, 5, 1).iterator());
//        seq24(Arrays.asList(-1, -2, -3, -4).iterator());
//        seq24(Arrays.asList(3, 5, 4, 6).iterator());
//        seq25(Arrays.asList(0, 1, 0, 1).iterator());
//        seq25(Arrays.asList(1, 1, 1, 0).iterator());
//        seq25(Arrays.asList(0, 0, 1, 1).iterator());
//        seq26(Arrays.asList(0, 1, 0, 1).iterator());
//        seq26(Arrays.asList(1, 1, 1, 0).iterator());
//        seq26(Arrays.asList(0, 0, 0, 0).iterator());
//        seq27(Arrays.asList(0, 1, 0, 1).iterator());
//        seq27(Arrays.asList(1, 1, 1, 0).iterator());
//        seq27(Arrays.asList(0, 0, 0, 0).iterator());

//        seq27(Arrays.asList(0, 0, 1, 1, 1,1).iterator());

//        seq28(Arrays.asList(0, 1, 0, 1).iterator());
//        seq28(Arrays.asList(0, 1, 1, 1).iterator());
//        seq28(Arrays.asList(1, 0, 1, 1).iterator());
//        seq29(Arrays.asList(0, 1, 0, 1).iterator());
//        seq29(Arrays.asList(0, 1, 1, 1).iterator());
//        seq29(Arrays.asList(1, 0, 1, 1).iterator());
//        seq29(Arrays.asList(1, 1, 1, 0).iterator());
//        seq30(Arrays.asList(3, 3, 6, 12).iterator());
//        seq30(Arrays.asList(0, 0, 0, 0).iterator());
//        seq30(Arrays.asList(1, 1, 1, 1).iterator());
//        seq31(Arrays.asList(1, 1, 2, 3, 5).iterator());
//        seq31(Arrays.asList(5, 6, 11, 17, 18).iterator());
//        seq31(Arrays.asList(1, 1, 1, 1).iterator());
//        seq32(Arrays.asList(1, 1, 2, 7, 5).iterator());
//        seq32(Arrays.asList(2, 3, 2, 3, 2).iterator());
//        seq32(Arrays.asList(1, 1, 1, 1, 1).iterator());
        seq33(Arrays.asList(10, 9, 8, 7, 7, 7, 5, 5).iterator(), 5);
        seq33(Arrays.asList(3, 2, 1, 0, 0).iterator(), 5);
        seq33(Arrays.asList(0, 0, 0, 0).iterator(), 5);
    }
}
