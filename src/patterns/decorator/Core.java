package patterns.decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Core implements LCD {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public void write(String[] s) {
        System.out.print("INPUT:    ");
        try {
            s[0] = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void read(String[] s) {
        System.out.println("Output:   " + s[0]);
    }
}
