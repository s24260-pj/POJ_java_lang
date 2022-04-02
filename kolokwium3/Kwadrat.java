package main;

class Kwadrat extends Prostokat {
    private final double bok1;
    private final double bok2;

    public Kwadrat (double bok1, double bok2) {
        super(bok1, bok2);
        this.bok1 = this.bok2 = bok1;
    }

    public Kwadrat (double bok1) {
        super(bok1);
        this.bok1 = bok1;
        this.bok2 = bok1;
    }
}
