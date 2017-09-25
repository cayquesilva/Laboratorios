/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

import java.util.Scanner;

/**
 *
 * @author Cayque
 */
public class TesteQuarto {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        float dimX,dimY;
        String cor,opcao,abrir,jan;
        
        System.out.println("----------------------------------------");
        System.out.println("Digite as dimensões da primeira janela: ");
        System.out.println("----------------------------------------");
        System.out.print("Qual o tamanho horizontal da janela? ");
        dimX = s.nextFloat();
        System.out.println("----------------------------------------");
        System.out.print("Qual o tamanho vertical da janela? ");
        dimY = s.nextFloat();
        s.nextLine();
        System.out.println("----------------------------------------");
        System.out.print("Digite a cor do quarto: ");
        cor = s.nextLine();
        System.out.println("----------------------------------------");
        System.out.println("");
    
        Quarto q1 = new Quarto(cor);
        Janelas j1 = new Janelas(dimX,dimY);
        q1.janela1=j1;
     
        System.out.println("----------------------------------------");
        System.out.println("Digite as dimensões da segunda janela: ");
        System.out.println("----------------------------------------");
        System.out.print("Qual o tamanho horizontal da janela? ");
        dimX = s.nextFloat();
        System.out.println("----------------------------------------");
        System.out.print("Qual o tamanho vertical da janela? ");
        dimY = s.nextFloat();
        s.nextLine();
        System.out.println("----------------------------------------");
        System.out.println("");
        Janelas j2 = new Janelas(dimX,dimY);
        q1.janela2=j2;
  
        System.out.println("----------------------------------------");
        System.out.println("Voce deseja pintar o quarto?");
        System.out.print("Digite sim para fazer a alteração: ");
        opcao = s.nextLine();
        System.out.println("----------------------------------------");
        
        if("sim".equals(opcao)){
            System.out.print("Digite a cor que você deseja: ");
            cor = s.nextLine();
            q1.pintar(cor);
        }
        
        System.out.println("----------------------------------------");
        System.out.println("Voce deseja abrir a janela 01?(sim ou não)");
        abrir = s.nextLine();
        if("sim".equals(abrir)){
            j1.abrir();
        }else{
            if("nao".equals(abrir)){
                j1.fechar();
                }
            }
        
        System.out.println("----------------------------------------");
        System.out.println("Voce deseja abrir a janela 02?(sim ou não)");
        abrir = s.nextLine();
        if("sim".equals(abrir)){
            j2.abrir();
        }else{
            if("nao".equals(abrir)){
                j2.fechar();
                }
            }
        
        System.out.println("");
        System.out.println("----------------------------------------");
        System.out.println("Digite qual janela você quer pintar: (01, 02 ou todas)");
        switch(jan = s.nextLine()){
            case "01":
                System.out.println("");
                System.out.println("----------------------------------------");
                System.out.println("Digite a cor que você deseja: ");
                cor = s.nextLine();
                j1.pintar(cor);
                break;
            case "02":
                System.out.println("");
                System.out.println("----------------------------------------");
                System.out.println("Digite a cor que você deseja: ");
                cor = s.nextLine();
                j2.pintar(cor);
                break;
            case "todas":
                System.out.println("");
                System.out.println("----------------------------------------");
                System.out.println("Digite a cor que você deseja para a janela 01: ");
                cor = s.nextLine();
                j1.pintar(cor);
                System.out.println("");
                System.out.println("----------------------------------------");
                System.out.println("Digite a cor que você deseja para a janela 02: ");
                cor = s.nextLine();
                j2.pintar(cor);
                break;
        }
        
        
        System.out.println("Existem "+q1.quantasPortasEstaoAbertas()+" janelas abertas no quarto.");
        System.out.println("A cor das janelas 01 e 02 são respectivamente "+q1.janela1.cor+ " e "+q1.janela2.cor);
        System.out.println("----------------------------------------");
        System.out.println("a cor do quarto é: "+q1.cor);
        System.out.println("----------------------------------------");
        System.out.println("");
        
        
        
   
    }  
}
