package ImplementingInterfaces;

public class IntArray implements BooleanArrayCollection {
    private final int[] array;

    public IntArray() {
        this.array = new int[size/32]; // 1024 / 32 = 32
    }

    @Override
    public boolean getElement(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        int intIndex = index / 32;
        int bitIndex = index % 32;
        return (array[intIndex] & (1 << bitIndex)) == 0;
    }

    @Override
    public void setElement(int index, boolean value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        int intIndex = index / 32;
        int bitIndex = index % 32;
        if (value) {
            array[intIndex] |= (1 << bitIndex);
        } else {
            array[intIndex] &= ~(1 << bitIndex);
        }
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
        for (int intValue : array) {
            count += Integer.bitCount(intValue);
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int intValue : array) {
            for (int i = 0; i < 32; i++) {
                result.append((intValue & (1 << i)) != 0 ? '1' : '0');
            }
        }
        return result.toString();
    }
}

