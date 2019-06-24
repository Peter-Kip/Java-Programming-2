package validation;

public class Calculator {

    public int multiplication(int fromInteger) {
        if(fromInteger < 0 ){
            throw new IllegalArgumentException("Integer cannot be negative");
        }

        int multiplication = 1;
        for (int i = 1; i <= fromInteger; i++) {
            multiplication *= i;
        }

        return multiplication;
    }

    public int binomialCoefficient(int setSize, int subsetSize) {
        if(setSize < 0 && subsetSize < 0 || subsetSize > setSize){
            throw new IllegalArgumentException("Paramaters cannot be negative and subsetSize cannot be greater than setSize");
        }

        int numerator = multiplication(setSize);
        int denominator = multiplication(subsetSize) * multiplication(setSize - subsetSize);

        return numerator / denominator;
    }
}
