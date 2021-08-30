import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class homeWorkLesson8 {
    public static void main(String[] args) {

        //1
        String s1 = "s1";
        String s2 = new String("S2");
        String s3 = new String(s2);

        char[] symbols = {'A', 'B', 'C'};
        String s4 = new String(symbols);

        byte[] bytes = {65, 66, 67};
        String s5 = new String(bytes);

        String s6 = new String(bytes, StandardCharsets.UTF_16);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);

        String s7 = "Десять: " + 5;
        System.out.println(s7);

        System.out.println();
        //2
        String a1 = "Hello world";
        String a2 = "Hello world";
        String a3 = new String(a1);

        String a4 = "Hello ";
        String a5 = "world";
        String a6 = a4 + a5;

        Scanner myScanner = new Scanner(System.in); // "Hello world"

        // tfff
        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));
        System.out.println(a1.equals(a6));
        // System.out.println(a1.equals(myScanner.nextLine()));

        //3
//        String b1 = "";
//        long startTime = System.nanoTime(); // Отметка по времени 1
//        for (int i = 0; i < 300000; i++) {
//            b1 += "a";
//        }
//        long endTime = System.nanoTime(); // Отметка по времени 2
//
//        float result = (endTime - startTime) * 0.000000001f;
//        System.out.println(result);

        StringBuilder sb = new StringBuilder();
        long startTime = System.nanoTime(); // Отметка по времени 1
        for (int i = 0; i < 300000; i++) {
            sb.append("a");
        }
        long endTime = System.nanoTime(); // Отметка по времени 2

        float result = (endTime - startTime) * 0.000000001f;
        System.out.println(result);

        //4 SWING
        //new MyWindow();
        new MyWindow2();

    }
}
