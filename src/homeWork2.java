public class homeWork2 {
    public static void main(String[] args) {
        System.out.println(checkAmount(10,11));
        checkInteger(0);
        System.out.println(checkBoolean(4));
        print("Hi", 5);
    }

    public static boolean checkAmount(int a, int b) {
        int c = a + b;
        if (c >= 10 & c <= 20) {
            return true;
        }
        return false;
    }

    public static void checkInteger (int a) {
        if (a < 0) {
            System.out.println("Отрицательное число");
        } else {
            System.out.println("Положительное число");
        }
    }

    public static boolean checkBoolean (int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void print (String a, int b) {
        while (b > 0) {
            System.out.println(a);
            b --;
        }
    }
}


