import javax.swing.*;

public class passwordValidate {

    public static void main(String[] args) {


     String password = JOptionPane.showInputDialog(null,"Enter a password");

     boolean val = false;

     val = validate(password);


    if (val = true) {
    JOptionPane.showMessageDialog(null, "Password accepted!");
    }

    }


    public static boolean validate(String password){


        boolean checker  = false, lowerFlag = false, capitalFlag = false, digitFlag =false;
        char ch;

        while(checker!=true) {

            if (password.length() >= 8) {

                for (int x  = 0; x < password.length(); x ++){

                    ch = password.charAt(x);
                    if( Character.isLowerCase(ch)) {
                        lowerFlag = true;
                    }
                    else if (Character.isUpperCase(ch)) {
                        capitalFlag = true;
                    } else if (Character.isDigit(ch)) {
                        digitFlag = true;
                    }
                }




                if(lowerFlag && capitalFlag && digitFlag) {

                    checker = true;
                }else{
                    password = JOptionPane.showInputDialog(null, "Password must contain one uppercase, lowercase and digit - Try again");
                }


            } else {
                password = JOptionPane.showInputDialog(null, "Password must be atleast 8 characters long - Try again");
            }


        }

       return false;
    }
}
