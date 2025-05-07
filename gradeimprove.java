import java.util.Scanner;
//请帮小明同学设计一个程序，输入上次考试成绩（int）和本次考试成绩（int），然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）。
public class gradeimprove {
        public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);
                System.out.println("請輸入上次的考試成績");
                int lastScore = scanner.nextInt();
                System.out.println("請輸入這次的考試成績");
                int currentScore2 = scanner.nextInt();

                double improve = ((double) (currentScore2 - lastScore) /lastScore )*100;
                System.out.printf( "比上次成績進步了: %.2f%%%n" , improve);
        }
}