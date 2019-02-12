public class Driver{
  QueenBoard a = new QueenBoard(5);
  QueenBoard b = new QueenBoard(6);
  public static void main(String[] args){
    QueenBoard a = new QueenBoard(7);
    QueenBoard b = new QueenBoard(5);
    //a.addQueen(1,1);
  //  a.addQueen(2,3);
  //  System.out.println(a);
    //a.removeQueen(2,3);
    //b.solve();
    //a.solve();
    //a.solve();
    System.out.println(a.countSolutions());
    System.out.println(b.countSolutions());
    //System.out.println(a.countSolutions());
    //System.out.println(b.countSolutions());
  }
}
