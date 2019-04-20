import java.util.ArrayList;
public class  CanPut {
    //おける場所を判別し、座標と置いた場合の裏返せる個数をオブジェクトの配列として返却する
    public static ArrayList<Othello> canPutOthello (int[][] othellos, int putcolor) {
        ArrayList<Othello> arrayList = new ArrayList<Othello>(); 
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int [] plase = {0,0};
                int a = othellos[i][j];
                int count = 0;
                if (a == 1 || a == 2) {

                } else if (a == 0) {
                    int putcolor2 = putcolor;
					if((i ==0 )&&(j == 0)) {
                        plase[0] = i;
                        plase[1] = j;
                        Othello othello = new Othello(plase, putcolor2);
                        if (putcolor2 != othellos[i][j + 1] && 0 != othellos[i][j + 1] ) {
                            count = 0;
                            while (putcolor2 != othellos[i][j + 1 + count] && 0 != othellos[i][j + 1 + count]) {
                                if ((j+1+count)==7) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i][j + 1 + count]){
                                othello.setCanReverese(3, count);
                            }
                        }
                        if (putcolor2 != othellos[i + 1][j + 1] && 0 != othellos[i + 1][j + 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i + 1 + count][j + 1 + count] && 0 != othellos[i + 1 + count][j + 1 + count]) {
                                if ((i+1+count)==7 || (j+1+count)==7) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i + 1 + count][j + 1 + count]){
                                othello.setCanReverese(4, count);
                            }
                        }
                        if (putcolor2 != othellos[i + 1][j] && 0 != othellos[i + 1][j]) {
                            count = 0;
                            while (putcolor2 != othellos[i + 1 + count][j] && 0 != othellos[i + 1 + count][j]) {
                                if ((i+1+count)==7) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i + 1 + count][j]){
                                othello.setCanReverese(5, count);
                            }
                        }
                        for (int k = 3; k <= 5 ; k++) {
                            if (othello.getCanReverse()[k -1] != 0) {
                                arrayList.add(othello);
                                break;
                            }
                        }
                    } else if ((i ==0 )&&(j == 7)) {
                        plase[0] = i;
                        plase[1] = j;
                        Othello othello = new Othello(plase, putcolor2);
                        if (putcolor2 != othellos[i + 1][j] && 0 != othellos[i + 1][j]) {
                            count = 0;
                            while (putcolor2 != othellos[i + 1 + count][j] && 0 != othellos[i + 1 + count][j]) {
                                if ((i+1+count)==7) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i + 1 + count][j]){
                                othello.setCanReverese(5, count);
                            }
                        }
                        if (putcolor2 != othellos[i + 1][j - 1] && 0 != othellos[i + 1][j - 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i + 1 + count][j - 1 - count] && 0 != othellos[i + 1 + count][j - 1 - count]) {
                                if ((i+1+count)==7 || (j-1-count)==0) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i + 1 + count][j - 1 - count]){
                                othello.setCanReverese(6, count);
                            }
                        }
                        if (putcolor2 != othellos[i][j - 1] && 0 != othellos[i][j - 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i][j - 1 - count] && 0 != othellos[i][j - 1 - count]) {
                                if ((j-1-count)==0) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i][j - 1 - count]){
                                othello.setCanReverese(7, count);
                            }
                        }
                        for (int k = 5; k <= 7 ; k++) {
                            if (othello.getCanReverse()[k -1] != 0) {
                                arrayList.add(othello);
                                break;
                            }
                        }
                    } else if ((i ==7 )&&(j == 0)) {
                        plase[0] = i;
                        plase[1] = j;
                        Othello othello = new Othello(plase, putcolor2);
                        if (putcolor2 != othellos[i - 1][j] && 0 != othellos[i - 1][j]) {
                            count = 0;
                            while (putcolor2 != othellos[i - 1 - count][j] && 0 != othellos[i - 1 - count][j]) {
                                if ((i-1-count)==0) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i - 1 - count][j]){
                                othello.setCanReverese(1, count);
                            }
                        }
                        if (putcolor2 != othellos[i - 1][j + 1] && 0 != othellos[i - 1][j + 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i - 1 - count][j + 1 + count] && 0 != othellos[i - 1 - count][j + 1 + count]) {
                                if ((i-1-count)==0 || (j+1+count)==7) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i - 1 - count][j + 1 + count]){
                                othello.setCanReverese(2, count);
                            }
                        }
                        if (putcolor2 != othellos[i][j + 1] && 0 != othellos[i][j + 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i][j + 1 + count] && 0 != othellos[i][j + 1 + count]) {
                                if ((j+1+count)==7) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i][j + 1 + count]){
                                othello.setCanReverese(3, count);
                            }
                        }
                        for (int k = 1; k <= 8 ; k++) {
                            if (othello.getCanReverse()[k -1] != 0) {
                                arrayList.add(othello);
                                break;
                            }
                        }
                    } else if ((i ==7 )&&(j == 7)) {
                        plase[0] = i;
                        plase[1] = j;
                        Othello othello = new Othello(plase, putcolor2);
                        if (putcolor2 != othellos[i - 1][j] && 0 != othellos[i - 1][j]) {
                            count = 0;
                            while (putcolor2 != othellos[i - 1 - count][j] && 0 != othellos[i - 1 - count][j]) {
                                if ((i-1-count)==0) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i - 1 - count][j]){
                                othello.setCanReverese(1, count);
                            }
                        }
                        if (putcolor2 != othellos[i][j - 1] && 0 != othellos[i][j - 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i][j - 1 - count] && 0 != othellos[i][j - 1 - count]) {
                                if ((j-1-count)==0) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i][j - 1 - count]){
                                othello.setCanReverese(7, count);
                            }
                        }
                        if (putcolor2 != othellos[i - 1][j - 1] && 0 != othellos[i - 1][j - 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i - 1 - count][j - 1 - count] && 0 != othellos[i - 1 - count][j - 1 - count]) {
                                if ((i-1-count)==0 || (j-1-count)==0) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i - 1 - count][j - 1 - count]){
                                othello.setCanReverese(8, count);
                            }
                        }
                        for (int k = 1; k <= 8 ; k++) {
                            if (othello.getCanReverse()[k -1] != 0) {
                                arrayList.add(othello);
                                break;
                            }
                        }
                    } else if (i == 0) {
                        plase[0] = i;
                        plase[1] = j;
                        Othello othello = new Othello(plase, putcolor2);
                        if (putcolor2 != othellos[i][j + 1] && 0 != othellos[i][j + 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i][j + 1 + count] && 0 != othellos[i][j + 1 + count]) {
                                if ((j+1+count)==7) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i][j + 1 + count]){
                                othello.setCanReverese(3, count);
                            }
                        }
                        if (putcolor2 != othellos[i + 1][j + 1] && 0 != othellos[i + 1][j + 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i + 1 + count][j + 1 + count] && 0 != othellos[i + 1 + count][j + 1 + count]) {
                                if ((i+1+count)==7 || (j+1+count)==7) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i + 1 + count][j + 1 + count]){
                                othello.setCanReverese(4, count);
                            }
                        }
                        if (putcolor2 != othellos[i + 1][j] && 0 != othellos[i + 1][j]) {
                            count = 0;
                            while (putcolor2 != othellos[i + 1 + count][j] && 0 != othellos[i + 1 + count][j]) {
                                if ((i+1+count)==7) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i + 1 + count][j]){
                                othello.setCanReverese(5, count);
                            }
                        }
                        if (putcolor2 != othellos[i + 1][j - 1] && 0 != othellos[i + 1][j - 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i + 1 + count][j - 1 - count] && 0 != othellos[i + 1 + count][j - 1 - count]) {
                                if ((i+1+count)==7 || (j-1-count)==0) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i + 1 + count][j - 1 - count]){
                                othello.setCanReverese(6, count);
                            }
                        }
                        if (putcolor2 != othellos[i][j - 1] && 0 != othellos[i][j - 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i][j - 1 - count] && 0 != othellos[i][j - 1 - count]) {
                                if ((j-1-count)==0) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i][j - 1 - count]){
                                othello.setCanReverese(7, count);
                            }
                        }
                        for (int k = 1; k <= 8 ; k++) {
                            if (othello.getCanReverse()[k -1] != 0) {
                                arrayList.add(othello);
                                break;
                            }
                        }
                    } else if (i == 7) {
                        plase[0] = i;
                        plase[1] = j;
                        Othello othello = new Othello(plase, putcolor2);
                        if (putcolor2 != othellos[i - 1][j] && 0 != othellos[i - 1][j]) {
                            count = 0;
                            while (putcolor2 != othellos[i - 1 - count][j] && 0 != othellos[i - 1 - count][j]) {
                                if ((i-1-count)==0) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i - 1 - count][j]){
                                othello.setCanReverese(1, count);
                            }
                        }
                        if (putcolor2 != othellos[i - 1][j + 1] && 0 != othellos[i - 1][j + 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i - 1 - count][j + 1 + count] && 0 != othellos[i - 1 - count][j + 1 + count]) {
                                if ((i-1-count)==0 || (j+1+count)==7) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i - 1 - count][j + 1 + count]){
                                othello.setCanReverese(2, count);
                            }
                        }
                        if (putcolor2 != othellos[i][j + 1] && 0 != othellos[i][j + 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i][j + 1 + count] && 0 != othellos[i][j + 1 + count]) {
                                if ((j+1+count)==7) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i][j + 1 + count]){
                                othello.setCanReverese(3, count);
                            }
                        }
                        if (putcolor2 != othellos[i][j - 1] && 0 != othellos[i][j - 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i][j - 1 - count] && 0 != othellos[i][j - 1 - count]) {
                                if ((j-1-count)==0) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i][j - 1 - count]){
                                othello.setCanReverese(7, count);
                            }
                        }
                        if (putcolor2 != othellos[i - 1][j - 1] && 0 != othellos[i - 1][j - 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i - 1 - count][j - 1 - count] && 0 != othellos[i - 1 - count][j - 1 - count]) {
                                if ((i-1-count)==0 || (j-1-count)==0) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i - 1 - count][j - 1 - count]){
                                othello.setCanReverese(8, count);
                            }
                        }
                        for (int k = 1; k <= 8 ; k++) {
                            if (othello.getCanReverse()[k -1] != 0) {
                                arrayList.add(othello);
                                break;
                            }
                        }
                    } else if (j == 0) {
                        plase[0] = i;
                        plase[1] = j;
                        Othello othello = new Othello(plase, putcolor2);
                        if (putcolor2 != othellos[i - 1][j] && 0 != othellos[i - 1][j]) {
                            count = 0;
                            while (putcolor2 != othellos[i - 1 - count][j] && 0 != othellos[i - 1 - count][j]) {
                                if ((i-1-count)==0) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i - 1 - count][j]){
                                othello.setCanReverese(1, count);
                            }
                        }
                        if (putcolor2 != othellos[i - 1][j + 1] && 0 != othellos[i - 1][j + 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i - 1 - count][j + 1 + count] && 0 != othellos[i - 1 - count][j + 1 + count]) {
                                if ((i-1-count)==0 || (j+1+count)==7) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i - 1 - count][j + 1 + count]){
                                othello.setCanReverese(2, count);
                            }
                        }
                        if (putcolor2 != othellos[i][j + 1] && 0 != othellos[i][j + 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i][j + 1 + count] && 0 != othellos[i][j + 1 + count]) {
                                if ((j+1+count)==7) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i][j + 1 + count]){
                                othello.setCanReverese(3, count);
                            }
                        }
                        if (putcolor2 != othellos[i + 1][j + 1] && 0 != othellos[i + 1][j + 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i + 1 + count][j + 1 + count] && 0 != othellos[i + 1 + count][j + 1 + count]) {
                                if ((i+1+count)==7 || (j+1+count)==7) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i + 1 + count][j + 1 + count]){
                                othello.setCanReverese(4, count);
                            }
                        }
                        if (putcolor2 != othellos[i + 1][j] && 0 != othellos[i + 1][j]) {
                            count = 0;
                            while (putcolor2 != othellos[i + 1 + count][j] && 0 != othellos[i + 1 + count][j]) {
                                if ((i+1+count)==7) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i + 1 + count][j]){
                                othello.setCanReverese(5, count);
                            }
                        }
                        for (int k = 1; k <= 8 ; k++) {
                            if (othello.getCanReverse()[k -1] != 0) {
                                arrayList.add(othello);
                                break;
                            }
                        }
                    } else if (j == 7) {
                        plase[0] = i;
                        plase[1] = j;
                        Othello othello = new Othello(plase, putcolor2);
                        if (putcolor2 != othellos[i - 1][j] && 0 != othellos[i - 1][j]) {
                            count = 0;
                            while (putcolor2 != othellos[i - 1 - count][j] && 0 != othellos[i - 1 - count][j]) {
                                if ((i-1-count)==0) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i - 1 - count][j]){
                                othello.setCanReverese(1, count);
                            }
                        }
                        if (putcolor2 != othellos[i + 1][j] && 0 != othellos[i + 1][j]) {
                            count = 0;
                            while (putcolor2 != othellos[i + 1 + count][j] && 0 != othellos[i + 1 + count][j]) {
                                if ((i+1+count)==7) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i + 1 + count][j]){
                                othello.setCanReverese(5, count);
                            }
                        }
                        if (putcolor2 != othellos[i + 1][j - 1] && 0 != othellos[i + 1][j - 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i + 1 + count][j - 1 - count] && 0 != othellos[i + 1 + count][j - 1 - count]) {
                                if ((i+1+count)==7 || (j-1-count)==0) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i + 1 + count][j - 1 - count]){
                                othello.setCanReverese(6, count);
                            }
                        }
                        if (putcolor2 != othellos[i][j - 1] && 0 != othellos[i][j - 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i][j - 1 - count] && 0 != othellos[i][j - 1 - count]) {
                                if ((j-1-count)==0) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i][j - 1 - count]){
                                othello.setCanReverese(7, count);
                            }
                        }
                        if (putcolor2 != othellos[i - 1][j - 1] && 0 != othellos[i - 1][j - 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i - 1 - count][j - 1 - count] && 0 != othellos[i - 1 - count][j - 1 - count]) {
                                if ((i-1-count)==0 || (j-1-count)==0) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i - 1 - count][j - 1 - count]){
                                othello.setCanReverese(8, count);
                            }
                        }
                        for (int k = 1; k <= 8 ; k++) {
                            if (othello.getCanReverse()[k -1] != 0) {
                                arrayList.add(othello);
                                break;
                            }
                        }
                    } else {
                        plase[0] = i;
                        plase[1] = j;
                        Othello othello = new Othello(plase, putcolor2);
                        if (putcolor2 != othellos[i - 1][j] && 0 != othellos[i - 1][j]) {
                            count = 0;
                            while (putcolor2 != othellos[i - 1 - count][j] && 0 != othellos[i - 1 - count][j]) {
                                if ((i-1-count)==0) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i - 1 - count][j]){
                                othello.setCanReverese(1, count);
                            }
                        }
                        if (putcolor2 != othellos[i - 1][j + 1] && 0 != othellos[i - 1][j + 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i - 1 - count][j + 1 + count] && 0 != othellos[i - 1 - count][j + 1 + count]) {
                                if ((i-1-count)==0 || (j+1+count)==7) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i - 1 - count][j + 1 + count]){
                                othello.setCanReverese(2, count);
                            }
                        }
                        if (putcolor2 != othellos[i][j + 1] && 0 != othellos[i][j + 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i][j + 1 + count] && 0 != othellos[i][j + 1 + count]) {
                                if ((j+1+count)==7) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i][j + 1 + count]){
                                othello.setCanReverese(3, count);
                            }
                        }
                        if (putcolor2 != othellos[i + 1][j + 1] && 0 != othellos[i + 1][j + 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i + 1 + count][j + 1 + count] && 0 != othellos[i + 1 + count][j + 1 + count]) {
                                if ((i+1+count)==7 || (j+1+count)==7) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i + 1 + count][j + 1 + count]){
                                othello.setCanReverese(4, count);
                            }
                        }
                        if (putcolor2 != othellos[i + 1][j] && 0 != othellos[i + 1][j]) {
                            count = 0;
                            while (putcolor2 != othellos[i + 1 + count][j] && 0 != othellos[i + 1 + count][j]) {
                                if ((i+1+count)==7) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i + 1 + count][j]){
                                othello.setCanReverese(5, count);
                            }
                        }
                        if (putcolor2 != othellos[i + 1][j - 1] && 0 != othellos[i + 1][j - 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i + 1 + count][j - 1 - count] && 0 != othellos[i + 1 + count][j - 1 - count]) {
                                if ((i+1+count)==7 || (j-1-count)==0) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i + 1 + count][j - 1 - count]){
                                othello.setCanReverese(6, count);
                            }
                        }
                        if (putcolor2 != othellos[i][j - 1] && 0 != othellos[i][j - 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i][j - 1 - count] && 0 != othellos[i][j - 1 - count]) {
                                if ((j-1-count)==0) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i][j - 1 - count]){
                                othello.setCanReverese(7, count);
                            }
                        }
                        if (putcolor2 != othellos[i - 1][j - 1] && 0 != othellos[i - 1][j - 1]) {
                            count = 0;
                            while (putcolor2 != othellos[i - 1 - count][j - 1 - count]) {
                                if ((i-1-count)==0 || (j-1-count)==0) {
                                    break;
                                }
                                count++;
                            }
                            if (putcolor2 == othellos[i - 1 - count][j - 1 - count]){
                                othello.setCanReverese(8, count);
                            }
                        }
                        for (int k = 1; k <= 8 ; k++) {
                            if (othello.getCanReverse()[k -1] != 0) {
                                arrayList.add(othello);
                                break;
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}