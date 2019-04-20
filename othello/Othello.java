public class Othello {
    private int[] plase = {0,0};
    private int type = 0; //empty=0,black=1,white=2
    private int[] canReverse = {0,0,0,0,0,0,0,0};//12時の方向から時計回りに8方向とひっくり返す数を記憶
    public Othello(int[] plase, int type){
        this.plase = plase;
        this.type = type;
    }
    public int[] getPlase (){
        return this.plase;
    }
    public int getType () {
        return this.type;
    }
    public void setCanReverese (int direction,int number) {
        this.canReverse[direction - 1] = number;
    }
    public int[] getCanReverse () {
        return this.canReverse;
    }

}