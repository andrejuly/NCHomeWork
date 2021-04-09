package com.ulyanovcompany.OOP2.task2_calculating_polynomial;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public double evaluate(double x) {
        double result = coeffs[0];
        for (int i = 1; i <= getDegree(); i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        int max = Math.max(this.getDegree(), right.getDegree());
        double[] newCoeff = new double[max + 1];
        for (int i = 0; i < max + 1; i++) {
            newCoeff[i] = this.coeffs[i] + right.coeffs[i];
        }
        return new MyPolynomial(newCoeff);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int newSize = this.getDegree() + right.getDegree();
        double[] newCoeff = new double[newSize + 1];
        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                newCoeff[i + j] = this.coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolynomial(newCoeff);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = getDegree(); i > 0; i--) {
            double value = coeffs[i];
            if (coeffs[i] != 0) {
                stringBuilder.append(value).append("x^").append(i).append("+");
            }
        }
        if (coeffs[0] != 0) {
            stringBuilder.append(coeffs[0]);
        }
        return stringBuilder.toString();
    }

}
