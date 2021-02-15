package ua.epam.qa.lesson03;

import java.util.Arrays;
import java.util.Scanner;
class MyMass{
    private int [] mas ;
    private int i;
    {
        i = 0;
    }
    public MyMass() {
        //this.mas = new int[5];
        this(new int[5]);
    }
    public MyMass(int [] mas) {
        this.mas = mas;
    }

    public void add(int value){
        if (value<0) throw new IllegalArgumentException();
        if (i==mas.length)
            mas = Arrays.copyOf(mas, mas.length*2);
        mas[i++] = value;
    }
    public int length(){
        return i;
    }
    public int capasity(){
        return mas.length;
    }
    public int[] getMas() {
        if (i< mas.length)
            mas = Arrays.copyOf(mas, i);
        return mas;
    }

    public void setMas(int[] mas) {
        this.mas = mas;
    }

    @Override
    public String toString() {
        return "MyMass{" +
                "mas=" + Arrays.toString(mas) +
                '}';
    }
}

public class ProgramArray {
    public static void initMas(int[] mas){
        mas[0] = 10;
        mas[1] = 11;
        mas[2] = 12;
        mas[3] = 13;
        mas[4] = 14;
    }
    public static void main(String[] args) {
        int [] mas = getMasFromConsole();

        System.out.println(Arrays.toString(mas));

        String str = "Hello";
        System.out.println(str.length() + ", "+ str.hashCode());
        str = str + " people";
        System.out.println(str.length() + ", "+ str.hashCode());

        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        System.out.println(sb.length() + "/ " + sb.capacity());
        sb.append("Hello");
        System.out.println(sb.length() + "/ " + sb.capacity());
        sb.append("Hello");
        System.out.println(sb.length() + "/ " + sb.capacity());
        sb.append("Hello");
        System.out.println(sb.length() + "/ " + sb.capacity());
        String str1 = sb.toString();
        System.out.println(str1.length());
    }


    private static void testObj() {
        Object obj = new Object();
        System.out.println(obj);

        String str1 = new String();
        String str2 = new String();
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
    }

    private static int[] getMasFromConsoleOld() {
        int[] mas = new int[5];
        Scanner sc = new Scanner(System.in);
        int i =0;
        while(true){
            System.out.println("mas["+i+"] =");
           int x =  sc.nextInt();
           if (x < 0) break;
           else
               if (i==mas.length)
               {
                   mas = Arrays.copyOf(mas, mas.length*2);
//                   int[] temp = new int[mas.length*2];
//                   for (int j = 0; j < mas.length; j++) {
//                       temp[j]=mas[j];
//                   }
//                   mas = temp;
               }
               mas[i++] = x;
        }
        mas = Arrays.copyOf(mas, i);
        return mas;
    }
    private static int[] getMasFromConsole() {
        MyMass mass = new MyMass();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("mas["+mass.length()+"] =");
            int x =  sc.nextInt();
            if (x < 0) break;
            else
            mass.add(x);
        }
        return mass.getMas();
    }
}
