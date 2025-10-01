package MiniCrud;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileM {
    File f = new File("people.txt");
    public FileM () {

    }
    public void createFile (List<Person> names) {

        try {
            FileWriter fr = new FileWriter(f);
            for (int i = 0; i < names.size(); i ++) {
                Person p = names.get(i);
                fr.write(p.getName() + "\n");

            }
            fr.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

