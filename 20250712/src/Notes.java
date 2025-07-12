import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        char word = 'a';
        System.out.println("a的大写是： " + (char)(word - 32));
    }
    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个数值： ");
        int b = scanner.nextInt();
        System.out.println("输入第二个数值： ");
        int a = scanner.nextInt();
        System.out.println("两数之和： " + (a + b) + "两数之差： " + (a - b) + "两数乘积： " + (a * b) + "两数求余： " + (a % b) + "两数求商： " + (a / b));
    }
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入长： " );
        int a = scanner.nextInt();
        System.out.println("输入宽： " );
        int h = scanner.nextInt();
        System.out.println("矩形的面积为： " + a * h + "矩形的周长为： " + (a + h) * 2);
    }
    public static void main4(String[] args) {
        double Cc = 36.5;
        double Ff = Cc * 9 / 5 + 32 ;
        System.out.println("华氏度为： " + Ff);
    }
    public static void main3(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b: " + (a && b));
        System.out.println("a || b: " + (a || b));
        System.out.println("! b: " + ( ! b));
        int age = 20;
        boolean has = true;
        boolean canDrive = (age >= 18) && has;
        System.out.println("Can Drive: " + canDrive);
    }
    public static void main2(String[] args) {
        byte a ;
        short b ;
        int c ;
        long h;
        float d ;
        double e ;
        char f ;
        boolean g ;
        System.out.println("byteMax: " + Byte.MAX_VALUE);
        System.out.println("byteMin: " + Byte.MIN_VALUE);
        System.out.println("shortMax: " + Short.MAX_VALUE);
        System.out.println("shortMin: " + Short.MIN_VALUE);
        System.out.println("intMax: " + Integer.MAX_VALUE);
        System.out.println("intMin: " + Integer.MIN_VALUE);
        System.out.println("longMax: " + Long.MAX_VALUE);
        System.out.println("longMin: " + Long.MIN_VALUE);
        System.out.println("CharMax: " + Character.MAX_VALUE);
        System.out.println("CharMin: " + Character.MIN_VALUE);


    }
    public static void main1(String[] args) {
        byte a = 19;
        byte b = 19;
        //byte c = a + b;
    }
}
