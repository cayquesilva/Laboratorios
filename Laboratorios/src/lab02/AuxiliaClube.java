package lab02;

import java.util.Scanner;

public class AuxiliaClube {
    static Clube clube[]=new Clube[10];
    private static int i=0;
    private static Scanner s = new Scanner(System.in);

    public static void imprimeClube() {
        for(int j=0;j<i;j++){ // se no lugar do I, eu colocar clube.lengh dá erro :/ perguntar ao professor!!!
            System.out.println(clube[j].getNome()+"");
        }
    }
    
    public Clube[] getClube(){
        return clube;
    }

    public static int getClubeSelecao(){
        if(AuxiliaClube.i>0){
            for (int j = 0;j<AuxiliaClube.i;j++){
                System.out.println("Digite "+j+" para "+AuxiliaClube.clube[j].getNome());
                }
            return 1;
        }else{
            System.out.println("Não existem times para serem selecionados!");
            return 0;
        }
    }
    
    public static void imprimeJogadorClube() {
        if(AuxiliaClube.i>0){
            if(AuxiliaJogador.getQntJogador()>0){
                for (int j = 0; j < AuxiliaClube.i; j++) {
                    for (int k = 0; k < AuxiliaJogador.getQntJogador(); k++) {
                        System.out.println("Clube: "+AuxiliaClube.clube[j].getNome());
                        System.out.println("Jogador: " +AuxiliaJogador.getJogador()[k].getNome());
                    }
                }
                }else{
                    System.out.println("Não existem jogadores no time!");
                } 
        }else{
            System.out.println("Não existem times cadastrados!");
        }
    }
    
    public static void setClube(Clube clube) {
        AuxiliaClube.clube[i]=clube;
        System.out.println("Digite o nome do clube: ");
        AuxiliaClube.clube[i].setNome(s.nextLine());
        System.out.println("Digite a cidade do clube: ");
        AuxiliaClube.clube[i].setCidade(s.nextLine());
        System.out.println("Digite o estado do clube: ");
        AuxiliaClube.clube[i].setEstado(s.nextLine());
        i++;
    }
}
