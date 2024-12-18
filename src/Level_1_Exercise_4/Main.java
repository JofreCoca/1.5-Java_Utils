package Level_1_Exercise_4;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Main {
    static String tree;
   public static void main(String[] args) {
       tree="";
       readTxtFiles(args[1]);
        if (args.length <= 0) {
            System.out.println("The directory path is missing");
        }else{
            String directoryPath = args[0];
            File directory = new File(directoryPath);
            if (!directory.exists() || !directory.isDirectory()) {
                System.out.println("The path provided is not a valid directory");
            }else{
                tree=tree+"Directory tree " + directoryPath + ":\n";
                listDirectoryRecursively(directory, 0);
                try (FileWriter fw = new FileWriter("Level_1_Exercise_4/DirectoryTree.txt"))
                {
                    PrintWriter pw = new PrintWriter(fw);
                    pw.println(tree);
                    System.out.println("Has been written in DirectoryTree.txt");
                } catch (Exception e) {
                    e.printStackTrace();
                }
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
                tree = tree+getIndentation(level) + type + " " + file.getName() + " - " + lastModified+"\n";
                if (file.isDirectory()) {
                    listDirectoryRecursively(file, level + 1);
                }
            }
        }
    }

    private static String getIndentation(int level) {
        return "    ".repeat(level);
    }

    private static void readTxtFiles(String route){
        try (FileReader fr = new FileReader(route)) {
            BufferedReader br = new BufferedReader(fr);
            String linea;
            String[] split = null;
            while((linea=br.readLine())!=null) {
                System.out.println(linea);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
