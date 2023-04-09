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
        while(true){
            if(isaBoolean(current)){
                total=10+rolls[current+2]+total;
                current=current+2;
            }
            else if(isstrike(current)){
                total=10+rolls[current+1]+rolls[current+2]+total;
                current=current++;
            }
            else{
                total=rolls[current]+rolls[current+1]+total;
                current=current+2;
            }
            if(isend(current)){break;}
        }
        return total;
    }

    private boolean isend(int current) {
        return current > 19;
    }

    private boolean isstrike(int current) {
        return rolls[current] == 10;
    }

    private boolean isaBoolean(int current) {
        return rolls[current] + rolls[current + 1] == 10;
    }
}
