import java.util.Scanner;
import java.util.Random;
class ex02{
    public static void main(String[] args){
 //請用程式算出1天又10小時又17分又36秒，共等於幾秒
        int day = 1;
        int hrs = day*24+10;
        int mins = hrs*60+17;
        int ans = mins*60;
        System.out.println(ans);
//請用程式算出93784秒，是幾天又幾小時又幾分又幾秒
        int total = 93784;
        int min = total/60;
        int remainsec = total%60;
        int hour = min/60;
        int remainmin = min%60;
        int days = hour/24;
        int remainhour = hour%24;

        System.out.println(days + "天" + remainhour + "小時" +  + remainmin +  "分" + remainsec +  "秒");
//請用布林型態的變數以及運算式表示: 如果 有筆電 且 有網路，就可以在家工作
        boolean labtop = true;
        boolean internet = false;
        boolean WFM = labtop && internet;

        if (WFM){
            System.out.println("可以在家工作");
        }else {System.out.println("乖乖回公司上班");
        }
        /*
        李威廉在寫Java作業，電腦開機需要1分鐘，打開Eclipse需要2分鐘，寫1題作業需要3分鐘，且李威廉每天都會將電腦關機。
        李威廉分2天寫，第一天連續寫3題目，第二天連續寫2題，
        請用程式算出李威廉共花多少時間在寫作業上
        */

        int bootTime = 1;
        int eclipseTime = 2;
        int workTime = 3;
/*     加法寫法
        int day1Works = 3;
        int day1Time = bootTime + eclipseTime + (workTime*day1Works);

        int day2Works = 2;
        int day2Time = bootTime + eclipseTime + (workTime*day2Works);

        int totalTime = day1Time + day2Time;
        System.out.println(totalTime);
 */
        //FOR迴圈寫法
        int worksPerDay[] = {2,3};
        int totalTime = 0;
//     for(int i = 0 ; i<worksPerDay.length;i++ ){
//          totalTime = totalTime + bootTime + eclipseTime + (workTime*worksPerDay[i]);
//     }
        for (int works:worksPerDay){
                totalTime += bootTime + eclipseTime + (workTime * works);
        }
     System.out.println("李威廉總共花了" + totalTime + "分鐘來完成作業");

        /*
        請設計一程式，可讀入一個正整數n，隨機印出一個介於1~n的整數
         */
        Scanner scanner = new Scanner(System.in);
         Random random = new Random();
        System.out.println("請輸入一個數字");
         int number =scanner.nextInt();
         if(number<0){
             System.out.println("請輸入一個正整數");
         }else {
             System.out.println("輸入正確，看看你跟我想的是不是同個數字");
         }
             int x = random.nextInt(10)+1;
             System.out.println("我猜你輸入的是:" + x);



    }
}