package main;

import java.util.Objects;

public class Buzka implements PrzedstawiaEmocje, Rysowalny {

    char znak;

    public Buzka(char c) {
        this.znak = c;
    }

    @Override
    public void draw() {
        System.out.println(":-"+this.znak);
    }

    @Override
    public boolean czySieUsmiecha() {
        return this.znak == ')';
    }

    @Override
    public void przestanSieUsmiechac() {
        this.znak = '(';
    }

    @Override
    public String toString() {
        return ":-"+this.znak;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Buzka buzka = (Buzka) o;
        return znak == buzka.znak;
    }

    @Override
    public int hashCode() {
        return Objects.hash(znak);
    }
}
