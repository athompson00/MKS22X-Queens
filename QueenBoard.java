public class QueenBoard{
  private int[][] board;
  private int Qs = 0;
  public QueenBoard(int size){
    board = new int[size][size];
  }
  public boolean addQueen(int r, int c){
    if (board[r][c] > 0){
      return false;
    }
    for (int y = 0; y < board.length; y++){
      board[y][c] += 1;
    }
    int a = 0;
    for (int x = 0; x < board.length; x++){
      board[r][x] = board[r][x] + 1;
      if (r - a >= 0){
        board[r-a][x] += 1;
      }
      if (r + a < board.length){
        board[r + a][x] += 1;
      }
      a += 1;
    }
    board[r][c] = -1;
    Qs += 1;
    return true;
  }
  private boolean removeQueen(int r, int c){
    if (board[r][c] != -1){
      return false;
    }
    board[r][c] = 0;
    for (int i = 0; i < board.length; i++){
      board[i][c] -= 1;
    }
    for (int i = 0; i < board[0].length;i++){
      board[r][i] -= 1;
    }
    for (int i = 0; i < board.length; i++){
      for (int a = 0; a < board[0].length; a++){
        if (Math.abs(r - i) == Math.abs(c - a)){
          board[i][a] -= 1;
        }
      }
    }
    return true;
  }
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
        if (board[i][c] == -1){
          result += "Q";
        }
        if (board[i][c] >= 0){
          result += "_";
        }
      }
      result += "\n";
    }
    return result;
  }



  /**
  *@return false when the board is not solveable and leaves the board filled with zeros;

  *        true when the board is solveable, and leaves the board in a solved state

  *@throws IllegalStateException when the board starts with any non-zero value

  */
  public boolean solve(){
    return solveHelper(0, 0, 0, 0, 0);
  }

  public boolean solveHelper(int r, int c, int Qr, int Qc, int numQueens){
    if (r == board.length && c == board.length && numQueens == board.length){
      return true;
    }
    if (board[r][c] == 0){
      addQueen(r,c);
      return solveHelper(r + 1, c, r, c, numQueens + 1);
    }
    if (board[r][c] == -1 || board[r][c] > 0 && r != board.length){
      return solveHelper(r, c + 1, Qr, Qc, numQueens);
    }
    /*
    if (r == board.length && board[r][c] > 0){
      removeQueen(Qr,Qc);
      return solveHelper(Qr, Qc + 1, );
    }
    */
    return false;
  }

  /**
  *@return the number of solutions found, and leaves the board filled with only 0's
  *@throws IllegalStateException when the board starts with any non-zero value
  */
  public int countSolutions(){
    return 1;
  }
}
