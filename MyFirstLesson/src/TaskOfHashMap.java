import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.sql.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TaskOfHashMap {


    public static void obj1(String s, int n) {


        HashMap<String, Object> map = new HashMap<>();
        map.put("name", s);
        map.put("age", n);

        System.out.println(map);
    }

    public static void obj2(HashMap<String, Object> a) {
        a.put("name", "Вася");
        System.out.println(a);
    }

    public static void obj3(HashMap<String, Object> a) {
        if (!a.containsKey("name")) {
            a.put("name", "undefined");
        }
        if (!a.containsKey("age")) {
            a.put("age", "undefined");
        }

        System.out.println(a.get("name") + " " + a.get("age"));
    }

    public static void obj4(HashMap<String, Object> a, String s) {
        a.put(s, s.toUpperCase());
        System.out.println(a);
    }

    public static void obj5(HashMap<String, Object> a, String s) {
        a.remove("name");
        a.remove(s);
        System.out.println(a);
    }

    public static void obj6(HashMap<String, Integer> a) {
        if (a.get("a") > a.get("b")) {
            a.put("a", a.get("a") + a.get("b"));
        } else {
            a.put("a", a.get("a") + 1);
            a.put("b", a.get("b") + 1);
        }
        System.out.println(a);
    }

    public static void obj7(HashMap<String, Object> a) {
        String[] array = new String[a.size()];
        int i = 0;
        for (HashMap.Entry entry : a.entrySet()) {
            array[i] = entry.getKey().toString();
            i++;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void obj8(HashMap<String, Object> a) {
        String[] array = new String[a.size()];
        int i = 0;
        for (HashMap.Entry entry : a.entrySet()) {
            array[i] = entry.getValue().toString();
            i++;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void obj9(HashMap<String, Object> a, String[] keys) {
        boolean[] arrayAnswer = new boolean[keys.length];
        for (int i = 0; i < keys.length; i++) {
            for (HashMap.Entry entry : a.entrySet()) {
                if (keys[i].equals(entry.getKey().toString())) {
                    arrayAnswer[i] = true;
                    break;
                } else {
                    arrayAnswer[i] = false;
                }
            }
        }
        System.out.println(Arrays.toString(arrayAnswer));
        System.out.println();
    }

    public static void obj10(int n) {
        HashMap<Integer, Integer> finalMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            finalMap.put(i, n);
        }
        System.out.println(finalMap);
    }

    public static void obj11(int n) {
        HashMap<Character, Integer> finalMap = new HashMap<>();
        char key = 97;
        for (int i = 0; i < n; i++) {
            int value = key;
            finalMap.put(key, value);
            key++;
        }
        System.out.println(finalMap);
    }

    public static void obj12(String s) {
        //не в порядке добавления
        HashMap<Character, Integer> finalMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            finalMap.put(s.charAt(i), (int) s.charAt(i));
        }
        System.out.println(finalMap);
    }

    public static void obj13(String s) {
        HashMap<Character, Integer> finalMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            finalMap.put(s.charAt(i), (int) s.charAt(i));
        }
        String[] array = new String[finalMap.size()];
        int i = 0;
        for (HashMap.Entry entry : finalMap.entrySet()) {
            array[i] = entry.getKey().toString();
            i++;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void obj14(String s) {
        HashMap<Character, Integer> finalMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            if (finalMap.containsKey(s.charAt(i))) {
                count = 2;
            }
            finalMap.put(s.charAt(i), count);
        }
        System.out.println(finalMap);
    }

    public static void obj15(String[] a, HashMap<String, String> d) {
        String[] finalArray = new String[a.length];
        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = a[i];
            if (d.containsKey(finalArray[i])) {
                finalArray[i] = d.get(finalArray[i]);
            }
        }
        System.out.println(Arrays.toString(finalArray));
    }

    public static void obj16(HashMap<String, String> d) {
        HashMap<String, String> finalMap = new HashMap<>();
        for (HashMap.Entry entry : d.entrySet()) {
            finalMap.put(entry.getValue().toString(), entry.getKey().toString());
        }
        System.out.println(finalMap);
    }

    public static void obj17(String[] a) {
        HashMap<String, String> finalMap = new HashMap<>();
        for (int i = 0; i < a.length; i += 2) {
            finalMap.put(a[i], a[i + 1]);
        }
        System.out.println(finalMap);
    }

    public static void obj18(HashMap<String, Integer> d) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (HashMap.Entry entry : d.entrySet()) {
            if ((int) entry.getValue() > max) {
                max = (int) entry.getValue();
            }
            sum += (int) entry.getValue();
        }
        System.out.println(max + " " + sum);
    }

    public static void obj19(HashMap<String, Integer> d) {
        String maxKey = "";
        int max = Integer.MIN_VALUE;
        for (HashMap.Entry entry : d.entrySet()) {
            if ((int) entry.getValue() > max) {
                maxKey = entry.getKey().toString();
                max = (int) entry.getValue();
            }
        }
        System.out.println(maxKey);
    }

    public static void obj20(String[][] a) {
        HashMap<String, String> finalMap = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            finalMap.put(a[i][0], a[i][1]);
        }
        System.out.println(finalMap);
    }

    public static void obj21(String[] a, String[] b) {
        HashMap<String, String> finalMap = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            finalMap.put(a[i], b[i]);
        }
        System.out.println(finalMap);
    }

    public static void obj22(Object[] a) {
        HashMap<String, String> intermediateMap;
        HashMap<String, String> finalMap = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            intermediateMap = (HashMap<String, String>) a[i];
            String key = "";
            String value = "";
            for (HashMap.Entry entry : intermediateMap.entrySet()) {
                if (key.equals("")) {
                    key = entry.getValue().toString();
                } else {
                    value = entry.getValue().toString();
                }
            }
            finalMap.put(key, value);
        }
        System.out.println(finalMap);
    }

    public static void obj23(HashMap<String, String> a) {
        String[] finalArray = new String[a.size() * 2];
        int i = 1;
        for (HashMap.Entry entry : a.entrySet()) {
            finalArray[i - 1] = entry.getKey().toString();
            finalArray[i] = entry.getValue().toString();
            i += 2;
        }
        System.out.println(Arrays.toString(finalArray));
    }

    public static void bubbleSort(int[] array) {
        int middle = 0;
        for (int i = 1; i < array.length; i++) {
            for (int m = 1; m < array.length; m++) {
                if (array[m - 1] > array[m]) {
                    middle = array[m - 1];
                    array[m - 1] = array[m];
                    array[m] = middle;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static boolean isPalinromli(String str) {
        StringBuilder sb = new StringBuilder(str);
        String str2 = sb.reverse().toString();
        System.out.println(str.equals(str2));
        return str.equals(str2);
//        boolean answer = true;
//        int d = str.length() - 1;
//
//        for (int i = 0; i < str.length(); i++) {
//            if (i < d) {
//                if (str.charAt(i) != str.charAt(d)) {
//                    answer = false;
//                    break;
//                }
//                d--;
//            }
//
//        }
//        System.out.println(answer);
//        return answer;
    }




    public int binarySearch(int[] sortedArray, int key) {

        int proverka = 1;
        Arrays.sort(sortedArray);
        int first = 0;
        int last = sortedArray.length - 1;
        int index = -1;

        while (first <= last) {
            int middle = (first + last) / 2;
            if (sortedArray[middle] == key) {
                index = middle;
                break;
            } else if (sortedArray[middle] > key) {
                last = middle - 1;
                proverka++;
            } else if (sortedArray[middle] < key) {
                first = middle + 1;
                proverka++;
            }
        }
        if (index == -1) {
            System.out.println("Число отсутствует в массиве");
        } else {
            System.out.println("Число присутствует в массиве под индексом " + index);
        }
        System.out.println("Было произведено " + proverka + " проверок");
        return index;


    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


//        TaskOfHashMap test = new TaskOfHashMap();
//
//        test.binarySearch(new int[]{1, 3, 2, 4, 5, 6, 8, 9, 7, 10}, 5);

//        int counter, num, item, array[], first, last;
//
//        //Создаем объект Scanner для считывания чисел, введенных пользователем
//        Scanner input = new Scanner(System.in);
//        System.out.println("Введите количество элементов массива: ");
//        num = input.nextInt();
//
//        // Создаем массив введенного пользователем размера
//        array = new int[num];
//
//        System.out.println("Введите " + num + " чисел");
//
//        //Заполняем массив, вводя элементы в консоль
//        for (counter = 0; counter < num; counter++)
//            array[counter] = input.nextInt();
//
//        // сортируем элементы массива, так как для бинарного поиска
//        // элементы массива должны быть отсортированными
//        Arrays.sort(array);
//
//        System.out.println("Введите элемент для бинарного поиска: ");
//        item = input.nextInt();
//        first = 0;
//        last = num - 1;
//
//        // метод принимает начальный и последний индекс, а также число для поиска
//        binarySearch(array, first, last, item);
//    }
//
//
//    // бинарный поиск
//    public static void binarySearch(int[] array, int first, int last, int item) {
//        int position;
//        int comparisonCount = 1;    // для подсчета количества сравнений
//
//        // для начала найдем индекс среднего элемента массива
//        position = (first + last) / 2;
//
//
//        while ((array[position] != item) && (first <= last)) {
//
//            comparisonCount++;
//            if (array[position] > item) {  // если число заданного для поиска
//                last = position - 1; // уменьшаем позицию на 1.
//            } else {
//                first = position + 1;    // иначе увеличиваем на 1
//            }
//            position = (first + last) / 2;
//
//        }
//
//        if (first <= last) {
//            System.out.println(item + " является " + ++position + " элементом в массиве");
//            System.out.println("Метод бинарного поиска нашел число после " + comparisonCount +
//                    " сравнений");
//        } else {
//            System.out.println("Элемент не найден в массиве. Метод бинарного поиска закончил работу после "
//                    + comparisonCount + " сравнений");
//        }


//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c;
//        try {
//            System.out.println(c = a / b);
//        } catch (ArithmeticException e) {
//            System.out.println("На ноль делить нельзя, ошибка: " + e);
//
//        }

//        String url = "jdbc:mysql://localhost:3306/myfistdatabase?verifyServerCertificate=false&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
//        String username = "root";
//        String password = "1234";
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        try (Connection conn = DriverManager.getConnection(url, username, password)) {
//            Statement statement = conn.createStatement();
//            statement.executeUpdate("drop table smartphone");
//            statement.executeUpdate("create  table if not exists Smartphone  (id MEDIUMINT not null auto_increment, name CHAR (30) not null , description CHAR (50)  , PRIMARY key (id));");
//
//            statement.executeUpdate("insert into Smartphone(name, description) values ('iPhone X','Дичь для мажоров')");
//            statement.executeUpdate("insert into Smartphone(name, description) values ('Xiaomi Mi Note 10 Lite','Топ за свои деньги')");
//
//
//            ResultSet resultSet = statement.executeQuery("select * from Smartphone");
//            while (resultSet.next()) {
//                System.out.println(resultSet.getInt("id"));
//                System.out.println(resultSet.getString("name"));
//                System.out.println("-------------");
//            }
//
//        }


//        obj1("Вася", 20);
//        obj1("Петя", 30);
//
//        HashMap<String, Object> map1 = new HashMap<>();
//        map1.put("age", 20);
//        obj2(map1);
//        obj2(new HashMap<String, Object>() {{
//           put("age", 20);
//        }});
//
//        HashMap<String, Object> map2 = new HashMap<>();
//        map2.put("name", "Петя");
//        map2.put("age", 30);
//        obj2(map2);
//       obj2((HashMap) new HashMap<>().put("Петя", 30));
//        obj2((HashMap) new HashMap<>().put(null, null));

//        obj2(new HashMap<String, Object>() {{
//            put("age", 20);
//        }});
//        obj2(new HashMap<String, Object>() {{
//            put("name", "Петя");
//            put("age", 30);
//        }});
//        obj2(new HashMap<>());

//        obj3(new HashMap<String, Object>() {{
//            put("age", 20);
//        }});
//        obj3(new HashMap<String, Object>() {{
//            put("name", "Петя");
//            put("age", 30);
//        }});
//        obj3(new HashMap<>());

//        obj4(new HashMap<String, Object>() {{
//            put("age", 20);
//        }}, "name");
//        obj4(new HashMap<String, Object>() {{
//            put("age", 30);
//            put("name", "Вася");
//        }}, "age");
//        obj4(new HashMap<>(), "0");
//        obj5(new HashMap<String, Object>() {{
//            put("age", 20);
//        }}, "age");
//        obj5(new HashMap<String, Object>() {{
//            put("name", "Петя");
//            put("age", 30);
//        }}, "age");
//        obj5(new HashMap<String, Object>() {{
//            put("age", 20);
//        }}, "name");

//        obj6(new HashMap<String, Integer>() {{
//            put("a", 20);
//            put("b", 10);
//        }});
//        obj6(new HashMap<String, Integer>() {{
//            put("a", 20);
//            put("b", 30);
//        }});
//        obj6(new HashMap<String, Integer>() {{
//            put("a", 20);
//            put("b", 20);
//        }});

//        obj7(new HashMap<String, Object>() {{
//            put("a", 20);
//            put("b", 10);
//            put("0", 30);
//        }});
//        obj7(new HashMap<String, Object>() {{
//            put("name", "Вася");
//            put("age", 20);
//        }});
//        obj7(new HashMap<String, Object>());

//        obj8(new HashMap<String, Object>() {{
//            put("a", 20);
//            put("b", 10);
//            put("0", 30);
//        }});
//        obj8(new HashMap<String, Object>() {{
//            put("name", "Вася");
//            put("age", 20);
//        }});
//        obj8(new HashMap<String, Object>());

//        obj9(new HashMap<String, Object>() {{
//            put("a", 20);
//            put("b", 10);
//            put("0", 30);
//        }}, new String[]{"b", "x", "0"});
//
//        obj9(new HashMap<String, Object>() {{
//            put("name", "Вася");
//            put("age", 20);
//        }}, new String[]{"age", "age", "name"});
//
//        obj9(new HashMap<String, Object>() {{
//        }}, new String[]{"a", "a", "a"});
//        obj10(0);
//        obj10(1);
//        obj10(3);
//        obj11(0);
//        obj11(1);
//        obj11(3);
//        obj12("");
//        obj12("z");
//        obj12("test");
//        obj13("");
//        obj13("abc");
//        obj13("test");
//        obj14("");
//        obj14("abc");
//        obj14("test");
//        obj15(new String[]{"t", "e", "s", "t"}, new HashMap<String, String>() {{
//            put("t", "a");
//            put("e", "b");
//        }});
//        obj15(new String[]{"a", "a", "a"}, new HashMap<String, String>() {{
//            put("a", "b");
//            put("b", "a");
//        }});
//        obj15(new String[]{"t", "e", "s", "t"}, new HashMap<String, String>() {{
//            put("x", "t");
//        }});
//        obj16(new HashMap<String, String>() {{
//            put("a", "x");
//            put("b", "y");
//            put("c", "z");
//        }});
//        obj16(new HashMap<String, String>() {{
//            put("a", "a");
//            put("b", "b");
//            put("c", "c");
//        }});
//        obj16(new HashMap<String, String>() {{
//            put("a", "a");
//            put("b", "a");
//            put("c", "a");
//        }});
//        obj17(new String[]{"a", "b"});
//        obj17(new String[]{"a", "a", "b", "b"});
//        obj17(new String[]{"a", "b", "a", "b"});
//        obj18(new HashMap<String, Integer>() {{
//            put("a", 5);
//            put("b", 7);
//            put("c", 3);
//        }});
//        obj18(new HashMap<String, Integer>() {{
//            put("a", -3);
//            put("b", -5);
//            put("c", -1);
//        }});
//        obj18(new HashMap<String, Integer>() {{
//            put("a", 10);
//            put("a", 20);
//            put("a", -3);
//        }});
//        obj19(new HashMap<String, Integer>() {{
//            put("a", 5);
//            put("b", 7);
//            put("c", 3);
//        }});
//        obj19(new HashMap<String, Integer>() {{
//            put("a", -3);
//            put("b", -5);
//            put("c", -1);
//        }});
//        obj19(new HashMap<String, Integer>() {{
//            put("a", 10);
//            put("b", 20);
//            put("b", 10);
//        }});
//        obj20(new String[][]{new String[]{"key1", "value1"}, new String[]{"key2", "value2"}});
//        obj20(new String[][]{new String[]{"a", "b"}, new String[]{"c", "d"}});
//        obj20(new String[][]{new String[]{"a", "b"}, new String[]{"a", "c"}, new String[]{"a", "d"}});
//        obj21(new String[]{"key1", "key2"}, new String[]{"value1", "value2"});
//        obj21(new String[]{"a", "b"}, new String[]{"c", "d"});
//        obj21(new String[]{"a", "a", "a"}, new String[]{"b", "c", "d"});

//        obj22(
//                new Object[]{
//                        new HashMap<String, String>() {{
//                            put("name", "key1");
//                            put("value", "value1");
//                        }},
//                        new HashMap<String, String>() {{
//                            put("name", "key2");
//                            put("value", "value2");
//                        }}
//                }
//        );
//        obj22(
//                new Object[]{
//                        new HashMap<String, String>() {{
//                            put("name", "a");
//                            put("value", "b");
//                        }},
//                        new HashMap<String, String>() {{
//                            put("name", "c");
//                            put("value", "d");
//                        }}
//                }
//        );
//        obj22(
//                new Object[]{
//                        new HashMap<String, String>() {{
//                            put("name", "a");
//                            put("value", "b");
//                        }},
//                        new HashMap<String, String>() {{
//                            put("name", "a");
//                            put("value", "c");
//                        }}
//                }
//        );
//        obj23(new HashMap<String, String>() {{
//            put("key1", "value1");
//            put("key2", "value2");
//        }});
//        obj23(new HashMap<String, String>() {{
//            put("a", "b");
//            put("c", "d");
//        }});
//        obj23(new HashMap<String, String>() {{
//            put("a", "b");
//            put("a", "c");
//        }});
    }
}
