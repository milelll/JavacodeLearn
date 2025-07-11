
import java.util.Scanner;//导入Scanner类（用于读取用户输入）

public class UserInput {
    public static void main(String[] args) {
        //创建Scanner对象，System.in表示从控制台输入
        Scanner scanner = new Scanner(System.in);

        //提示输入姓名
        System.out.print("Enter your name: ");
        //读取一行输入（字符串）
        String name = scanner.nextLine();
        //提示输入年龄
        System.out.print("Enter your age: ");
        //读取年龄
        int age = scanner.nextInt();
        //打印结果
        System.out.println("Hello ," + name + "!You are " + age + " year old ！");
        //关闭Scanner（释放资源）
        scanner.close();

    }
}
