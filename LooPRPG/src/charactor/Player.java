package charactor;

public class Player extends Charactor{
    public int MAX_HP=150;
    public Player (String neo){
        super(neo);
        this.hp = 125;
        this.ad = 35;
    }

    @Override
    public int getHp() {
        return this.hp;
    }
}
