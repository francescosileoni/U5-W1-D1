package francescosileoni_u5_w1_d1.entities;

import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Bean {
    @org.springframework.context.annotation.Bean
    public Aggiunte salame() {
        return new Aggiunte("Salame", 1.49, 86);
    }

    @org.springframework.context.annotation.Bean
    public Aggiunte prosciuttocotto() {
        return new Aggiunte("Prosciutto cotto", 0.99, 35);
    }

    @org.springframework.context.annotation.Bean
    public Aggiunte mozzarella() {
        return new Aggiunte("Mozzarella", 0.49, 24);
    }

    @org.springframework.context.annotation.Bean
    public Aggiunte olivenere() {
        return new Aggiunte("Olive nere", 0.49, 12);
    }

    @org.springframework.context.annotation.Bean
    public Aggiunte salsa() {
        return new Aggiunte("Salsa", 1.49, 86);
    }

    @org.springframework.context.annotation.Bean
    public Pizza margherita() {
        return new Pizza("Margherita", 4.99, 1104, List.of(salsa(), mozzarella()), true);
    }

    @org.springframework.context.annotation.Bean
    public Pizza diavola() {
        return new Pizza("Diavola", 5.99, 1024, List.of(salsa(), mozzarella(), salame(), olivenere()), false);
    }

    @org.springframework.context.annotation.Bean
    public Pizza capricciosa() {
        return new Pizza("A modo mio", 8.99, 1160, List.of(salsa(), mozzarella(), prosciuttocotto(), salame()), true);
    }

    @org.springframework.context.annotation.Bean
    public Bevande limonata() {
        return new Bevande("Limonata (0.33L)", 1.29, 128);
    }

    @org.springframework.context.annotation.Bean
    public Bevande acquanaturale() {
        return new Bevande("Acqua naturale (0.5L)", 1.29, 0);
    }

    @org.springframework.context.annotation.Bean
    public Bevande vino() {
        return new Bevande("Vino Rosso (0.75L, 13%)", 1.29, 128);
    }

    @org.springframework.context.annotation.Bean
    public Menu menu() {
        return new Menu(List.of(margherita(), diavola(), capricciosa()), List.of(limonata(), acquanaturale(), vino()), List.of(salame(), prosciuttocotto(), mozzarella(), olivenere(), salsa()));
    }
}

