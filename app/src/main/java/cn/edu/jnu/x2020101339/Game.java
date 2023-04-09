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
        int current=0;
        for(int j = 0; j<10; j++){
            if(rolls[current]+rolls[current+1]==10){
                total=10+rolls[current+1];
            }
            else if(rolls[current]==10){
                total=10+rolls[current+1]+rolls[current+2];
            }
        }
        return total;
    }
}
