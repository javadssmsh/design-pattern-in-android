
package com.example.designpatteninjava;


public class Logger {

    private static Logger instance;

    private Logger(){}

    //lazy loaded, thread safe
    public static synchronized Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void logMessageStart() {
        System.out.println("Start message is logged");
    }

    public void logMessageStop() {
        System.out.println("Stop message is logged");
    }
}
