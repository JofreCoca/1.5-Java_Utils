package Level_1_Exercise_1;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("The directory path is missing");
        }else{
            System.out.println("Ruta:"+args[0]);
            String directoryPath = args[0];
            try {
                String[] contents = ListDirectoryContent.listDirectoryAlphabetically(directoryPath);

                System.out.println("Directory contents sorted alphabetically:");
                for (String item : contents) {
                    System.out.println(item);
                }
            } catch (IllegalArgumentException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
}