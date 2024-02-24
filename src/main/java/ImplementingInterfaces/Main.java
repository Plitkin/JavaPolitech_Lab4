package ImplementingInterfaces;

public class Main {
    public static void main(String[] args) {
        // Использование BooleanArray
        BooleanArray booleanArray = new BooleanArray();

        booleanArray.setElement(3, true);
        booleanArray.setElement(7, true);
        booleanArray.invertElement(5);

        System.out.println("Булевский массив");
        System.out.println("Массив: " + booleanArray.toString());
        System.out.println("Количество истинных элементов: " + booleanArray.countTrueElements());
        System.out.println();

        // Использование IntArray
        IntArray intArray = new IntArray();

        intArray.setElement(3, true);
        intArray.setElement(7, true);
        intArray.invertElement(5);

        System.out.println("Целочисленный массив");
        System.out.println("Массив: " + intArray.toString());
        System.out.println("Количество истинных элементов: " + intArray.countTrueElements());
    }
}

