package pbl6;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nome;
    private ArrayList<Quarto> quartos;

    public Hotel(String nome){
        this.nome = nome;
        this.quartos = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public void adicionarQuarto(Quarto quarto){
        quartos.add(quarto);

    }

    public List<Quarto> getQuartos(){
        return quartos;

    }




}
