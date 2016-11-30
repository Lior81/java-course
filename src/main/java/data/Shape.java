package data;

import java.awt.*;

/**
 * Created by Evegeny on 24/11/2016.
 */
public abstract class Shape {
    private Point center;

    public abstract void drawMySelf();

    public final Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
}
