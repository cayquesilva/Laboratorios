package lab02;

public class Estadio {
    
    private String nome;
    private String cidade;
    private String estado;
    private int quantideTimes = 0;
    private Clube times[] = new Clube[4]; //maximo de 4 times por estadio
    
    

        public Clube[] getTimes() { //é um vetor, retorna endereço de memoria. não imprime
        return times; // direto, tem que tratar a impressão em tela.
    }


    public int getQuantideTimes(){
        return quantideTimes;
    }
    
    public void setTimes(Clube time) {
        this.times[this.quantideTimes] = time;
        this.quantideTimes++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
