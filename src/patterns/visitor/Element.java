package patterns.visitor;

interface Element {
    void accept(Visitor v);
}
