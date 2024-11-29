
public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("The directory path is missing");
            return;
        }

        String directoryPath = args[0];
        try {
            String[] contents = ListDirectoryContent.listDirectoryAlphabetically(directoryPath);

            System.out.println("Contingut del directori ordenat alfabèticament:");
            for (String item : contents) {
                System.out.println(item);
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}