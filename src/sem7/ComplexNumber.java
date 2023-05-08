package sem7;

class ComplexNumber{
    private float a;
    private float b;
    private float newA;
    private float newB;

    public ComplexNumber(float a, float b){
        this.a = a;
        this.b = b;
    }
    public float getA(){
        return a;
    }
    public float getB(){
        return b;
    }

    public ComplexNumber add(ComplexNumber otherNumber){
        newA = a + otherNumber.getA();
        newB = b + otherNumber.getB();
        return new ComplexNumber(newA, newB);
    }

    public ComplexNumber multiply(ComplexNumber otherNumber){
        newA = (a * otherNumber.getA()) - (b * otherNumber.getB());
        newB = (b * otherNumber.getA()) + (a * otherNumber.getB());
        return new ComplexNumber(newA, newB);
    }

    public String toString(){
        return "(" + a + ") + (" + b + ")i";
    }
}
