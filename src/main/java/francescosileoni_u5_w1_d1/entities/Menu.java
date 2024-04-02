package francescosileoni_u5_w1_d1.entities;

import java.util.List;


public class Menu {
    private List<Pizza> pizza;
    private List<Bevande> bevande;
    private List<Aggiunte> aggiunte;

    public Menu(List<Pizza> pizza, List<Bevande> bevande, List<Aggiunte> aggiunte) {
        this.pizza = pizza;
        this.bevande = bevande;
        this.aggiunte = aggiunte;
    }

    public Menu() {
    }

    @Override
    public String toString() {
        return "Menù: \n" +
                "\nPizze: \n" + pizza +
                "\nBevande: \n" + bevande +
                "\nAggiunte: \n" + aggiunte + "\n";
    }
}
