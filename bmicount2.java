import java.util.Scanner;
public class bmicount2 {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("請輸入您的身高(cm)");
    double height = scanner.nextDouble();
    height /= 100;

    System.out.println("請輸入您的體重(kg)");
    double weight = scanner.nextDouble();

    double bmi = weight/(Math.pow(height,2));
    bmi = (Math.round(bmi*10)/10.0);
    System.out.println("您的BMI是:" + bmi );

    if(bmi<18.5){
        System.out.println("體重過輕");
    } else if(bmi<24){
    System.out.println("體重正常");
    } else if(bmi<27){
    System.out.println("體重過重");
    } else if(bmi<30){
        System.out.println("輕度肥胖");
    } else if(bmi<35){
        System.out.println("中度肥胖");
    } else if(bmi>=35){
        System.out.println("重度肥胖");
    }
}
}