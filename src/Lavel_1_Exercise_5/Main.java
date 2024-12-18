package Lavel_1_Exercise_5;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        User user =new User("Pepe","1234");
        System.out.println(user);
        try {
            ObjectSerializer.serializeObject(user,args[0]);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            User user2 = (User) ObjectSerializer.deserializeObject(args[0]);
            System.out.println(user2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
