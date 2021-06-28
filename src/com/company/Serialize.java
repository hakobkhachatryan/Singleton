package com.company;

import java.io.*;

public class Serialize {
    public static void serialize(MySingleton mySingleton){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("singleton");
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
            out.writeObject(mySingleton);
            out.close();
            fileOutputStream.close();
            System.out.println("serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static MySingleton deSerialize(){
        MySingleton mySingleton = null;
        try {
            FileInputStream fileIn = new FileInputStream("singleton");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            mySingleton = (MySingleton)in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return mySingleton;
    }
}
