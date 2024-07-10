public class Test_03 {
    public static void main(String[] args) {
        // 宣告兩個整數變數length和width，分別賦值為8和5
        int length = 8;
        int width = 5;

        // 計算長方形的面積和周長
        int area = length * width;
        int perimeter = 2 * (length + width);

        // 使用System.out.printf()方法格式化輸出結果
        System.out.printf("長方形面積: %d%n", area);
        System.out.printf("長方形周長: %d%n", perimeter);
    }
}
