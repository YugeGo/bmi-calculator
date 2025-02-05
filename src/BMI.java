import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身高（单位：m）");
        double height = sc.nextDouble();
        System.out.println("请输入体重（单位：kg）");
        double weight = sc.nextDouble();
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("过轻");
        } else if (bmi < 24) {
            System.out.println("正常");
        } else if (bmi < 28) {
            System.out.println("过重");
        } else if (bmi < 32) {
            System.out.println("肥胖");
        } else {
            System.out.println("严重肥胖");
        }
        sc.close();
        System.out.println("BMI=" + String.format("%.2f", bmi));
    }
}
