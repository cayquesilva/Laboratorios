package lab02;

import java.util.Scanner;

public class Menu {
    private int op=0,aux=0;
    private Scanner s = new Scanner(System.in);
    
    public int chamaMenu(){
        do{
            System.out.println("|-------------------------------------|");
            System.out.println("|------Selecione a opção desejada-----|");
            System.out.println("| [1] --------- Clubes                |");
            System.out.println("| [2] --------- Estadios              |");
            System.out.println("| [3] --------- Funcionários          |");
            System.out.println("| [4] --------- Arbitros              |");
            System.out.println("| [5] --------- Marcar partida        |");
            System.out.println("|-------Ou digite [7] para sair-------|");
            System.out.println("|-------------------------------------|");
            op=s.nextInt();
            s.nextLine();
            return op;
        }while(op!=7);
    }

    public void menuEstadio(){
        System.out.println("|-----------------------------------------|");
        System.out.println("|--------Selecione a opção desejada-------|");
        System.out.println("| [1] ---- criar estadio                  |");
        System.out.println("| [2] ---- mostrar clubes do estadio      |");
        System.out.println("|-----------------------------------------|");
        aux=s.nextInt();
        s.nextLine();
        switch(aux){
            case 1:
                AuxiliaEstadio.setEstadio(new Estadio()); // cria o objeto no vetor e o preenche
                break;
                
            case 2:
                AuxiliaEstadio.getEstadioSelecao(); // lista os estadios disponiveis para seleção
                AuxiliaEstadio.getTimeEstadio(AuxiliaEstadio.estadio[s.nextInt()]); // ao digitar um numero da seleção o estadio lista os times que possui.
            break;
        }
    }
    
    public void menuClube(){
        System.out.println("|-----------------------------------------|");
        System.out.println("|--------Selecione a opção desejada-------|");
        System.out.println("| [1] ---- cadastrar clube                |");
        System.out.println("| [2] ---- mostrar clubes cadastrados     |");
        System.out.println("|-----------------------------------------|");
        aux=s.nextInt();
        s.nextLine();
        switch(aux){
            case 1:
                AuxiliaClube.setClube(new Clube());// cria o objeto no vetor e o preenche.
            break;
            
            case 2:
                AuxiliaClube.imprimeClube(); // imprime os clubes que foram cadastrados
            break;
        }
    }
    
    
    public void menuFuncionario(){
        System.out.println("|-----------------------------------------|");
        System.out.println("|--------Selecione a opção desejada-------|");
        System.out.println("| [1] ---- Cadastrar jogador              |");
        System.out.println("| [2] ---- Cadastrar comissão técnica     |");
        System.out.println("|-----------------------------------------|");
        aux=s.nextInt();
        s.nextLine();
        switch(aux){
            case 1:
                AuxiliaJogador.setJogador(new Jogador());
            break;
            
            case 2:
                AuxiliaComissao.setComissao(new ComissaoTecnica());
            break;
                
        }
    }
    
    public void menuArbitro(){
        System.out.println("|-----------------------------------------|");
        System.out.println("|--------Selecione a opção desejada-------|");
        System.out.println("| [1] ---- Cadastrar arbitro              |");
        System.out.println("| [2] ---- Mostrar arbitros cadastrados   |");
        System.out.println("|-----------------------------------------|");
        aux=s.nextInt();
        s.nextLine();
        switch(aux){
            case 1:
                AuxiliaArbitro.setArbitro(new Arbitro());
            break;
            
            case 2:
                AuxiliaArbitro.imprimeArbitro();
            break;
                
        }

    }
    
    public void menuPartida(){
        System.out.println("|-----------------------------------------|");
        System.out.println("|--------Selecione a opção desejada-------|");
        System.out.println("| [1] ---- Agendar uma partida            |");
        System.out.println("| [2] ---- Mostrar partidas agendadas     |");
        System.out.println("|-----------------------------------------|");
        aux=s.nextInt();
        s.nextLine();
        switch(aux){
            case 1:
                AuxiliaPartida.setPartida(new Partida());
            break;
            
            case 2:
                AuxiliaPartida.imprimePartida();
            break;
                
        }
        
        
    }
    
    
}
