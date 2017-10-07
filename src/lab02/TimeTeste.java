package lab02;

import java.util.Scanner;

public class TimeTeste {
    public static void main (String[] args){
        
        Scanner s = new Scanner(System.in);
        Menu m = new Menu();
        
        switch(m.chamaMenu()){
            case 1: 
                m.menuClube();
            break;
            
            case 2:
                m.menuEstadio();
            break;
            
            case 3:
                m.menuFuncionario();
            break;
            
            case 4:
                m.menuArbitro();
            break;
            
            case 5:
                m.menuPartida();
            break;
        }
    }
}
