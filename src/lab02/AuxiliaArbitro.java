package lab02;

import java.util.Scanner;

public class AuxiliaArbitro {
    private static Arbitro arbitro[] = new Arbitro[10];
    private static int i=0;
    private static Scanner s = new Scanner(System.in);

    public static Arbitro[] getArbitro() {
        return arbitro;
    }

    public static void getArbitroSelecao() { // lista os estadios para posterior seleção
        if(AuxiliaArbitro.i>0){
            for (int j = 0;j<AuxiliaArbitro.i;j++){
                System.out.println("Digite "+j+" para selecionar "+AuxiliaArbitro.arbitro[j].getNome());
                }
        }else{
            System.out.println("Não existem arbitros cadastrados.");
        }
    }
    
    public static void setArbitro(Arbitro arbitro) {
        AuxiliaArbitro.arbitro[i]=arbitro;
        System.out.println("Digite o nome do arbitro");
        AuxiliaArbitro.arbitro[i].setNome(s.nextLine());
        System.out.println("Digite a função do arbitro");
        AuxiliaArbitro.arbitro[i].setFuncao(s.nextLine());
        i++;
    }
}
