package lab02;

import java.util.Scanner;

public class AuxiliaEstadio {
    
    static Estadio[] estadio = new Estadio[10];
    private static int i=0;
    private static Scanner s = new Scanner(System.in);
    
    
    public Estadio[] getEstadio(){
        return estadio;
    }
    
    public static int getEstadioSelecao() { // lista os estadios para posterior seleção
        if(AuxiliaEstadio.i>0){
            for (int j = 0;j<AuxiliaEstadio.i;j++){
                System.out.println("Digite "+j+" para ver os times do "+AuxiliaEstadio.estadio[j].getNome());
                }
                return 1;
        }else{
            System.out.println("Não existem times nesse estádio!");
            return 0;
        }
    }
   
    
    public static int getTimeEstadio(Estadio e) {
        if(e.getQuantideTimes()>0){
        for (int j = 0; j < e.getQuantideTimes(); j++) {
            System.out.println("Clube: " + e.getTimes()[j].getNome());
            }
        return 1;
        }else{
                System.out.println("Não existem times nesse estádio.");
                return 0;
            }
    }

    public static void setEstadio(Estadio estadio){
        AuxiliaEstadio.estadio[i]=estadio;
        System.out.println("Digite o nome do estadio");
        AuxiliaEstadio.estadio[i].setNome(s.nextLine());
        System.out.println("Digite a cidade do estadio");
        AuxiliaEstadio.estadio[i].setCidade(s.nextLine());
        System.out.println("Digite o estado do estadio");
        AuxiliaEstadio.estadio[i].setEstado(s.nextLine());
        i++;

    }
    
    
    
}
