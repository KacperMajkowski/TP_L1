import java.util.Scanner;

public class MainGame {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        GameBoard Board = new GameBoard(6);

        Player Player = new Player(Board.getSize()/2, Board.getSize()/2);

        Apple Apple = new Apple(Player.getX(), Player.getY());

        String input = "";

        Apple.NewApple(Board.getSize());
        Board.printBoard(Player.getX(), Player.getY(), Apple.getX(), Apple.getY());
        Player.PrintScore();

        while(!input.equals("e"))
        {
            input = scan.nextLine();
            Player.PlayerMovement(input, Board.getSize());
            Player.PlayerAppleCollision(Player.getX(), Player.getY(), Apple.getX(), Apple.getY(), Apple, Board);
            Board.printBoard(Player.getX(), Player.getY(), Apple.getX(), Apple.getY());
            Player.PrintScore();
        }
    }
}
