package data;

import java.awt.*;

/**
 * Created by Evegeny on 24/11/2016.
 */
public class Circle extends Shape {
    @Override
    public void drawMySelf() {
    }

    @Override
    public void setCenter(Point center) {
        System.out.println(123);
    }
}
