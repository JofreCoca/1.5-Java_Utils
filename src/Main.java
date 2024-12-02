import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Main {
    static String tree;
   public static void main(String[] args) {
       tree="";
       args=new String[1];
       args[0]="src/";

        if (args.length != 1) {
            System.out.println("The directory path is missing");
        }else{
            String directoryPath = args[0];
            File directory = new File(directoryPath);
            if (!directory.exists() || !directory.isDirectory()) {
                System.out.println("The path provided is not a valid directory");
            }else{
                //System.out.println("Directory tree " + directoryPath + ":");
                tree=tree+"Directory tree " + directoryPath + ":\n";
                listDirectoryRecursively(directory, 0);
                System.out.println(tree);
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
                //System.out.println(getIndentation(level) + type + " " + file.getName() + " - " + lastModified);
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
}
