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

    public static void getClubeSelecao(){
        if(AuxiliaClube.i>0){
            for (int j = 0;j<AuxiliaClube.i;j++){
                System.out.println("Digite "+j+" para adicionar "+AuxiliaClube.clube[j].getNome());
                }
        }else{
            System.out.println("Não existem times para serem selecionados!");
        }
    }
    
    public static void setClube(Clube clube) {
        AuxiliaClube.clube[i]=clube;
        System.out.println("Digite o nome do clube: ");
        AuxiliaClube.clube[i].setNome(s.nextLine());
        //System.out.println("Digite a cidade do clube: ");
        //AuxiliaClube.clube[i].setCidade(s.nextLine());
        //System.out.println("Digite o estado do clube: ");
       // AuxiliaClube.clube[i].setEstado(s.nextLine());
        i++;
    }
}
