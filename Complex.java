public class Complex {
    private double re,im;

    public Complex(double re, double im){
        this.re = re;
        this.im = im;
    }


    public  Complex add(Complex complex2){

        return new Complex(this.re + complex2.re, this.im + complex2.im);
    }

    public Complex subtract(Complex complex2){

        return new Complex(this.re - complex2.re, this.im - complex2.im);
    }

    public Complex multiply(Complex complex2){
        return new Complex(this.re*complex2.re - this.im*complex2.im, this.re*complex2.im + this.im*complex2.re);
    }

    public String toString(){
        if (im >= 0){
            return re + " + " + im + "i";
        }
        else{
            return re + " - " + - im + "i";
        }
    }

}
