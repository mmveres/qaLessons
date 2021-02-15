package ua.epam.qa.lesson05;



import ua.epam.qa.entity.Address;
import ua.epam.qa.entity.Student;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;




class Serializator{
    public static Logger logger = Logger.getLogger(Serializator.class.getName());
    static {
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("Serializator.log");
        } catch (IOException e) {
            System.err.println("Can't create log file");
        }
        if (fileHandler!=null) logger.addHandler(fileHandler);
    }
    public static void serialize(Student st1, String filename) throws IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(st1);
            oos.flush();
        } catch (IOException e) {
            logger.log(Level.SEVERE, Arrays.toString(e.getStackTrace()));
            throw e;
        }
    }
    public static Student deserialize(String filename) throws IOException, ClassNotFoundException {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Student)ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            logger.log(Level.SEVERE, Arrays.toString(e.getStackTrace()));
            throw e;
        }
    }
}

public class ProgramSerialize {
    public static Logger logger = Logger.getLogger(ProgramSerialize.class.getName());
    static {
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("ProgramSerialize.log");
        } catch (IOException e) {
            System.err.println("Can't create log file");
        }
        if (fileHandler!=null) logger.addHandler(fileHandler);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student st1 = new Student(1,"Tom","12345",new Address("Kyiv", 123),new int[]{3,5,3});
        Serializator.serialize(st1, "student2.dat");
        Student st2 = Serializator.deserialize("student2.dat");
        System.out.println(st2);
    }


}
