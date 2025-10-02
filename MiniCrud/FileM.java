package MiniCrud;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileM {
    List <Person> person;
    File f = new File("people.txt");
    public FileM () {
        person = new ArrayList<>();
        if (f.exists()){
            try {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String line;
                while (!((line = br.readLine()) == null)) {
                    Person p = new Person(line);
                    person.add(p);
                }
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void createFile (String name) {
        Person p = new Person(name);
        person.add(p);
        try {
            FileWriter fw = new FileWriter(f, true);
            fw.write("\n" + p.getName());
            fw.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(String existentName, String newName) {
        Person ex;
        Person n = new Person(newName);
        for (int i = 0; i < person.size(); i++) {
            ex = person.get(i);
            if (ex.getName().equals(existentName)) {
                person.remove(ex);
                person.add(i, n);
                break;
            }
        }
        try {
            FileWriter  fw = new FileWriter(f);
            BufferedWriter br = new BufferedWriter(fw);
            for (int i = 0; i < person.size(); i++) {
                String s = person.get(i).getName();
               br.write("\n" + s);
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete (String name) {
        for (int i = 0; i < person.size(); i++) {
            if(person.get(i).getName().equals(name)) {
                person.remove(i);
            }
        }
        try {
            FileWriter  fw = new FileWriter(f);
            BufferedWriter br = new BufferedWriter(fw);
            for (int i = 0; i < person.size(); i++) {
                String s = person.get(i).getName();
                br.write("\n" + s);
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void print () {
        for (int i = 0; i < person.size(); i++) {
            String name = person.get(i).getName();
            System.out.println(name);
        }
    }

}


