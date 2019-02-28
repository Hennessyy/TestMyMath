import javax.swing.*;

public class wordCounter {

    public static void main(String[] args) {


     String thisString = "I have five words here";


      int l = countWords(thisString);

        JOptionPane.showMessageDialog(null, ""+l);

    }


    public static int countWords(String str){

        int totalWords = 1;

    for (int x = 0; x < str.length(); x++){

    if (str.charAt(x) == ' '){
        totalWords ++;
    }


    }

    return totalWords;

    }


}
