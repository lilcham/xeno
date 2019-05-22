package patterns.iterator;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.NoSuchElementException;

class IntSet {
    private Hashtable ht = new Hashtable();

    // 1. Design an internal "iterator" class for the "collection" class
    public static class Iterator {
        private IntSet set;
        private Enumeration e;
        private Integer current;

        public Iterator(IntSet in) {
            set = in;
        }

        public void first() {
            e = set.ht.keys();
            next();
        }

        public boolean isDone() {
            return current == null;
        }

        public int currentItem() {
            return current;
        }

        public void  next() {
            try {
                current = (Integer)e.nextElement();
            } catch (NoSuchElementException e) {
                current = null;
            }
        }
    }

    public void add(int in) {
        ht.put(in, "null");
    }

    public boolean isMember(int i) {
        return ht.containsKey(i);
    }

    public Hashtable getHashtable() {
        return ht;
    }

    // 2. Add a createIterator() member to the collection class
    public Iterator createIterator()  {
        return new Iterator(this);
    }
}

