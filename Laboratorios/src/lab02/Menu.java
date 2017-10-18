package lab02;

import java.util.Scanner;

public class Menu {
    private int op=0,aux=0;
    private Scanner s = new Scanner(System.in);
    
    public int chamaMenu(){
        do{
//            menuLimpaTela();
            System.out.println("|-------------------------------------|");
            System.out.println("|------Selecione a opção desejada-----|");
            System.out.println("| [1] --------- Clubes                |");
            System.out.println("| [2] --------- Estadios              |");
            System.out.println("| [3] --------- Funcionários          |");
            System.out.println("| [4] --------- Arbitros              |");
            System.out.println("| [5] --------- Marcar partida        |");
            System.out.println("|-------Ou digite [0] para sair-------|");
            System.out.println("|-------------------------------------|");
            op=s.nextInt();
            s.nextLine();
            menuLimpaTela();
            return op;
        }while(op!=0);
    }

    public void menuEstadio(){
        System.out.println("|-----------------------------------------|");
        System.out.println("|--------Selecione a opção desejada-------|");
        System.out.println("| [1] ---- criar estadio                  |");
        System.out.println("| [2] ---- Adicionar time ao estadio      |");
        System.out.println("| [3] ---- mostrar clubes do estadio      |");
        System.out.println("|-----------------------------------------|");
        aux=s.nextInt();
        s.nextLine();
        menuLimpaTela();
        switch(aux){
            case 1:
                AuxiliaEstadio.setEstadio(new Estadio()); // cria o objeto no vetor e o preenche
                System.out.println("|--- Deseja continuar no menu [Estadio] --|");
                System.out.println("| [1] ----------- Sim                     |");
                System.out.println("| [0] ----------- Não                     |");
                System.out.println("|-----------------------------------------|");
                op=s.nextInt();
                s.nextLine();
                menuLimpaTela();
                if(op==1){
                    menuEstadio();
                }
            break;
                
            case 2:
                System.out.println("Escolha o estadio que você deseja adicionar um time");
                AuxiliaEstadio.getEstadioSelecao();
                int i=s.nextInt();
                s.nextLine();
                System.out.println("Escolha um time para adicionar ao estádio: "+AuxiliaEstadio.estadio[i].getNome());
                AuxiliaClube.getClubeSelecao();
                AuxiliaEstadio.estadio[i].setTimes(AuxiliaClube.clube[s.nextInt()]);
                s.nextLine();
                System.out.println("");
                System.out.println("|--- Deseja continuar no menu [Estadio] --|");
                System.out.println("| [1] ----------- Sim                     |");
                System.out.println("| [0] ----------- Não                     |");
                System.out.println("|-----------------------------------------|");
                op=s.nextInt();
                s.nextLine();
                menuLimpaTela();
                if(op==1){
                    menuEstadio();
                }
            break;
            
            case 3:
                AuxiliaEstadio.getEstadioSelecao(); // lista os estadios disponiveis para seleção
                AuxiliaEstadio.getTimeEstadio(AuxiliaEstadio.estadio[s.nextInt()]); // ao digitar um numero da seleção o estadio lista os times que possui.
                s.nextLine();
                System.out.println("");
                System.out.println("|--- Deseja continuar no menu [Estadio] --|");
                System.out.println("| [1] ----------- Sim                     |");
                System.out.println("| [0] ----------- Não                     |");
                System.out.println("|-----------------------------------------|");
                op=s.nextInt();
                s.nextLine();
                menuLimpaTela();
                if(op==1){
                    menuEstadio();
                }
                break;
        }
    }
    
