// enums/RoShamBo4.java
// (c)2016 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// {java enums.RoShamBo4}
package enums;

public enum RoShamBo4 implements Competitor<RoShamBo4> {
  ROCK {
    @Override
    public Outcome compete(RoShamBo4 opponent) {
      return compete(SCISSORS, opponent);
    }
  },
  SCISSORS {
    @Override
    public Outcome compete(RoShamBo4 opponent) {
      return compete(PAPER, opponent);
    }
  },
  PAPER {
    @Override
    public Outcome compete(RoShamBo4 opponent) {
      return compete(ROCK, opponent);
    }
  };
  Outcome compete(RoShamBo4 loser, RoShamBo4 opponent) {
    return ((opponent == this) ? Outcome.DRAW
        : ((opponent == loser) ? Outcome.WIN
                               : Outcome.LOSE));
  }
  public static void main(String[] args) {
    RoShamBo.play(RoShamBo4.class, 20);
  }
}
/* Output:
ROCK vs. PAPER: LOSE
ROCK vs. SCISSORS: WIN
PAPER vs. SCISSORS: LOSE
PAPER vs. PAPER: DRAW
PAPER vs. SCISSORS: LOSE
SCISSORS vs. ROCK: LOSE
PAPER vs. SCISSORS: LOSE
ROCK vs. ROCK: DRAW
ROCK vs. PAPER: LOSE
ROCK vs. SCISSORS: WIN
ROCK vs. PAPER: LOSE
SCISSORS vs. ROCK: LOSE
PAPER vs. PAPER: DRAW
ROCK vs. ROCK: DRAW
SCISSORS vs. SCISSORS: DRAW
ROCK vs. SCISSORS: WIN
ROCK vs. PAPER: LOSE
ROCK vs. SCISSORS: WIN
PAPER vs. SCISSORS: LOSE
PAPER vs. ROCK: WIN
*/
