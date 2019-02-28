import javax.swing.*;

public class TestMyMath {
    public static void main(String[] args) {

        int answer = MyMath.smallestNum(5,10,15);
        JOptionPane.showMessageDialog(null,"answer is " + answer);

        answer = MyMath.powerOf(5,5);
        JOptionPane.showMessageDialog(null,"answer is " + answer);


        answer = MyMath.sumOf(5);
        JOptionPane.showMessageDialog(null,"answer is " + answer);

        answer = MyMath.frac(5);
        if (answer == -1){
            JOptionPane.showMessageDialog(null,"input must be a positive integer!");
        }
        else {
            JOptionPane.showMessageDialog(null, "answer is " + answer);
        }

        answer = MyMath.primeNumberTest(6);
        if (answer == 1){
            JOptionPane.showMessageDialog(null,"Number entered is a prime number!");
        }else{
            JOptionPane.showMessageDialog(null,"Number entered is not prime number!");
        }





    }





}
