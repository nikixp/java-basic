package com.example.basics4;

/**
 *
 * @author Student
 */
public class SystemTriangle {

    public void makeTriangle(int numberOfLines) {
        for (int i = 1; i < numberOfLines + 1; i++) {
            increaseCounter(i);
            System.out.println("");
        }
        for (int i = numberOfLines - 1; i >= 0; i--) {
            decreaseCounter(i);
            System.out.println("");
        }
    }

    private void increaseCounter(int j) {
        for (int i = 1; i < j + 1; i++) {
            systemOut(i);
        }
    }

    private void decreaseCounter(int j) {
        for (int i = 1; i < j + 1; i++) {
            systemOut(i);
        }
    }

    private void systemOut(int... numbers) {
        for (int i : numbers) {
            System.out.printf("%d%s", i, " ");
        }
    }

}
