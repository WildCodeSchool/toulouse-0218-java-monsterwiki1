package fr.wcs.monsterwiki;

/**
 * Created by wilder on 06/03/18.
 */

public class MonsterModel {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProfil() {
        return profil;
    }

    public void setProfil(int profil) {
        this.profil = profil;
    }

    public int getElement1() {
        return element1;
    }

    public void setElement1(int element1) {
        this.element1 = element1;
    }

    public int getElement2() {
        return element2;
    }

    public void setElement2(int element2) {
        this.element2 = element2;
    }

    private String name;
    private int profil;
    private int element1;
    private int element2;


    public MonsterModel(String name, int profil, int element1, int element2) {
        this.name = name;
        this.profil = profil;
        this.element1 = element1;
        this.element2 = element2;
    }
}
