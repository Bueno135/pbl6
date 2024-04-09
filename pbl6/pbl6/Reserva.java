package pbl6;

public class Reserva {
    private Quarto quarto;
    private String dataInicio;
    private String dataFim;

    public Reserva(Quarto quarto, String dataInicio, String dataFim){
        this.quarto = quarto;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;

    }

    public Quarto getQuarto(){
        return quarto;
    }

    public String getDataIncio(){
        return dataInicio;
    }

    public String getDataFim(){
        return dataFim;
    }


}
