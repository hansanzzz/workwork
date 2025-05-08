class Gangplank extends Champions {
    private final String name = "Gangplank";

    public Gangplank(int attackrange, int movespeed) {
        super(attackrange, movespeed);
        skills[0] = "鎗火談判";
        skills[1] = "吃他媽橘子";
        skills[2] = "炸藥桶";
        skills[3] = "下大雨";
    }
    public void name(){
        System.out.println("英雄名字是:" + name);
    }

    public void attack(){
        System.out.println("近戰攻擊!");
    }
    public void move(){
        System.out.println("英雄移動" );
    }
    @Override
    public void usedskills(){
        for (int i = 0; i< skills.length;i++){
            System.out.println(skills[i]);
        }
    }



//    public void Q(){
//        System.out.println("鎗火談判" );
//    }
//    public void W(){
//        System.out.println("吃他媽橘子" );
//    }
//    public void E(){
//        System.out.println("炸藥桶" );
//    }
//    public void R(){
//        System.out.println("一堆落石之書" );
//    }

}


