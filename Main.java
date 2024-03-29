import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    char[][] board = new char[3][3];
    //initializing the board
    for(int row=0;row<board.length;row++){
      for(int col=0;col<board[row].length;col++){
        board[row][col]=' ';
      }
    }

    char player ='X';
    Boolean gameover = false;

    Scanner sc = new Scanner(System.in);
    while(!gameover){
      printboard(board);
      System.out.println("player "+player+" enter ");
      int row=sc.nextInt();
      int col=sc.nextInt();
      System.out.println();

      if(board[row][col]==' '){
        board[row][col] = player; //place the element
        gameover = havewon(board,player);
        if(gameover){
          System.out.println(player +"has won");
        }else{
          if(player=='X'){
            player='O';
          }else{
            player='X';
          }
        }
      }else{
        System.out.println("invalid move and try again");
      }
    }
    printboard(board);
    }
    

    //method for printing the board that is 
    public static void printboard(char[][] board){
       for(int row=0;row<board.length;row++){
      for(int col=0;col<board[row].length;col++){
        System.out.print(board[row][col]+" | ");
      }System.out.println(" ");
    }}

    //method for winning algorithm
    public static boolean havewon(char[][] board,char player)
    {
      
      //row
       for(int row=0;row<board.length;row++){
      if(board[row][0]==player && board[row][1]==player && 
            board[row][2]==player ){
        return true;
      }
       }

      //col
      for(int col=0;col<board.length;col++){
      if(board[0][col]==player && board[1][col]==player && 
       board[2][col]==player ){
        return true;
      }}

      //diagonal
      if(board[0][0]==player && board[1][1]==player && 
        board[2][2]==player){
        return true;
        }
      if(board[0][2]==player && board[1][1]==player && 
        board[2][0]==player){
        return true;
        }
  return false;
    }
  }

  
