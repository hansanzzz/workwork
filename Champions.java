//創建一個父類，把共通點移動,攻擊,QWER做出來讓子類繼承
public abstract class Champions{
    abstract void name();
    abstract void attack();
    abstract void move();
    abstract void usedskills();
//    abstract void Q();
//    abstract void W();
//    abstract void E();
//    abstract void R();
    protected int attackrange;
    protected int movespeed;
    protected String[] skills = new String[4];

    public Champions(int attackrange,int movespeed){
        this.attackrange = attackrange;
        this.movespeed = movespeed;
    }






//    abstract useskills(int index);

//    public int getAttackrange() {
//        return attackrange;
//    }
//
//    public void setAttackrange(int attackrange) {
//        this.attackrange = attackrange;
//    }
//
//    public int getMovespeed() {
//        return movespeed;
//    }
//
//    public void setMovespeed(int movespeed) {
//        this.movespeed = movespeed;
//    }
//
//
//    public void Attack(){
//        if(this.attackrange<125){
//            System.out.println("近戰攻擊!");
//        }else {
//            System.out.println("遠程攻擊");
//        }
//    }
}