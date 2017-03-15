import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by sf2016 on 15.03.2017.
 */
public class brackets {

    public static void main(String[] args) {
        String str = "()()(())";
        boolean isRight = true;
        int openInd = -2;
        int closeInd = -2;
        Queue<Integer> openBr = new ArrayDeque<>();

        while (openInd != -1 || closeInd != -1){
            openInd = str.indexOf("(", openInd+1);
            if (openInd > -1) openBr.add(openInd);
            closeInd = str.indexOf(")", closeInd+1);
            Integer tmp = openBr.remove();
            if(tmp == null && closeInd > -1){
                isRight = false;
                break;
            }else if(tmp != null && closeInd == -1){
                isRight = false;
                break;
            }else if(tmp > closeInd){
                isRight = false;
                break;
            }
        }
        System.out.println(isRight?"right":"wrong");
    }
}
