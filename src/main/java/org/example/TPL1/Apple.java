package org.example.TPL1;

import java.util.Random;

public class Apple {

    int x;
    int y;

    public Apple(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void NewApple(int Boardsize)
    {
        Random random = new Random();
        int nx = random.nextInt(Boardsize);
        int ny = random.nextInt(Boardsize);
        while(getX() == nx && getY() == ny)
        {
            nx = random.nextInt(Boardsize);
            ny = random.nextInt(Boardsize);
        }

        setX(nx);
        setY(ny);
    }
}
