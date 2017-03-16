/**
 * Created by sf2016 on 15.03.2017.
 */
public class brackets {


    public static void main(String[] args) {
        String str = "(a(b)c)d)";//"(a)(b) c (d(efg))";
        boolean isRight = true;
        int openInd = -2;
        int closeInd = -2;

        while (openInd != -1 || closeInd != -1){
            openInd = str.indexOf("(", openInd+1);
            closeInd = str.indexOf(")", closeInd+1);
            if(openInd<0){
                if (closeInd > -1) {
                    isRight = false;
                    break;
                }
            }else if(closeInd == -1 || openInd > closeInd){
                isRight = false;
                break;
            }
        }
        System.out.println(isRight?"right":"wrong");
    }
}
