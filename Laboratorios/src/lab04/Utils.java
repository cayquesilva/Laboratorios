package lab04;

public class Utils {

    static double c;
    
    public static double toCelsius(double f) throws FahrenheitException{
        if(f < -459.67){
            throw new FahrenheitException("O valor é menor que o zero absoluto!!!");
        }else{
        c=(5*(f-32))/9;
        return c;
        }
    } 
}
