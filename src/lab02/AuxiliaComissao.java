package lab02;

import java.util.Scanner;

public class AuxiliaComissao {
    private static ComissaoTecnica comissao[]=new ComissaoTecnica[10];
    private static int i=0;
    private static Scanner s = new Scanner(System.in);

    public static ComissaoTecnica[] getComissao() {
        return comissao;
    }

    public static void setComissao(ComissaoTecnica comissao) {
        AuxiliaComissao.comissao[i]=comissao;
        System.out.println("Digite o nome do funcionário");
        AuxiliaComissao.comissao[i].setNome(s.nextLine());
        System.out.println("Digite a função do funcionário");
        AuxiliaComissao.comissao[i].setFuncao(s.nextLine());
        System.out.println("Digite o CPF do funcionário");
        AuxiliaComissao.comissao[i].setCpf(s.nextLine());
        System.out.println("Digite o salário do funcionário");
        AuxiliaComissao.comissao[i].setSalario(s.nextDouble());
        s.nextLine();
        System.out.println("Selecione o time que o jogador pertence");
        if(AuxiliaClube.getClubeSelecao()==1){
            AuxiliaClube.clube[s.nextInt()].setFuncionario(AuxiliaComissao.comissao[i]);
            s.nextLine();
            i++;
        }else{
            System.out.println("");
            i++;
        }
    }
}
