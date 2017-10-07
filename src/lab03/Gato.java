package lab03;


public class Gato extends Animal implements AnimalEstimacao{

    private String nome;
   
    
    @Override
    public String getnome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome=nome;
    }

    @Override
    public void brincar() {
        System.out.println("Olha o novelo!");
    }

    @Override
    public void fala() {
       // super.fala(); 
        System.out.println("Miau Miau Miau!");
    }
    
    
    
}
