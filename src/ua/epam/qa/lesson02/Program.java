package ua.epam.qa.lesson02;

import ua.epam.qa.lesson02.mylib.Calc;

public class Program {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int amount10 = 10;
        int amount2  = 0b1010;
        int amount8  = 012;
        int amount16 = 0xA;
        System.out.println(amount2+", "+amount8+", "+amount10+", "+amount16);

        double aver = Calc.getAver(x, y);
        System.out.println(aver);
    }


}
