package cwiczenia;

import java.util.Objects;

public class Prostokat implements MoznaWyznaczycWielokrotnoscPrzekatnej, MoznaWyznaczycWysokosc{
    int podstawa;
    int bok;

    public Prostokat(int i, int i1) {
        this.podstawa = i;
        this.bok = i1;
    }

    @Override
    public double podstawa() {
        return this.podstawa;
    }

    @Override
    public double katNachylenia() {
        return Math.PI / 2;
    }

    public double przekatna() {
        return Math.sqrt((podstawa * podstawa) + (bok * bok));
    }

    @Override
    public double bok() {
        return this.bok;
    }

    @Override
    public boolean equals(Object o) {
//        System.out.println("GetClass: " + hashCode());
//        System.out.println("GetClass passed: " + o.hashCode());
        if (this == o) return true;
        if (this.hashCode() == o.hashCode()) return true;
//        if (o instanceof MaWlasnosciRownolegloboku) {
//            return o.equals(this);
//        }
        if (o == null || getClass() != o.getClass()) return false;
        Prostokat prostokat = (Prostokat) o;
        return podstawa == prostokat.podstawa && bok == prostokat.bok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(podstawa, bok);
    }

    @Override
    public int wielokrotnoscPrzekatnej(int v) {
        return (int) wielokrotnoscPrzekatnej((double) v);
    }

    @Override
    public double wielokrotnoscPrzekatnej(double v) {
        return v * przekatna();
    }

    public double wysokosc() {
        return this.bok;
    }

    @Override
    public String toString() {
        return "prostokat";
    }
}
