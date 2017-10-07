package lab02;

import java.util.Scanner;

public class TimeTeste {
    public static void main (String[] args){
        
        Scanner s = new Scanner(System.in);
        
        AuxiliaClube.setClube(new Clube()); // cria o objeto no vetor e o preenche.
        AuxiliaClube.setClube(new Clube());
        AuxiliaEstadio.setEstadio(new Estadio()); // cria o objeto no vetor e o preenche
        //AuxiliaEstadio.setEstadio(new Estadio());
        AuxiliaClube.imprimeClube(); // imprime os clubes que foram cadastrados
        AuxiliaEstadio.getEstadioSelecao(); // lista os estadios disponiveis para seleção
        AuxiliaEstadio.getTimeEstadio(AuxiliaEstadio.estadio[s.nextInt()]); // ao digitar um numero da seleção o estadio lista os times que possui.
        AuxiliaJogador.setJogador(new Jogador());
        AuxiliaComissao.setComissao(new ComissaoTecnica());
        AuxiliaArbitro.setArbitro(new Arbitro());
        AuxiliaPartida.setPartida(new Partida());
        AuxiliaPartida.imprimePartida();
    }
}
