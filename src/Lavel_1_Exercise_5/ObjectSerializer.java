package Lavel_1_Exercise_5;

import java.io.*;

public class ObjectSerializer {

    // Mètode per serialitzar un objecte a un fitxer
    public static void serializeObject(Object obj, String filePath) throws IOException {
        if (!(obj instanceof Serializable)) {
            throw new IllegalArgumentException("L'objecte no implementa Serializable");
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(obj);
            System.out.println("Objecte serialitzat correctament a: " + filePath);
        }
    }

    // Mètode per desserialitzar un objecte des d'un fitxer
    public static Object deserializeObject(String filePath) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Object obj = ois.readObject();
            System.out.println("Objecte desserialitzat correctament.");
            return obj;
        }
    }
}