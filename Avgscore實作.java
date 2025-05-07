import java.util.Scanner;

public class Avgscore實作 {
    public static void main(String[] args) {
            System.out.println("請輸入有幾位學生");
            Scanner s =new Scanner(System.in);//創造掃描器s

            int number =s.nextInt();//一個變數number，儲存使用者輸入
            int[] peoples =new int[number];//創建一個陣列，陣列大小跟使用者輸入的number一樣
            System.out.println("請依序輸入學生的成績:");

            for( int y=0;y<peoples.length;y++){//
                peoples[y]=s.nextInt();}
            /*這裡很重要!!，這裡的peoples[y]就等於陣列大小，然後遍例每一個陣列儲存使用者輸入的分數*/

            int sum= 0; //初始化一個值，用來存放總分

            for(int i=0;i<peoples.length;i++){
                sum += peoples[i];
            }//把前面偵測到輸入的分數，加總在一起

            System.out.println("總分是:" + sum);
            System.out.println("總共有" + peoples.length + "名學生");
            double t = (double)sum/peoples.length;//這裡有個重點，因為前面都是輸入int，這裡必須使用double轉型!
            // t用來儲存平均分    總分/人數
            System.out.printf("平均分數是: %.2f", t);
            //使用printf控制小數點輸出，%.2f等於是控制在小數點後兩位，%.2f需要寫在字串符內

        }
    }

