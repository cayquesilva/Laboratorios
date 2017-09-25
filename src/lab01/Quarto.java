/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

/**
 *
 * @author Cayque
 */
public class Quarto {
    
    String cor;
    Janelas janela1,janela2;
    private int i=0;
    
    Quarto(String cor){
        this.cor = cor;
    }
    
    public void pintar(String s){
        this.cor = s;
    }
    
    public int quantasPortasEstaoAbertas(){
        if(janela1.estarAberta()){
            i++;
        }
        if(janela2.estarAberta()){
            i++;
        }
        return i;
    }
}
