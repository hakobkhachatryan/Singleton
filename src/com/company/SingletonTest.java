package com.company;

import java.util.concurrent.locks.Lock;

public class SingletonTest {
    public static void main(String[] args) {
        MySingleton mySingleton = MySingleton.getInstance();

        Serialize.serialize(mySingleton);

        MySingleton mySingleton1 = Serialize.deSerialize();

        System.out.println(mySingleton == mySingleton1);
    }
}
