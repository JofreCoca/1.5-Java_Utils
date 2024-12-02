package Level_1_Exercise_2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("The directory path is missing");
        }else{

        }
    }

   /* public static void main(String[] args) {
        //args=new String[1];
        //args[0]= "/Users/jofrecocaavila/Documents/ITacademy";
        System.out.println("laa");
        if (args.length != 1) {
            System.out.println("The directory path is missing");
        }else{
            String directoryPath = args[0];
            File directory = new File(directoryPath);
            if (!directory.exists() || !directory.isDirectory()) {
                System.out.println("The path provided is not a valid directory");
            }else{
                System.out.println("Directory tree " + directoryPath + ":");
                listDirectoryRecursively(directory, 0);
            }
        }
    }

    private static void listDirectoryRecursively(File directory, int level) {
        File[] files = directory.listFiles();
        if (files == null) {
            System.out.println(getIndentation(level) + "Directory is empty");
        }else{
            Arrays.sort(files, (f1, f2) -> f1.getName().compareToIgnoreCase(f2.getName()));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            for (File file : files) {
                String type = file.isDirectory() ? "(D)" : "(F)";
                String lastModified = sdf.format(file.lastModified());
                System.out.println(getIndentation(level) + type + " " + file.getName() + " - " + lastModified);
                if (file.isDirectory()) {
                    listDirectoryRecursively(file, level + 1);
                }
            }
        }

    }
    private static String getIndentation(int level) {
        return "    ".repeat(level);
    }*/
}
