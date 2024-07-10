import java.util.Scanner;

public class hm_09 {
    public static void main(String[] args) {
        // 創建Scanner對象以從控制台獲取輸入
        Scanner scn = new Scanner(System.in);
        
        // 提示使用者輸入長
        System.out.print("請輸入長方形的長: ");
        double length = scn.nextDouble();
        
        // 提示使用者輸入寬
        System.out.print("請輸入長方形的寬: ");
        double width = scn.nextDouble();
        
        // 計算長方形的面積
        double area = length * width;
        
        // 輸出長方形的面積
        System.out.println("長方形的面積是: " + area);
        
        // 關閉掃描器
        scn.close();
    }
}