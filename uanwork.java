//我需要建立兩個英雄，兩個英雄都有移動以及攻擊和QWER，需要附值到移動速度，以及他們的QWER各不相同
import java.util.Scanner;

public class uanwork {
    public static void main(String[] args){
        Gangplank gp= new Gangplank(125,325);
//        System.out.println(gp.attackrange);
        gp.name();
        gp.attack();
        gp.move();


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("按下QWER施放技能!" + "或是輸入exit來退出");
            String action = scanner.nextLine().toUpperCase();

            if(action.equals("GG")){
                System.out.println("嫩");
                break;
            }

        switch (action){
            case "Q":
                gp.Q();
                break;
            case "W":
                gp.W();
                break;
            case "E":
                gp.E();
                break;
            case "R":
                gp.R();
                break;
            case "A":
                gp.attack();
                break;
            default:
                System.out.println("請輸入QWER或是A來進行動作");
        }
        }
    }
}