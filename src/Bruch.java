public class Bruch {

    private int nenner;
    private int zaehler;

    public Bruch(int nenner, int zaehler) {
        this.nenner = nenner;
        this.zaehler = zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    public int getZaehler() {
        return zaehler;
    }

    public double toDecimal(){
        double erg = zaehler / (nenner) * 1.0;
        return erg;
    }

    void print(){
        System.out.println(zaehler + " / " + nenner);
    }

    public Bruch multiplicate(Bruch b2){
        int neuerZaehler = zaehler * b2.getZaehler();
        int neuerNenner = nenner * b2.getNenner();

        Bruch neuerBruch = new Bruch(neuerZaehler, neuerNenner);
        return neuerBruch;

    }

    public Bruch multiplicate(Bruch b2, Bruch b3 ){

        return  multiplicate(b2).multiplicate(b3);
        //int neuerZaehler = b2.zaehler * b3.getZaehler();
        //int neuerNenner = b2.nenner * b3.getNenner();
    }

}
