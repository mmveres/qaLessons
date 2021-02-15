package ua.epam.qa.lesson04;

import java.io.*;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

class MarksException extends Exception{

}

public class ProgramException {

    public static Logger logger = Logger.getLogger(ProgramException.class.getName());
    static{
        logger.setLevel(Level.WARNING);

        try {
            FileHandler fileHandler = new FileHandler("ProgramException.log");
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        int [] marks = new int[5];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("mas["+i+"]=");
            marks[i] = getMarksFromValue(getValueFromConsole());
        }
        if(marks !=null)
        System.out.println("mas = " + Arrays.toString(marks));
    }

    private static int getMarksFromValue(int value) throws IOException {
       while (true)
       try{
           if (value<3 || value > 12){
               throw new MarksException();
           }
           break;
       } catch (MarksException e) {
           logger.log(Level.WARNING,"value not Marks");
       }
        return value;
    }

    private static int getValueFromConsole() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        int value = 0;
        while(true)
        try {
            System.out.println("Integer value:");
            String str = br.readLine();
            logger.log(Level.INFO,"entered value="+str);
            value = Integer.parseInt(str);
            logger.log(Level.INFO,"integer value="+value);
            break;
        }catch (NumberFormatException e){
            logger.log(Level.SEVERE,"Not integer");
          //  logger.log(Level.SEVERE,Arrays.toString(e.getStackTrace()));
          //  e.printStackTrace(new PrintWriter(new FileOutputStream("textlog.txt",true),true));

           // return ;
           // System.exit(-1);
        }
        return value;
    }
}
