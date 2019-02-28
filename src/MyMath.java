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


        
        if(x >= 1) {
            int answer=1;

            if(x == 1){
                return 0;
            }

            for (int i = 1; i < x ; i++) {


            answer += i*answer;

            }
            return answer;
        }else{
            return -1;
        }


    }


    public static int primeNumberTest(int x){


        if (x==2) {
            return 1;
        }
        if(x%2!=0){
           return 1;
        }else{
            return 0;
        }

    }


}





