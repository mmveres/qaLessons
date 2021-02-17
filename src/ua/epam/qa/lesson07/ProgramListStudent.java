package ua.epam.qa.lesson07;

import ua.epam.qa.entity.Address;
import ua.epam.qa.entity.Student;

import java.io.*;
import java.util.*;

class SortStudentById implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getId() - o2.getId();
    }
}
class SortStudentByName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class ProgramListStudent {
    public static Student getStudentFromStr(String strRow) {
        String[] strElems = strRow.split(",");
        int id = Integer.parseInt(strElems[0]);
        String name = strElems[1];
        String password = strElems[2];
        String cityName = strElems[3];
        int cityNumber = Integer.parseInt(strElems[4]);
        int mark1 = Integer.parseInt(strElems[5]);
        int mark2 = Integer.parseInt(strElems[6]);
        int mark3 = Integer.parseInt(strElems[7]);
        return new Student(id, name, password, new Address(cityName, cityNumber), new int[]{mark1, mark2, mark3});
    }

    public static void main(String[] args) throws IOException {
        List<Student> studList = new LinkedList<>();
        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        while (br.ready()) {
            String strRow = br.readLine();
            studList.add(getStudentFromStr(strRow));
        }
        for (Student st: studList) {
            System.out.println(st.getName());
        }

        int [] mas = {2,4,5,2,4};
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));

        List<Integer> intList = new ArrayList<>();
        intList.add(2);
        intList.add(4);
        intList.add(5);
        intList.add(2);
        intList.add(4);
        Collections.sort(intList);
        System.out.println(intList);

        Collections.sort(studList, (o1, o2) ->  o1.getName().compareTo(o2.getName()));
        for (Student st: studList) {
            System.out.println(st);
        }
        StudentList stList = new StudentList(studList);
        for (Student st: stList) {
            System.out.println(st);
        }
    }
}
