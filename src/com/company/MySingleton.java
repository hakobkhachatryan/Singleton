package com.company;

import java.io.Serializable;

public class MySingleton implements Serializable {
    private static volatile MySingleton instance;

    private MySingleton(){}

    public static MySingleton getInstance(){
        if (instance == null){
            synchronized (MySingleton.class){
                if (instance == null)
                    instance = new MySingleton();
            }
        }
        return instance;
    }

    public Object readResolve() {
        return getInstance( );
    }
}
