import java.util.ArrayList;
public class Board {
    public static void boardPrint(int[][] othellos) {
        for (int i = 0; i < 8; i++){
            System.out.print("-------------------------\n");
            for (int j = 0; j < 8; j++) {
                int a = othellos[i][j];
                System.out.print("|");
                if (a == 0) {
                    System.out.print("  ");
                } else if (a == 1) {
                    System.out.print("›");
                } else if (a == 2) {
                    System.out.print("œ");
                }
            }
            System.out.println("|");
        }
        System.out.print("-------------------------\n");
    }
    public static void canPutBoard(int[][] othellos, ArrayList<Othello> arrayList) {
        int count = 0; 
        for (int i = 0; i < 8; i++){
            System.out.print("-------------------------\n");
            for (int j = 0; j < 8; j++) {
                int a = othellos[i][j];
                System.out.print("|");
                if (a == 0) {
                    for (int k = 0 ;k < arrayList.size(); k++) {
                        if (arrayList.get(k).getPlase()[0] == i&&arrayList.get(k).getPlase()[1] == j) {
                            if (count >= 0&& count <=9) {
                                System.out.print(count + " ");
                                count++;
                                break;
                            } else {
                                System.out.print(count);
                                count++;
                                break;
                            } 
                        } else if (k + 1== arrayList.size()) {
                            System.out.print("  ");
                        }
                    }
                } else if (a == 1) {
                    System.out.print("›");
                } else if (a == 2) {
                    System.out.print("œ");
                }
            }
            System.out.println("|");
        }
        System.out.print("-------------------------\n");
    }
    public static int[][] boardReset () {
        int[][] othellos = {
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,1,2,0,0,0},
            {0,0,0,2,1,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0}
        };
        return othellos;
    }
}