package lab03;

public class ClasseTeste {
    
    public static void main(String[] args){
        
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();
        Animal animal = gato;
        Animal animal2 = cachorro;
        
        cachorro.setNome("Dog doidão");
        cachorro.setPatas(4);
        cachorro.setRaca("Pastor Alemão");
        
        gato.setNome("Pixilico");
        gato.setPatas(4);
        gato.setRaca("Seamês");
        
        gato.fala();
        cachorro.fala();
        
        gato.come();
        
        cachorro.brincar();
        gato.brincar();
        
        
        
        
        
        
        
    }
    
    
    
}
