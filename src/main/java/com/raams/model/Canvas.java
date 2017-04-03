package com.raams.model;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by alex on 3/30/17.
 */
public class Canvas {

    public <T extends Shape> void drawAll(List<T> shapes) {

        if (shapes.size() > 1)
            shapes.add(shapes.remove(0));

        for (Shape s : shapes) {
            s.draw(this);
        }
    }

    public void test() throws IllegalFormatCodePointException {
        throw new RuntimeException();
    }

}
