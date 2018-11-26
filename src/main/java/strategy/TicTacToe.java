package strategy;

public class TicTacToe {
    MoveStrategy strategy;

    public void init(MoveStrategy strategy){
        this.strategy = strategy;
    }
}
