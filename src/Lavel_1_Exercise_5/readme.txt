jofrecocaavila@MacBook-Air-de-Jofre src % ls
Lavel_1_Exercise_5	Level_1_Exercise_3	ObjectSerializer.java
Level_1_Exercise_1	Level_1_Exercise_4	Usuario.java
Level_1_Exercise_2	Main.java		readme.txt
jofrecocaavila@MacBook-Air-de-Jofre src % javac Main.java
jofrecocaavila@MacBook-Air-de-Jofre src % ls
Lavel_1_Exercise_5	Level_1_Exercise_4	Usuario.java
Level_1_Exercise_1	Main.class		readme.txt
Level_1_Exercise_2	Main.java
Level_1_Exercise_3	ObjectSerializer.java
jofrecocaavila@MacBook-Air-de-Jofre src % javac *.java
jofrecocaavila@MacBook-Air-de-Jofre src % ls
Lavel_1_Exercise_5	Level_1_Exercise_4	ObjectSerializer.java
Level_1_Exercise_1	Main.class		Usuario.class
Level_1_Exercise_2	Main.java		Usuario.java
Level_1_Exercise_3	ObjectSerializer.class	readme.txt
jofrecocaavila@MacBook-Air-de-Jofre src % java Main /Users/jofrecocaavila/Documents/ITacademy/object.ser
Usuario{name='Pepe', key='1234'}
Objecte serialitzat correctament a: /Users/jofrecocaavila/Documents/ITacademy/object.ser
Objecte desserialitzat correctament.
Usuario{name='Pepe', key='1234'}
jofrecocaavila@MacBook-Air-de-Jofre src %