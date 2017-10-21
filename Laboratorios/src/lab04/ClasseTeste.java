package lab04;

//import java.util.Scanner;

import java.text.DecimalFormat;
import java.util.Scanner;
import static lab04.Utils.toCelsius;


public class ClasseTeste {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double c;
        System.out.println("Digite a temperatura em Fahrenheit: ");
        c=s.nextDouble();
        DecimalFormat f=new DecimalFormat("0.00");
        try{
            System.out.println("O valor digitado corresponde a "+f.format(toCelsius(c))+"º Celsius");
        }
        catch(Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
}