package lab02;

public class TimeTeste {
    public static void main (String[] args){
        
        Menu m = new Menu();
        int op=1;
        
        do{
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
            
            case 0:
                System.out.println("Finalizando sistema...");
                System.out.println("");
                op=0;
            break;
                    
        }
        }while(op!=0);
    }
}
