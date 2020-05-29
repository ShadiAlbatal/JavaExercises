package com.company;

//////////// NumberComplex nc= new NumberComplex()
//////////// new NumberComplex(nc)


public class NumberComplex {

    private double real;
    private double imaginary;

    public NumberComplex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(NumberComplex numberComplex){

        this.imaginary= numberComplex.imaginary + imaginary;
        this.real= numberComplex.real + real;

    }

    public void subtract(NumberComplex numberComplex){

        this.imaginary= this.imaginary - numberComplex.imaginary;
        this.real= this.real - numberComplex.real;

    }

}
