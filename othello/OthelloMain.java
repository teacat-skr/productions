import java.util.ArrayList;
import java.util.Scanner;
public class OthelloMain {
    public static void main(String[] args) {
        int turn = 0;
        int putcloar = 1;
        int[][] othellos = Board.boardReset();
        
        while (turn < 60) {
            ArrayList<Othello> arrayList = new ArrayList<Othello>();
            arrayList = CanPut.canPutOthello(othellos, putcloar);

            if (arrayList.size() != 0) {
                turn++;
                int read = -1;
                System.out.println(judgeColour(putcloar) + "のターン");
                Board.canPutBoard(othellos, arrayList);
                System.out.println("置く場所を数字で選んでください");
                while (arrayList.size() < read|| read < 0 ) {
                    Scanner scanner = new Scanner(System.in);
                    read = scanner.nextInt();
                    if (arrayList.size() > read && read >= 0 ) {
                        break;
                    }
                    System.out.println("数値が不適です");
                }
                othellos = ReverseOthello.reverse(arrayList.get(read), othellos);
            } 
            if (putcloar == 1) {
                putcloar = 2;
            } else {
                putcloar = 1;
            }
        }
        int count1 = 0;
        for (int i = 0; i < 8;i++) {
            for (int j = 0; j < 8;j++) {
                if (othellos[i][j] == 1) {
                    count1++;
                }
            }
        }
        if (count1 > 32) {
            System.out.print("黒の勝ち");
        } else if (count1 < 32) {
            System.out.print("白の勝ち");
        } else {
            System.out.print("引き分け");
        }

    }
    public static String judgeColour (int putcloar) {
        String colour;
        if (putcloar == 1) {
            colour = "黒";
        } else {
            colour = "白";
        }
        return colour;
    }
}