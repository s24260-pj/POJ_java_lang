package main;

class Prostokat {
    private final double bok1;
    private final double bok2;

    public Prostokat(double bok1, double bok2) {
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    public Prostokat(double bok1) {
        this.bok1 = bok1;
        this.bok2 = bok1;
    }

    protected double przekatna(double mnoznik) {
        return  Math.sqrt((this.bok1 * this.bok1) + (this.bok2 * this.bok2)) * mnoznik;
    }

    protected double przekatna() {
        return Math.sqrt((this.bok1 * this.bok1) + (this.bok2 * this.bok2));
    }

    protected int przekatna(int bok1) {
        return (int) Math.sqrt((bok1 * bok1) + (bok1 * bok1));
    }

    @Override
    public boolean equals(Object obj) {
        final Prostokat prostokat = (Prostokat) obj;

        return prostokat.przekatna() == this.przekatna();
    }
}
