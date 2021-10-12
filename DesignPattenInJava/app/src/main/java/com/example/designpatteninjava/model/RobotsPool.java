
package com.example.designpatteninjava.model;


import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RobotsPool extends ObjectPool {

    @Override
    public Object create() {
        int robotId = ThreadLocalRandom.current().nextInt();
        Robot robot = new Robot(robotId, new ArrayList<>(), new Components());

        return robot;
    }
}
