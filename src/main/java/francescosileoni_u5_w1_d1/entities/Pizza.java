package francescosileoni_u5_w1_d1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
public class Pizza extends Menuarticoli {
    private List<Aggiunte> aggiunte;
    private boolean xl;

    public Pizza(String nome, double prezzo, int calorie, List<Aggiunte> aggiunte, boolean xl) {
        super(nome, prezzo, calorie);
        this.aggiunte = aggiunte;
        this.xl = xl;
    }

    public Pizza() {
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", " +
                "Prezzo: " + prezzo + ", " +
                "Calorie: " + calorie + " " +
                "\nIngredienti: \n" + aggiunte + "\n" +
                "XL: " + xl + "\n" +
                "--------------------" + "\n";
    }
}
