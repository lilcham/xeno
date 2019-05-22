package patterns.nullobject;

import java.io.OutputStream;

class NullOutputStream extends OutputStream {
    public void write(int b) {
        // Do nothing
    }
}
