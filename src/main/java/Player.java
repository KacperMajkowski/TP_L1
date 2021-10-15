public class Player {

    int x;
    int y;
    int score = 0;

    public Player(int x, int y) {
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
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public void PlayerMovement(String input, int Boardsize)
    {
        if(input.equals("w") && y > 0)
        {
            y -= 1;
        }

        if(input.equals("s") && y < Boardsize - 1)
        {
            y += 1;
        }

        if(input.equals("a") && x > 0)
        {
            x -= 1;
        }

        if(input.equals("d") && x < Boardsize - 1)
        {
            x += 1;
        }
    }

    public void PlayerAppleCollision(int px, int py, int ax, int ay, Apple apple, GameBoard board)
    {
        if(px == ax && py == ay)
        {
            apple.NewApple(board.getSize());
            setScore(score + 1);
        }
    }

    public void PrintScore()
    {
        System.out.println("Score: " + score);
    }
}
