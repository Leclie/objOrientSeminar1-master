package sem4;

public abstract class Shield {
    protected int blockDamage;
    protected int durability;

    public Shield(int blockDamage, int durability) {
        this.blockDamage = blockDamage;
        this.durability = durability;
    }

    public int getBlockDamage() {
        return blockDamage;
    }

    public int getDurability() {
        return durability;
    }

    // Метод описывает процесс блокирования, то есть возвращает уменьшенный урон, а также уменьшет прочность щита
    public abstract int getDamage(int damage);

    public boolean isBroken(){
        return durability == 0;
    }

    @Override
    public String toString() {
        return String.format("Урон, который блокирует: %d. Прочность: %d", blockDamage, durability);
    }
}
