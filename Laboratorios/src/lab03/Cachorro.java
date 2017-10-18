
package lab03;


public class Cachorro extends Animal implements AnimalEstimacao{

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
        System.out.println("Pega rex! Pega!");
    }

    @Override
    public void fala() {
        super.fala();
        System.out.println("Au Au Au AU!");
    }
    
    
}
