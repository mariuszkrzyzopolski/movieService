package pl.pjatk.makrz.model;

import java.util.Date;

public class Movie {
    private Long id;
    private Category category;
    private String name;
    private Date premier;
    private int grade;

    public Movie() {
    }

    public Movie(Long id, Category category, String name, Date premier, int grade) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.premier = premier;
        this.grade = grade;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPremier() {
        return premier;
    }

    public void setPremier(Date premier) {
        this.premier = premier;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
