package lab02;

import java.util.Scanner;

public class AuxiliaJogador {
    private static Jogador jogador[]=new Jogador[10];
    private static int i=0;
    private static Scanner s = new Scanner(System.in);

    public static Jogador[] getJogador() {
        return jogador;
    }

    public static void setJogador(Jogador jogador) {
        AuxiliaJogador.jogador[i]=jogador;
        System.out.println("Digite o nome do jogador");
        AuxiliaJogador.jogador[i].setNome(s.nextLine());
        System.out.println("Digite o CPF do jogador");
        AuxiliaJogador.jogador[i].setCpf(s.nextLine());
        System.out.println("Digite a posição do jogador");
        AuxiliaJogador.jogador[i].setPosicao(s.nextLine());
        System.out.println("Digite a perna principal do jogador");
        AuxiliaJogador.jogador[i].setPerna(s.nextLine());//
        System.out.println("Digite o salário do jogador");
        AuxiliaJogador.jogador[i].setSalario(s.nextDouble());
        s.nextLine();
        System.out.println("Selecione o time que o jogador pertence");
        AuxiliaClube.getClubeSelecao();
        AuxiliaClube.clube[s.nextInt()].setFuncionario(AuxiliaJogador.jogador[i]);
        s.nextLine();
        i++;
    }
}
