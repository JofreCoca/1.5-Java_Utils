package Lavel_1_Exercise_5;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //args=new String[1];
        //args[0]="/Users/jofrecocaavila/Documents/ITacademy/object.ser";

        Usuario usuario=new Usuario("Pepe","1234");
        System.out.println(usuario);
        try {
            ObjectSerializer.serializeObject(usuario,args[0]);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            Usuario usuario2= (Usuario) ObjectSerializer.deserializeObject(args[0]);
            System.out.println(usuario2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