    public void menuClube(){
        System.out.println("|-----------------------------------------|");
        System.out.println("|--------Selecione a opção desejada-------|");
        System.out.println("| [1] ---- cadastrar clube                |");
        System.out.println("| [2] ---- mostrar clubes cadastrados     |");
        System.out.println("| [3] ---- mostrar jogadores do clube     |");
        System.out.println("|-----------------------------------------|");
        aux=s.nextInt();
        s.nextLine();
        menuLimpaTela();
        switch(aux){
            case 1:
                AuxiliaClube.setClube(new Clube());// cria o objeto no vetor e o preenche.
                System.out.println("|----Deseja continuar no menu [Clube] ----|");
                System.out.println("| [1] ----------- Sim                     |");
                System.out.println("| [0] ----------- Não                     |");
                System.out.println("|-----------------------------------------|");
                op=s.nextInt();
                s.nextLine();
                menuLimpaTela();
                if(op==1){
                    menuClube();
                }
            break;
            
            case 2:
                AuxiliaClube.imprimeClube(); // imprime os clubes que foram cadastrados
                System.out.println("");
                System.out.println("|----Deseja continuar no menu [Clube] ----|");
                System.out.println("| [1] ----------- Sim                     |");
                System.out.println("| [0] ----------- Não                     |");
                System.out.println("|-----------------------------------------|");
                op=s.nextInt();
                s.nextLine();
                menuLimpaTela();
                if(op==1){
                    menuClube();
                }
            break;
            
            case 3:
                AuxiliaClube.imprimeJogadorClube();
                System.out.println("");
                System.out.println("|----Deseja continuar no menu [Clube] ----|");
                System.out.println("| [1] ----------- Sim                     |");
                System.out.println("| [0] ----------- Não                     |");
                System.out.println("|-----------------------------------------|");
                op=s.nextInt();
                s.nextLine();
                menuLimpaTela();
                if(op==1){
                    menuClube();
                }
                
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
        menuLimpaTela();
        switch(aux){
            case 1:
                AuxiliaJogador.setJogador(new Jogador());
                System.out.println("|-Deseja continuar no menu [Funcionario] -|");
                System.out.println("| [1] ----------- Sim                     |");
                System.out.println("| [0] ----------- Não                     |");
                System.out.println("|-----------------------------------------|");
                op=s.nextInt();
                s.nextLine();
                menuLimpaTela();
                if(op==1){
                    menuFuncionario();
                }
            break;
            
            case 2:
                AuxiliaComissao.setComissao(new ComissaoTecnica());
                System.out.println("|-Deseja continuar no menu [Funcionario] -|");
                System.out.println("| [1] ----------- Sim                     |");
                System.out.println("| [0] ----------- Não                     |");
                System.out.println("|-----------------------------------------|");
                op=s.nextInt();
                s.nextLine();
                menuLimpaTela();
                if(op==1){
                    menuFuncionario();
                }
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
        menuLimpaTela();
        switch(aux){
            case 1:
                AuxiliaArbitro.setArbitro(new Arbitro());
                System.out.println("|--- Deseja continuar no menu [Arbitro] ---|");
                System.out.println("| [1] ----------- Sim                     |");
                System.out.println("| [0] ----------- Não                     |");
                System.out.println("|-----------------------------------------|");
                op=s.nextInt();
                s.nextLine();
                menuLimpaTela();
                if(op==1){
                    menuArbitro();
                }
            break;
            
            case 2:
                AuxiliaArbitro.imprimeArbitro();
                System.out.println("");
                System.out.println("|--- Deseja continuar no menu [Arbitro] ---|");
                System.out.println("| [1] ----------- Sim                     |");
                System.out.println("| [0] ----------- Não                     |");
                System.out.println("|-----------------------------------------|");
                op=s.nextInt();
                s.nextLine();
                menuLimpaTela();
                if(op==1){
                    menuArbitro();
                }
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
        menuLimpaTela();
        switch(aux){
            case 1:
                AuxiliaPartida.setPartida(new Partida());
                System.out.println("|--- Deseja continuar no menu [Partida] ---|");
                System.out.println("| [1] ----------- Sim                     |");
                System.out.println("| [0] ----------- Não                     |");
                System.out.println("|-----------------------------------------|");
                op=s.nextInt();
                s.nextLine();
                menuLimpaTela();
                if(op==1){
                    menuPartida();
                }
            break;
            
            case 2:
                AuxiliaPartida.imprimePartida();
                System.out.println("");
                System.out.println("|--- Deseja continuar no menu [Partida] ---|");
                System.out.println("| [1] ----------- Sim                     |");
                System.out.println("| [0] ----------- Não                     |");
                System.out.println("|-----------------------------------------|");
                op=s.nextInt();
                s.nextLine();
                menuLimpaTela();
                if(op==1){
                    menuPartida();
                }
            break;
                
        }
    }
    
    public void menuLimpaTela(){
        for(int i=0;i<5;i++){
            System.out.println("\n");
        }
    }
}
