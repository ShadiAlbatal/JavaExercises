package com.company;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }


    public void add(double real, double imaginary) {
        this.real = getReal() + real;
         this.imaginary= getImaginary() + imaginary;

    }

    public ComplexNumber addd(ComplexNumber complexNumber){
    //    real = complexNumber.getReal() + real;
    //    imaginary = complexNumber.getImaginary() + imaginary;
    //    ComplexNumber sum = new ComplexNumber(newReal, newImaginary);
    //     return sum;

        double newReal = complexNumber.getReal() + getReal();
        double newImaginary = complexNumber.getImaginary() + getImaginary();
     //   return new ComplexNumber(newReal, newImaginary);

    //   double newreal = complexNumber.getReal() + real;
    //   double newimaginary = complexNumber.getImaginary() + imaginary;
       return new ComplexNumber(newImaginary+ imaginary, newReal+ real);

        //    ComplexNumber c= new ComplexNumber(real + getReal(), imaginary + getImaginary());
        //    return c;
     }

     public void add(ComplexNumber complexNumber){
        this.real= complexNumber.getReal() + real;
        this.imaginary= complexNumber.getImaginary() + imaginary;
    }

    public void subtract(double real, double imaginary){

        this.real= getReal() - real;
        this.imaginary= getImaginary() - imaginary;
    }

         public void subtract(ComplexNumber complexNumber){

         //this.imaginary= getImaginary() - complexNumber.getImaginary();
         this.imaginary= this.imaginary - complexNumber.getImaginary();
         //this.real= getReal() - complexNumber.getReal();
         this.real= this.real - complexNumber.getReal();
    }

    public void d(){
        this.real= 333;
        System.out.println(real);
    }

}
