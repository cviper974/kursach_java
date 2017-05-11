package IO;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class FileCreator {

    public FileCreator() throws IOException {
        createSequence();
    }

    public static void createSequence(){
        File directory = new File("src/DATA");
        ArrayList<String> files = new ArrayList<>();

        files.add(0, "students");
        files.add(1, "topics");
        files.add(2, "teachers");

        if(directory.isDirectory()){
            if (directory.list().length == 0){
                for (String file : files) {
                    createFile(file);
                }
            }
        }
    }

    public static void createFile(String name){
        File file = new File("src/DATA/" + name + ".ser");

        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}