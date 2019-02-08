public class QueenBoard{
  private int[][] board;
  public QueenBoard(int size){
    board = new int[size][size];
  }
  private boolean addQueen(int r, int c){
    if (board[r][c] > 0){
      return false;
    }
    board[r][c] = -1;
    for (int i = 0; i < board.length; i++){
      board[i][c] += 1;
    }
    for (int i = 0; i < board[0].length;i++){
      board[r][i] += 1;
    }
    for (int i = 0; i < board.length; i++){
      for (int a = 0; a < board[0].length; a++){
        if (Math.abs(r - i) == Math.abs(c - a){
          board[i][a] += 1;
        }
      }
    }
    return true;
  }
  private boolean removeQueen(int r, int c){}
  /**
  *@return The output string formatted as follows:
  *All numbers that represent queens are replaced with 'Q'
  *all others are displayed as underscores '_'
  *There are spaces between each symbol:
  *"""_ _ Q _
  *Q _ _ _

  *_ _ _ Q

  *_ Q _ _"""
  *(pythonic string notation for clarity,
  *excludes the character up to the *)
  */
  public String toString(){
    String result = "";
    for (int i = 0; i < board.length; i++){
      for (int c = 0; c < board.length; c++){
        if (board[i][])
      }
    }
  }



  /**
  *@return false when the board is not solveable and leaves the board filled with zeros;

  *        true when the board is solveable, and leaves the board in a solved state

  *@throws IllegalStateException when the board starts with any non-zero value

  */
  public boolean solve(){}

  /**
  *@return the number of solutions found, and leaves the board filled with only 0's
  *@throws IllegalStateException when the board starts with any non-zero value
  */
  public int countSolutions(){}


}
