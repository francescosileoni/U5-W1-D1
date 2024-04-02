package francescosileoni_u5_w1_d1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Aggiunte {
    private String nome;
    private double prezzo;
    private int calorie;

    public Aggiunte(String nome, double prezzo, int calorie) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.calorie = calorie;
    }

    public Aggiunte() {
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", " +
                "Prezzo: " + prezzo + ", " +
                "Calorie: " + calorie + "\n";
    }
}
