package prac;

import java.util.Random;

public class Cleric {
    String name;
    int hp = 50;
    final int max_hp = 50;
    int mp = 10;
    final int max_mp = 10;

    public void selfAid(){
        mp -= 10;
        hp = max_hp;
    }

    public int pray(int sec){
        Random rand = new Random();
        int aid = sec + rand.nextInt(3);
        if (mp+aid>=max_mp) {
            mp = max_hp;
        }else {
            mp += aid;
        }
        return aid;
    }

}
