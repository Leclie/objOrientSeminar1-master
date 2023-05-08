package sem7;

public interface Calculable {
    Calculable sum(ComplexNumber arg);
    Calculable multi(ComplexNumber arg);
    ComplexNumber getResult();
}
