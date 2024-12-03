package Lavel_1_Exercise_5;

import java.io.*;

public class ObjectSerializer {

    public static void serializeObject(Object obj, String filePath) throws IOException {
        if (!(obj instanceof Serializable)) {
            throw new IllegalArgumentException("The object does not implement Serializable");
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(obj);
            System.out.println("Object successfully serialized a: " + filePath);
        }
    }

    public static Object deserializeObject(String filePath) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Object obj = ois.readObject();
            System.out.println("Object successfully deserialized");
            return obj;
        }
    }
}