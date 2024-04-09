package pbl6;

public class Main{

    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel do deserto");

        hotel.adicionarQuarto(new Quarto(101, "Standard"));
        hotel.adicionarQuarto(new Quarto(102, "Luxo"));
        hotel.adicionarQuarto(new Quarto(103, "Standard"));
        hotel.adicionarQuarto(new Quarto(104, "Luxo"));

        System.out.println("Quartos disponiveis no " + hotel.getNome()+ ": ");
        for (Quarto quarto : hotel.getQuartos()) {
            if (quarto.isDisponivel()){
                System.out.println("Quarto "+ quarto.getNumero() + " - " + quarto.getTipo());
            }
        }

        Quarto quartoReservado = hotel.getQuartos().get(0);
        quartoReservado.reservar();

        System.out.println("\nQuartos disponíveis no " + hotel.getNome() + " após a reserva:");
        for (Quarto quarto : hotel.getQuartos()) {
            if (quarto.isDisponivel()) {
                System.out.println("Quarto " + quarto.getNumero() + " - " + quarto.getTipo());
            }
        }



    }


}