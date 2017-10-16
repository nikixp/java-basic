package com.example.basics4;

/**
 *
 * @author Student
 */
public class SystemTriangle {

    private final int defaultStart = 1;

    public SystemTriangle() {
    }
    
    public SystemTriangle(int numberOfLines) {
        this.makeTriangle(numberOfLines);
    }
    
    public void makeTriangle(int numberOfLines) {
        for (int i = defaultStart; i < numberOfLines + 1; i++) {
            counter(i);
        }
        for (int i = numberOfLines - defaultStart; i >= 0; i--) {
            counter(i);
        }
    }

    private void counter(int n) {
        for (int i = defaultStart; i < n + defaultStart; i++) {
            systemOut(i);
        }
        System.out.println("");
    }

    private void systemOut(int... numbers) {
        for (int i : numbers) {
            System.out.printf("%d%s", i, " ");
        }
    }

}
