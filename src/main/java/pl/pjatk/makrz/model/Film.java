package pl.pjatk.makrz.model;

import java.util.Date;

public class Film {
    enum Category{Akcja, Dramat, Animacja, Przygodowy};
    private Long id;
    private Category category;
    private String name;
    private Date premier;
    private int grade;

    public Film(Long id, Category category, String name, Date premier, int grade) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.premier = premier;
        this.grade = grade;
    }

    public Film() {
    }


}
