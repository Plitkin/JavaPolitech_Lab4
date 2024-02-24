package ImplementingInterfaces;

public interface BooleanArrayCollection {
    int size = 1024;
    boolean getElement(int index);
    void setElement(int index, boolean value);
    void setElement(int index, int value);
    void resetElement(int index);
    void invertElement(int index);
    int countTrueElements();
    String toString();
}

