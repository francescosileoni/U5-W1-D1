package francescosileoni_u5_w1_d1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Bevande extends Menuarticoli {
    public Bevande(String nome, double prezzo, int calorie) {
        super(nome, prezzo, calorie);
    }

    public Bevande() {

    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", " +
                "Prezzo: " + prezzo + ", " +
                "Calorie: " + calorie + "\n";
    }
}