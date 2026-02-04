public TokenPass(int playerCount){
  /*  to be answered in part (a) */
  board[] = new int[playerCount]

  for(int x = 0; x<board.length; x++)
  {
    int randNum = (int)(Math.Random() * 10) + 1;

    board[x] = randNum;
    currentPlayer = (int)(Math.Random() * playerCount);
  }
}

public void distributeCurrentPlayerTokens(){
  /* to be answered in part (b) */
  int toPlayer = board[currentPlayer + 1]

  while (board[currentPlayer] > 1)
  {
    if (toPlayer > board.length - 1)
    {
      toPlayer = 0
    }
    else if ()
    board[toPlayer] += 1
    board[currentPlayer] -= 1
  }
}
