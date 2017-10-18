package lab02;

import java.util.Date;


public class Partida {
   
    private Date data;
    private Date hora;
    private Clube mandante;
    private Clube visitante;
    
    private Arbitro juizes[] = new Arbitro[5];
    private int quantidadeArbitro=0;

    public Arbitro[] getJuizes() {
        return juizes;
    }

    public void setJuizes(Arbitro juizes) {
        this.juizes[this.quantidadeArbitro] = juizes;
        this.quantidadeArbitro++;
    }

    public int getQuantidadeArbitro() {
        return quantidadeArbitro;
    }

    public void setQuantidadeArbitro(int quantidadeArbitro) {
        this.quantidadeArbitro = quantidadeArbitro;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Clube getMandante() {
        return mandante;
    }

    public void setMandante(Clube mandante) {
        this.mandante = mandante;
    }

    public Clube getVisitante() {
        return visitante;
    }

    public void setVisitante(Clube visitante) {
        this.visitante = visitante;
    }
    
    
    
}
