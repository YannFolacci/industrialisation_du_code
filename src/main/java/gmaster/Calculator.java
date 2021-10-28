package gmaster;

public class Calculator{
    public static void main(String[] args){

        double a = Double.parseDouble(args[0]);
        if(args[1].charAt(0)== 'v'){
            System.out.println(Calculator.sqrt(a));
            return;
        }
        double b = Double.parseDouble(args[1]);

        switch(args[2]){
            case "+": System.out.println(Calculator.add(a,b)); break;
            case "-": System.out.println(Calculator.diff(a,b)); break;
            case "*": System.out.println(Calculator.mult(a,b)); break;
            case "/": System.out.println(Calculator.div(a,b)); break;
            case "^": System.out.println(Calculator.power(a,b)); break;
        }
        
    }
    public static double add(double a, double b){
        return a+b;
    }
    public static double diff(double a, double b){
        return a-b;
    }
    public static double mult(double a, double b){
        return a*b;
    }
    public static double div(double a, double b){
        return a/b;
    }
    public static double power(double a, double b){
        return Math.pow(a,b);
    }
    public static double sqrt(double a){
        return Math.sqrt(a);
    }
}