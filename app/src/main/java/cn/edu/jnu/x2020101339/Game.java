package cn.edu.jnu.x2020101339;

public class Game {
    int score=0;
    public void roll(int i) {
        score+=i;
    }

    public int score() {
        return score;
    }
}
