package com.raams;

import com.raams.model.Canvas;
import com.raams.model.Circle;
import com.raams.model.Rectangle;
import com.raams.model.Shape;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

/**
 * Created by alex on 3/27/17.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);
        try {
            new Canvas().test();
        } catch (IllegalFormatCodePointException e) {
            e.getMessage();
        } finally {
            String a = "";
        }
    }

}
