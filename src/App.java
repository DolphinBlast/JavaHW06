public class App {
    public static void main(String[] args)
    {
        OverloadingExample OverloadingExample = new OverloadingExample();
        OverloadingExample.show();
        OverloadingExample.show(10);
        OverloadingExample.show(10, 20);
    }
}
class OverloadingExample {

    // 方法1：沒有參數
    void show() {
        System.out.println("沒有參數");
    }

    // 方法2：一個 int 參數
    void show(int num) {
        System.out.println("一個參數：" + num);
    }

    // 方法3：兩個 int 參數
    void show(int num1, int num2) {
        System.out.println("兩個參數：" + num1 + ", " + num2);
    }
}
