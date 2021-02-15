package ua.epam.qa.lesson02;

import ua.epam.qa.lesson02.mylib.Calc;

public class CalcTest {
    public static boolean sum_getAver_2positiveparam_correct(){
        int x = 2;
        int y = 3;
        double expRes = 2.5;

        double actRes = Calc.getAver(x,y);
        if (expRes == actRes)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(sum_getAver_2positiveparam_correct());
    }
}
