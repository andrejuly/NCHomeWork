package com.ulyanovcompany.task23;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x1, int y1, int width, int height) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = width + x1;
        this.y2 = y1 - height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getHeight() {
        return y1 - y2;
    }

    public boolean collides(Ball ball) {
        float xKoordBall = ball.getX() + ball.getRadius();
        float yKoordBall = ball.getY() + ball.getRadius();
        if ((xKoordBall - x1) * (xKoordBall - x2) <= 0 && (yKoordBall - y1) * (yKoordBall - y2) <= 0)
            return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Container[" +
                "(" + x1 +
                "," + y1 +
                "),(" + x2 +
                "," + y2 +
                ']';
    }
}
