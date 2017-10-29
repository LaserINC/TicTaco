Design report
=============
Tic Tac Toe is a game coded in the JAVA language using Test Driven Development and Travis for Automated Continuous Integration Server.

Tic Tac Toe has four classes: Game, Board, Player and webGame

Below are the classes with it´s functions and main variables .

####TicTacToe

    private Board gameBoard;
    private char playerX = 'x';
    private char playerO = 'o';
    public TicTacToe();
    public int getInputNumberFromUser();
    public void playGame();
    public void playGame(int number, Player player, char currPlayer)
    private void askIfNewGame();
    private void validateNewGameInput();


####Board

    private char board[][];
    private int boardSize = 3;
    public Board();
    public void initializaBoard();
    public void printBoard();
    public char[][] getBoard();
    public boolean canMove();
    public boolean mark();
    public char checkWin();
    public boolean checkWin();
  
####Player

    private char player;
    public player();
    public char currentPlayer();
    public void changeToPlayer();

   
####webGame 

    public WebGame();
    public void newBoard();
    static int readPortOrDefault();
    public string playGame();

