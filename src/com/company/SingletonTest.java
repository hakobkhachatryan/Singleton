package com.company;

public class git initTest {
    public static void main(String[] args) {
        MySingleton mySingleton = MySingleton.getInstance();

        Serialize.serialize(mySingleton);

        MySingleton mySingleton1 = Serialize.deSerialize();

        System.out.println(mySingleton == mySingleton1);
    }
}
