import java.io.File;
import java.util.Arrays;

public class ListDirectoryContent {

    public static String[] listDirectoryAlphabetically(String directoryPath) {
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            throw new IllegalArgumentException("The directory does not exist: " + directoryPath);
        }
        if (!directory.isDirectory()) {
            throw new IllegalArgumentException("Path is not a directory: " + directoryPath);
        }
        String[] filesAndDirs = directory.list();
        if (filesAndDirs == null) {
            return new String[0];
        }
        Arrays.sort(filesAndDirs);
        return filesAndDirs;
    }
}
