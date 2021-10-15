public class GameBoard {

    int size;

    public GameBoard(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void printBoard(int px, int py, int ax, int ay)
    {
        for(int y = 0; y < size; y++)
        {
            for(int x = 0; x < size; x++)
            {
                if(x == px && y == py)
                {
                    System.out.print("X");
                }
                else if(x == ax && y == ay)
                {
                    System.out.print("O");
                }
                else
                {
                    System.out.print("_");
                }
            }
            System.out.print("\n");
        }
    }
}
