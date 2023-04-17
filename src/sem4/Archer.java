package sem4;
public class Archer extends Warrior<Throwing, Shield>{
    public Archer(String name, int hp, Throwing weapon, Shield shield) {
        super(name, hp, weapon, shield);
    }

    public int range(){
        return rnd.nextInt(this.weapon.range)+1;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
