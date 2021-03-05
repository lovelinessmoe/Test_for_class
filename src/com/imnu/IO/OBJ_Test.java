package com.imnu.IO;

import java.io.*;

public class OBJ_Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        OBJ_preson person = new OBJ_preson();
        person.setAge(19);
        person.setName("狗蛋");
        System.out.println(person.toString());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("/Users/loveliness/Desktop/java代码/OBJ.txt")));
        oos.writeObject(person);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("/Users/loveliness/Desktop/java代码/OBJ.txt")));
        OBJ_preson person_1 = (OBJ_preson)ois.readObject();
        System.out.println(person_1.toString());

        oos.close();
        ois.close();
    }
}
