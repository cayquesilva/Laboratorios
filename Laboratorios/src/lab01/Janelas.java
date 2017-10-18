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
public class Janelas {
    
    private boolean aberta;
    String cor;
    private float dimX,dimY;
    
    Janelas(float dimX, float dimY){
        this.dimX = dimX;
        this.dimY = dimY;
    }
    
    public void abrir(){
        this.aberta=true;
    }
    
    public void fechar(){
        this.aberta=false;
    }
    
    public void pintar(String s){
        this.cor=s;
    }
    
    public boolean estarAberta(){
        return this.aberta;
    }
  
}
