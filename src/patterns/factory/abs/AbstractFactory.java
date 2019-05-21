package patterns.factory.abs;

abstract class AbstractFactory {
    public Expression prototype;

    public Expression makePhase() {
        return prototype.clone();
    }

    public abstract Expression makeCompromise();

    public abstract Expression makeGrade();
}
