package lab02;

import java.util.Date;
import java.util.Scanner;

public class AuxiliaPartida {
    private static Partida partida[] = new Partida[10];
    private static int i=0;
    private static Scanner s = new Scanner(System.in);
    private static int dia;
    private static int mes;
    private static int ano;
   
    
    public static Partida[] getPartida() {
        return partida;
    }
    
    public static void imprimePartida() {
        for(int j=0;j<i;j++){ // se no lugar do I, eu colocar clube.lengh dá erro :/ perguntar ao professor!!!
            System.out.println("Partida "+j);
            System.out.println("Mandante: "+getPartida()[j].getMandante().getNome());
            System.out.println("Visitante: "+getPartida()[j].getVisitante().getNome());
            System.out.println("Data: "+getPartida()[j].getData().getDate()+" / "+getPartida()[j].getData().getMonth()+" / "+getPartida()[j].getData().getYear());
        } //NÃO CONSIGO IMPLEMENTAR A HORA CORRETA ...
    }

    
    public static void setPartida(Partida partida) {
        //CRIAÇÃO DE OBJETO E SELEÇÃO DE TIMES MANDANTES E VISITANTES
        AuxiliaPartida.partida[i]=partida;
        System.out.println("Selecione o time mandante");
        if(AuxiliaClube.getClubeSelecao()==1){
            AuxiliaPartida.partida[i].setMandante(AuxiliaClube.clube[s.nextInt()]);
            s.nextLine();
            }else{
                System.out.println("");
        }
        System.out.println("Selecione o time visitante");
        if(AuxiliaClube.getClubeSelecao()==1){
            AuxiliaPartida.partida[i].setVisitante(AuxiliaClube.clube[s.nextInt()]);
            s.nextLine();
            }else{
                System.out.println("");
        }
        //SELEÇÃO DE ARBITRO
        System.out.println("Escolha o arbitro para a partida.");
        if(AuxiliaArbitro.getArbitroSelecao()==1){
            AuxiliaPartida.partida[i].setJuizes(AuxiliaArbitro.getArbitro()[s.nextInt()]);
            s.nextLine();
            }else{
                System.out.println("");
        }
        //DEFINIÇÃO DA DATA DA PARTIDA. OBS: NÃO ESTOU CONSEGUINDO O RETORNO VIA getData();
        System.out.println("Temos que definir a data para marcar a partida");
        System.out.println("Digite o dia da partida.");
        dia=s.nextInt();
        s.nextLine();
        System.out.println("Digite o mês da partida.");
        mes=s.nextInt();
        s.nextLine();
        System.out.println("Digite o ano da partida.");
        ano=s.nextInt();
        s.nextLine();
        AuxiliaPartida.partida[i].setData(new Date(dia,mes,ano));
        i++;
    }
    
    
    
    
    
}
