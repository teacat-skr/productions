import java.util.ArrayList;
public class Demo {
    public static void main(String[] args) {
        ArrayList<Othello> arrayList = new ArrayList<Othello>();
        int[] a = {3,3};
        Othello othello1 = new Othello(a, 1);
        othello1.setCanReverese(2, 1);
        int[][] b = Board.boardReset();
        arrayList.add(othello1);
        Board.canPutBoard(b, arrayList);
    }
}