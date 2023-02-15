package lec7_lists4.DIY;

/** This is a fill in the blanks version of the SLList class
 *  in case you want to try to figure out how to write it yourself.
 *  After writing your methods, you can run the AListTest file.
 */
public class AList<T> {
    private int size;
    private T[] lst;
    /** Creates an empty list. */
    public AList() {
        lst = (T[]) new Object[100];
        size = 0;
    }

    /** Inserts X into the back of the list. */
    public void addLast(T x) {
        lst[size] = x;
        size += 1;
    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return lst[size - 1];        
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        
        return lst[i];        
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;        
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public int removeLast() {
        T removed = lst[size - 1];
        size -= 1;
        lst[size - 1] = null;
        
        return removed;
    }
} 
