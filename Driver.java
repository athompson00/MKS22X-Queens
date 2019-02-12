public class Driver{
  QueenBoard a = new QueenBoard(5);
  QueenBoard b = new QueenBoard(6);
  public static void main(String[] args){
    QueenBoard a = new QueenBoard(5);
    QueenBoard b = new QueenBoard(6);
    //a.addQueen(1,1);
    b.addQueen(1,1);
    a.solve();
    System.out.println(a);
    System.out.println(b);
  }
}
