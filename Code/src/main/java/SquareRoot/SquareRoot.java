package SquareRoot;

public class SquareRoot {
    public static Double NewtonRaphson(double init, double x, int n){
        double x1 = x + (init-(x*x))/(2*x);
        if (n == 0) {return x1;}
        else return NewtonRaphson(init, x1, n-1);
    }
    public static void main(String[] args){
        System.out.println(NewtonRaphson(2,2,5));
        System.out.println(NewtonRaphson(3,3,5));
        System.out.println(NewtonRaphson(5,5,5));
    }
}
