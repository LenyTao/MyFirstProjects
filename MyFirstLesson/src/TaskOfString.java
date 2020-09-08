public class TaskOfString {
    public static void string1(String s) {
        System.out.println(s.charAt(0) + " " + s.charAt(s.length() - 1));
    }

    public static void string2(String s) {
        System.out.println(s.startsWith("Hello"));
    }

    public static void string3(String s) {
        System.out.println(s.endsWith("end."));
    }

    public static void string4(String s) {
        System.out.println(s.contains("middle"));
    }

    public static void string5(String s) {
        System.out.println(s.trim());
    }

    public static void string6(String s) {
        System.out.println(s.toUpperCase());
    }

    public static void string7(String s) {
        System.out.println(s.toLowerCase());
    }

    public static void string8(String s) {
        System.out.println(s.indexOf("sub"));
    }

    public static void string9(String s) {
        System.out.println(s.lastIndexOf("sub"));
    }

    public static void string10(String s, int n) {
        System.out.println(new String(new char[n]).replace("\0", s));
    }

    public static void string11(String s) {
        System.out.println(s.substring(s.length() / 2));
    }

    public static void string12(String s) {
        System.out.println(s.substring(0, s.length() / 2));
    }

    public static void string13(char c, String s) {
        s.replaceFirst("" + c, "" + c + c);

        String s1 = Character.toString(c);
        System.out.println(s.replaceFirst(s1, s1 + s1));
    }

    public static void string14(char c, String s, String s0) {
        System.out.println(s.replaceFirst(Character.toString(c), s0 + c));
    }

    public static void string15(char c, String s, String s0) {
        System.out.println(s.replaceFirst(Character.toString(c), c + s0));
    }

    public static void string16(String s, String s0) {
        System.out.println(s.contains(s0));
    }

    public static void string17(String s, String s0) {
        System.out.println(s.replaceFirst(s0, ""));
    }

    public static void string18(String s, String s0, String s1) {
        System.out.println(s.replaceFirst(s0, s1));
    }

    public static void string19(String s, int m, int n) {
        System.out.println(s.substring(m, n));
    }

    public static void string20(String s) {
        int begin = s.indexOf(" ");
        int end = s.lastIndexOf(" ");

        if (begin == end) {
            System.out.println("");
        } else {
            System.out.println(s.substring(begin + 1, end));
        }
    }

    public static void string21(String s, int n) {
        new String(new char[n]).replace('\0', '.');

        if (s.length() >= n) {
            System.out.println(s.substring(s.length() - n));
        } else {
            StringBuilder points = new StringBuilder();
            for (int i = 0; i < n - s.length(); i++) {
                points.append(".");
            }
            System.out.println(points + s);
        }
    }

    public static void string22(int n1, int n2, String s1, String s2) {
        String sNew = s1.substring(0, n1) + s2.substring(s2.length() - n2);
        System.out.println(sNew);
    }

    public static void string23(String s) {

        int k = 0;
        for (String word : s.split(" +")) {
            if (Character.isUpperCase(word.charAt(0))) {
                k++;
            }
        }
        //Character глянуть

        int count = 1;
        if (s.contains(" ")) {
            String one = s.substring(0, s.indexOf(" "));
            String two = s.substring(one.length() + 1);
            if (two != two.toLowerCase()) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void string24(String s) {
        int k = 0;
        for (String num : s.split(" ")) {
            k += Integer.parseInt(num);
        }
        int sum = 0;
        String one;
        int j = s.length();
        for (int i = 0; i < j; i += one.length() + 1) {
            if (s.contains(" ")) {
                one = s.substring(0, s.indexOf(" "));
                sum += Integer.parseInt(one);
                s = s.substring(one.length() + 1, s.length());
            } else {
                one = s;
                sum += Integer.parseInt(one);
            }
        }
        System.out.println(sum);
    }

    public static void string25(String[] a) {
        System.out.println(String.join("; ", a));

        String newString = "";
        for (int i = 0; i < a.length; i++) {
            newString += a[i];
            if (i < a.length - 1) {
                newString += "; ";
            }
        }
        System.out.println(newString);
    }

    public static void string26(String s) {
        boolean z = false;
        for (String word : s.split(" ")) {
            if (word.equals("class")) {
                z = true;
                break;
            }
        }
        if (!z) {
            if (s.length() == 0) {
                s += "class";
            } else {
                s += " class";
            }
        }
        System.out.println(s);
    }

    public static void string27(String s) {
        StringBuilder s1 = new StringBuilder();
        for (String word : s.split(" ")) {
            if (!word.equals("class")) {
                s1.append(" ").append(word);
            }

        }
        System.out.println(s1.toString().trim());
    }

    public static void string28(String s) {

//        String fullName = s.substring(s.lastIndexOf('/') + 1);
//        int dotIdx = fullName.lastIndexOf('.');
//        String ext = fullName.substring(dotIdx + 1);
//        String name = fullName.substring(0, dotIdx);

        String extension, name = "";
        for (String word : s.split("/")) {
            name = word;
        }
        extension = name.substring(0, name.lastIndexOf("."));
        name = name.substring(name.lastIndexOf(".") + 1);
        System.out.println(name + " " + extension);
    }

    public static void main(String[] args) {
//        string1("qwerty");
//        string1("test");
//        string1("a");
//        string2("Hello, world!");
//        string2("Test Hello");
//        string2("Helo");
//        string3("End of string.");
//        string3("This is the end.");
//        string3("This is the end");
//        string4("Middle.");
//        string4("middle is here");
//        string4("String has a middle.");
//        string5(" test ");
//        string5("  a   b");
//        string5("word1   word2   ");
//        string6("test");
//        string6("StRinG");
//        string6("1234, abc");
//        string7("test");
//        string7("StRinG");
//        string7("1234, abc");
//        string8("sub");
//        string8("test sub");
//        string8("susubsub");
//        string9("sub");
//        string9("test sub");
//        string9("susubsub");
//        string10("a", 3);
//        string10("123", 2);
//        string10("qwerty", 0);
//        string11("abc");
//        string11("abcd");
//        string11("qwert");
//        string12("abc");
//        string12("abcdefg");
//        string12("1");
//        string13('b', "abcabc");
//        string13('t', "test");
//        string13('q', "1234");
//        string14('b', "abcabc", "#");
//        string14('t', "test", "%%");
//        string14('q', "1234", "abc");
//        string15('b', "abcabc", "#");
//        string15('t', "test", "%%");
//        string15('q', "1234", "abc");
//        string16("abcabc", "bc");
//        string16("test", "test");
//        string16("1234", "abc");
//        string17("abcabc", "bc");
//        string17("test", "test");
//        string17("1234", "abc");
//        string18("abcabc", "bc", "BC");
//        string18("test", "test", "xyz");
//        string18("1234", "abc", "qwe");
//        string19("abcabc", 2, 5);
//        string19("test", 0, 4);
//        string19("1234", 2, 2);
//        string20("abc abc");
//        string20("test abc qwe xyz");
//        string20("1234  5 678");
//        string21("abc xyz", 3);
//        string21("abc", 7);
//        string21("1234", 4);
//        string22(3, 5, "aaabbb", "cccddd");
//        string22(1, 1, "123", "456");
//        string22(8, 5, "I love cats", "coding");
//        string23("Hello, world");
//        string23("John Smith");
//        string23("JohnSmith");
//        string24("10 20 30");
//        string24("-1 2 -3");
//        string24("0 0 10 -5 -5");
//        string25(new String[]{"abc", "qwe", "asd"});
//        string25(new String[]{"test"});
//        string25(new String[]{});
//        string26("cclass classs");
//        string26("class");
//        string26("");
//        string27("cclass classs");
//        string27("class");
//        string27("class test class");
        string28("/var/www/index.html");
        string28("/var/log/log.01.tar.gz");
        string28("Zadachi na stroki.js");

    }
}
