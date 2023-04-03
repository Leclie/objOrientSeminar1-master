public class Shark extends Predator implements Floating{
    public Shark(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "Рыба";
    }

    @Override
    public int swimmingSpeed() {
        return 8;
    }

    @Override
    public String speak() {
        return ""; // Акула не может издавать звуки
    }
}
