package memory;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

    }

    /**
     * This method creates multiple short lived objects and a few long lived objects
     */
    private static void setupObjects() {
        HashSet<Double> set = new HashSet<Double>();

        //Loop and create 100 longe lived objects - will stay alive as saved into HashSet which is never de-referenced
        long l = 0;
        for (int i=0; i < 100; i++) {
            Double longLivedDouble = new Double(l++);
            set.add(longLivedDouble);
        }

        //Keep creating short lived objects - will die after every iteration of the while loop as re-referencing variable
        while(true) {
            Double shortLivedDouble = new Double(l++);
        }
    }
}
