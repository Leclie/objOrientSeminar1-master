package sem4;

public class SteelShield extends Shield{

    private String name = "Стальной щит";

    public SteelShield(int durability) {
        super(10, durability);
    }

    @Override
    public int getDamage(int damage) {
        durability -= damage / 2;
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
