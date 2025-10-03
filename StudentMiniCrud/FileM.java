package StudentMiniCrud;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileM {
    List<Student> student;
    File file = new File("student.txt");
    public FileM () {
        if (file.exists()){
            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String line;
                while ((line = br.readLine()) != null) {
                    String [] l =  line.split(",");
                    for (int i = 0; i < l.length; i ++) {
                        Student s = new Student();
                        s.setName(l[0]);
                        s.setId(l[1]);
                        if (l.length > 1) {
                            for(int a = 2; a < l.length; a++) {
                                s.setGrade(l[a]);
                            }
                        }
                        student.add(i, s);
                    }
                }
            } catch (IOException e) {

            }
        }
        student = new ArrayList<>();
    }

    public void Create (String name, String id) {
        Student s = new Student(name, id);
        student.add(s);
        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("\n" + name +" "+ id);
            bw.close();
        } catch (IOException e) {
            System.out.println("error creating student");
        }

    }
    public void showAll () {
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("error finding student list");
        }

    }
    public void searchStudent(String id) {

    }

    public void updateGrade (String id, String grade){

    }

    public void delete(String name) {

    }

}
