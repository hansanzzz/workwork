//我需要建立兩個英雄，兩個英雄都有移動以及攻擊和QWER，需要附值到移動速度，以及他們的QWER各不相同


public class uanwork {
    public static void main(String[] args){
        Gangplank gp= new Gangplank(125,325);
//        System.out.println(gp.attackrange);
        gp.name();
        gp.attack();
        gp.move();
        gp.usedskills();

    }
}