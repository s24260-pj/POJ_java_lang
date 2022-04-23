package main;

public class Usmiech extends Buzka implements Skalowalny {
    char znak;
    public Usmiech() {
        super(')');
        this.znak = ')';
    }

    @Override
    public void draw(int times) {
        System.out.print(":-)");
        if (times > 1)
            System.out.print(")".repeat(times - 1));
        System.out.println();
    }
    @Override
    public void draw() {
        System.out.print(":-) \n");
    }

    @Override
    public String toString() {
        return ":-)";
    }

    @Override
    public boolean czySieUsmiecha() {
        return true;
    }

    @Override
    public void przestanSieUsmiechac() {

    }
}
