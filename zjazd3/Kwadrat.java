package cwiczenia;

public class Kwadrat extends Prostokat implements MoznaWyznaczycPrzekatna {
    public Kwadrat(int i) {
        super(i, i);
    }
    public Kwadrat(int i, int i1) {
        super(i, i1);
    }

    @Override
    public String toString() {
        return "kwadrat";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
