package com.ulyanovcompany.task21;

import java.util.Objects;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" +
                +real +
                "+" + imag +
                "i)";
    }

    public boolean isReal() {
        return Math.abs(imag) == 0;
    }

    public boolean isImaginary() {
        return !isReal();
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof MyComplex)) return false;
//        MyComplex myComplex = (MyComplex) o;
//        return Double.compare(myComplex.real, real) == 0 &&
//                Double.compare(myComplex.imag, imag) == 0;
//    }

    public boolean equals(double real, double imag) {
        if (this.real == real && this.imag == imag) return true;
        else return false;
    }

    public boolean equals(MyComplex another) {
        if (this.real == another.real && this.imag == another.imag) return true;
        else return false;
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }

    public double argument() {
        double result = 0;
        if (real > 0) {
            result = Math.atan(imag / real);
        } else if (real < 0 && imag > 0) {
            result = Math.atan(imag / real) + Math.PI;
        } else if (real < 0 && imag < 0) {
            result = Math.atan(imag / real) - Math.PI;
        }
        return result;
    }

    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        double newReal = this.real + right.real;
        double newImag = this.imag + right.imag;
        return new MyComplex(newReal, newImag);
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        double newReal = this.real - right.real;
        double newImag = this.imag - right.imag;
        return new MyComplex(newReal, newImag);
    }

    public MyComplex multiplay(MyComplex right) {
        double newRe = this.real * right.real - this.imag * right.imag;
        double newIm = this.real * right.imag + this.imag * right.real;
        this.real = newRe;
        this.imag = newIm;
        return this;
    }

    public MyComplex devide(MyComplex right) {
        double divider = right.real * right.real + right.imag * right.imag;
        double newRe = (this.real * right.real + this.imag * right.imag) / divider;
        double newIm = (this.imag * right.real - this.real * right.imag) / divider;
        this.real = newRe;
        this.imag = newIm;
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(this.real, -this.imag);
    }
}



