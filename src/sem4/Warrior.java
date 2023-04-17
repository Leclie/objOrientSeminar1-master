package sem4;
import java.util.Random;

public abstract class Warrior<T extends Weapon, K extends Shield> extends Personage{
    protected static Random rnd = new Random();
    protected T weapon;
    protected K shield;
    public Warrior(String name, int hp, T weapon, K shield) {
        super(name, hp);
        this.weapon = weapon;
        this.shield = shield;
    }
    public int harm(){
        boolean isHit = rnd.nextBoolean();
        boolean isBlocked = rnd.nextBoolean();
        int damage = 0;
        if (isHit){
            damage = rnd.nextInt(weapon.damage()+1);
            if (isBlocked && !shield.isBroken()){
                damage = shield.getDamage(damage);
            }
        }
        return damage;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Воин \n")
                .append(this.getName())
                .append(String.format("\n\tHp: %d", getHp()))
                .append(String.format("\n\tВооружен: %s", this.weapon));
        return res.toString();
    }
}
