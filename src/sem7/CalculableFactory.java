package sem7;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(ComplexNumber primaryArg) {
        return new Calculator(primaryArg);
    }
}
