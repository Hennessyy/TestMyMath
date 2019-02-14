import javax.swing.*;

public class MyMath {


    public static int smallestNum(int x, int y ,int z) {


        if (x < y) {
            int smallest = x;


            if (z < smallest) {
                smallest = z;
            }

            return smallest;
        } else {
            int smallest = y;

            if (z < smallest) {
                smallest = z;
            }


            return smallest;
        }

    }


    public static int powerOf(int x, int y) {
        int answer = 1;


        if (y == 1) {
            return 1;
        } else {

            for (int i = 0; i < y - 1; i++) {

                if (i == 0) {
                    answer = x * x;
                } else {
                    answer = answer * x;
                }

            }
            return answer;

        }
    }




    public static int sumOf(int x){

    int number = x;
    int answer=0;

    if(number>=1) {
        for (int i = 0; i < x; i++) {
            answer += number;
            number--;
        }

    }

    return answer;
    }

    public static int frac(int x){

        int number = x;
        
        if(number>=1) {
            int answer=1;

            for (int i = 1; i < x+1; i++) {

                if(i==1){
                answer +=i*i;
                }
                answer  = answer * number;
                number--;
            }
            return answer;
        }


    }


}





