package sem7;

public final class Calculator implements Calculable {

    private ComplexNumber primaryArg;

    public Calculator(ComplexNumber primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public Calculable sum(ComplexNumber arg) {
        primaryArg.add(arg);
        return this;
    }

    @Override
    public Calculable multi(ComplexNumber arg) {
        primaryArg.multiply(arg);
        return this;
    }

    @Override
    public ComplexNumber getResult() {
        return primaryArg;
    }
}
