import javax.swing.*;

public class TestMyMath {
    public static void main(String[] args) {


        int answer = MyMath.smallestNum(5,10,15);
        JOptionPane.showMessageDialog(null,answer);

        answer = MyMath.powerOf(5,5);
        JOptionPane.showMessageDialog(null,answer);


        answer = MyMath.sumOf(0);
        JOptionPane.showMessageDialog(null,answer);



    }




}
