package lab02;

import java.util.Scanner;

public class AuxiliaEstadio {
    
    static Estadio[] estadio = new Estadio[10];
    private static int i=0;
    private static Scanner s = new Scanner(System.in);
    
    
    public Estadio[] getEstadio(){
        return estadio;
    }
    
    public static void getEstadioSelecao() { // lista os estadios para posterior seleção
        if(AuxiliaEstadio.i>0){
            for (int j = 0;j<AuxiliaEstadio.i;j++){
                System.out.println("Digite "+j+" para ver os times do "+AuxiliaEstadio.estadio[j].getNome());
                }
        }else{
            System.out.println("Não existem times nesse estádio!");
        }
    }
   
    
    public static void getTimeEstadio(Estadio e) {
        if(e.getQuantideTimes()>0){
        for (int j = 0; j < e.getQuantideTimes(); j++) {
            System.out.println("Clube: " + e.getTimes()[j].getNome());
            }
        }else{
                System.out.println("Não existem times nesse estádio.");
            }
    }

    public static void setEstadio(Estadio estadio){
        AuxiliaEstadio.estadio[i]=estadio;
        System.out.println("Digite o nome do estadio");
        AuxiliaEstadio.estadio[i].setNome(s.nextLine());
        //System.out.println("Digite a cidade do estadio");
        //AuxiliaEstadio.estadio[i].setCidade(s.nextLine());
        //System.out.println("Digite o estado do estadio");
        //AuxiliaEstadio.estadio[i].setEstado(s.nextLine());
        System.out.println("Escolha o time que pertence ao estádio");
        AuxiliaClube.getClubeSelecao();
        AuxiliaEstadio.estadio[i].setTimes(AuxiliaClube.clube[s.nextInt()]);
        s.nextLine();
        i++;

    }
    
    
    
}
