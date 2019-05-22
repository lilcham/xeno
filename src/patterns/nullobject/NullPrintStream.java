package patterns.nullobject;

import java.io.PrintStream;

class NullPrintStream extends PrintStream {
    public NullPrintStream() {
        super(new NullOutputStream());
    }
}
