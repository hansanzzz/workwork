//class books1{
//    public static void main (String[] args) {
//        int score = 87;
//        String text = score + "分，";
//        if (score >= 85) {
//            text += "贏得10,000元獎學金！\n";
//        } else if (score >= 75) {
//            text += "贏得5,000元獎學金！\n";
//        } else {
//            text += "再努力！\n";
//        }
//        System.out.print(text);
//    }
//}



import java.util.Scanner;
class books1{
public static void main(String[] args) {
    System.out.println("請輸入有幾位學生");
    Scanner s =new Scanner(System.in);//創造掃描器s

    int number =s.nextInt();//一個變數number，儲存使用者輸入
    int[] peoples =new int[number];//創建一個陣列，陣列大小跟使用者輸入的number一樣
    System.out.println("請依序輸入學生的成績:");

    for( int y=0;y<peoples.length;y++){
        peoples[y]=s.nextInt();}//

    int sum= 0; //初始化一個值，用來存放總分

    for(int i=0;i<peoples.length;i++){
        sum += peoples[i];
    }//把前面偵測到輸入的分數，加總在一起

    System.out.println("總分是:" + sum);
    System.out.println("總共有" + peoples.length + "名學生");
    double t = (double)sum/peoples.length;
    System.out.printf("平均分數是: %.2f\n", t);

}
        }