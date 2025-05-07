import java.util.Scanner;
public class bmicount{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("請輸入你的名字");
    String name = scanner.nextLine();
    System.out.println("你好，" + name);

    System.out.println("請輸入你的身高(cm)");
    double height = scanner.nextDouble();
    System.out.println("你的身高是:" + height);
    height /= 100;

    System.out.println("請輸入你的體重(kg)");
    double weight = scanner.nextDouble();
    System.out.println("你的體重是:" + weight);

    double bmi = weight/Math.pow(height,2);
    bmi = (Math.round(bmi*100)/100.0);
    System.out.println("你的BMI是:" + bmi );

}
}