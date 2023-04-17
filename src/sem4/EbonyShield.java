package sem4;

public class EbonyShield extends Shield{

    private String name = "Эбонитовый щит";

    public EbonyShield(int durability) {
        super(30, durability);
    }

    @Override
    public int getDamage(int damage) {
        durability -= damage / 3;
        if (durability < 0) durability = 0;
        int newDamage = damage - blockDamage;
        if (newDamage < 0){
            return 0;
        }
        return newDamage;
    }

    @Override
    public String toString() {
        return name + ". " + super.toString();
    }
}
