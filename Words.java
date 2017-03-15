import java.util.Scanner;

/**
 * Created by sf2016 on 15.03.2017.
 */
public class Words {

    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine();

        int lettersNumber = 0;
        int wordsNumber = 0;
        int index = 0;

        str = str.replaceAll("[,.;:\"'?!]", " ").replaceAll("\\s+"," ").trim();

        while (index < str.length() && index > -1 && !str.isEmpty()){
            index = str.indexOf(' ', index+1);
            wordsNumber++;
        }

        lettersNumber = str.replace(" ", "").length();

        System.out.println("number of words = " + wordsNumber);
        System.out.println("number of letters = " + lettersNumber);
    }
}
