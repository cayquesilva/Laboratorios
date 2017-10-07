
package lab03;

public class Animal {
    private int patas;
    private String raca;

    public void caminha(){
        System.out.println("O animal está caminhando!!!");
    }
    
    public void come(){
        System.out.println("NHAC NHAC, ECA COMIDA RUIM DA MAZELA!!!");
    }
    
    public void fala(){
        System.out.println("Escute ele falando!!!");
    }
    
    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    
    
}
