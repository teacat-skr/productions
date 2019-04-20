public class Othello {
    private int[] plase = {0,0};
    private int type = 0; //empty=0,black=1,white=2
    private int[] canReverse = {0,0,0,0,0,0,0,0};//12‚Ì•ûŒü‚©‚çŒv‰ñ‚è‚É8•ûŒü‚Æ‚Ğ‚Á‚­‚è•Ô‚·”‚ğ‹L‰¯
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