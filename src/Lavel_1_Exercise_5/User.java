package Lavel_1_Exercise_5;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String key;
    public User(String name, String key){
        this.name=name;
        this.key=key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", key='" + key + '\'' +
                '}';
    }
}
