package ImplementingInterfaces;

public class BooleanArray implements BooleanArrayCollection {
    private final boolean[] array;

    public BooleanArray() {
        this.array = new boolean[size];
    }

    @Override
    public boolean getElement(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return !array[index];
    }

    @Override
    public void setElement(int index, boolean value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        array[index] = value;
    }

    @Override
    public void setElement(int index, int value) {
        setElement(index, value != 0);
    }

    @Override
    public void resetElement(int index) {
        setElement(index, false);
    }

    @Override
    public void invertElement(int index) {
        setElement(index, getElement(index));
    }

    @Override
    public int countTrueElements() {
        int count = 0;
        for (boolean value : array) {
            if (value) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (boolean value : array) {
            result.append(value ? '1' : '0');
        }
        return result.toString();
    }
}

