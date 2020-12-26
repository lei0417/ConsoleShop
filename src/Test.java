import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入用户名：");
        Scanner sc = new Scanner(System.in);
        String UseName = sc.next();
        System.out.println("您输入的用户名是：" + UseName);

        System.out.println("请输入密码：");
        String UsePassword = sc.next();
        System.out.println("您输入的密码是:" + UsePassword);
    }
}
