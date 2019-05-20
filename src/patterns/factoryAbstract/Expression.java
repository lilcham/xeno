package patterns.factoryAbstract;

class Expression implements Cloneable{
    public String str;

    public Expression(String str) {
        this.str = str;
    }

    @Override
    public Expression clone() {
        Expression clone = null;
        try {
            clone = (Expression)super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return clone;
    }

    @Override
    public String toString() {
        return str;
    }
}
