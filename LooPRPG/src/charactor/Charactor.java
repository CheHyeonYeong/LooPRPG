package charactor;

public class Charactor {
    public int MAX_HP=500;
    public String name;
    public int ad;
    public int hp;

   public Charactor(String name){
       this.name = name;
       this.ad = 80;
       this.hp = MAX_HP;
   }

   public int atk(int ad){
       return ad;
   }

   public int hit(int damage) {
       hp -= damage;
       if (hp < 0) {
           hp = 0; 
       }
       return hp;
   }
    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
