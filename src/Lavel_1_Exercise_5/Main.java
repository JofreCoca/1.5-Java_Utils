package Lavel_1_Exercise_5;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        User user =new User("Pepe","1234");
        System.out.println(user);
        try {
            ObjectSerializer.serializeObject(user,args[0]);
            User user2 = (User) ObjectSerializer.deserializeObject(args[0]);
            System.out.println(user2);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("catch objectSerializer");
        }
    }
}
