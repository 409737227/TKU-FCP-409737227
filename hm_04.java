public class hm_04 {
    public static void main(String[] args) {
        // 宣告並初始化兩個整數變數a 和b，值分別為10和5
        int a = 10;
        int b = 5;
        
        // 計算和、差、積和商
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;  // 整數相除會取整數部分
        
        // 打印計算結果
        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + difference);
        System.out.println("a * b = " + product);
        System.out.println("a / b = " + quotient);
    }
}
