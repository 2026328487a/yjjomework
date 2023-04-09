package cn.edu.jnu.x2020101339;

public class Game {
    int score=0;
    int rolls[]=new int[21];
    int k=0;
    public void roll(int i) {
        rolls[k++]=i;
    }

    public int score() {
        int total=0;
        for(int j = 0; j<rolls.length; j++){
            if(j%2==1) {
                if (rolls[j - 1] + rolls[j] == 10) {
                    total += rolls[j + 1];
                }
            }
            total+=rolls[j];
        }
        return total;
    }
}
