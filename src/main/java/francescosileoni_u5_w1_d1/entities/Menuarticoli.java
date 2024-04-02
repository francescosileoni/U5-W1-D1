package francescosileoni_u5_w1_d1.entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Menuarticoli {
    protected String nome;
    protected double prezzo;
    protected int calorie;

    public Menuarticoli(String nome, double prezzo, int calorie) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.calorie = calorie;
    }

    public Menuarticoli() {
    }
}
