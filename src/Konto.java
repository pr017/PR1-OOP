public class Konto {

    private String kontoinhaber;
    private double kontostand;

    public String getInhaber(){
        return kontoinhaber;
    }

    public double getKontostand(){
        return kontostand;
    }

   public Konto (String inhaber){

        kontoinhaber = inhaber;
        kontostand = 75;
   }

    public void aufbuchen(double betrag){

        if (betrag > 1_000_000)
        {
            System.out.println("Achtung, eventuell Geldwäsche");
        }
        kontostand += betrag;

    }

    public void abbuchen(double betrag){

        double temp = kontostand - betrag;
        if (temp >= 0)
            kontostand = temp;
        else {
            System.out.println("Zu wenig Geld verfügbar");
        }
        kontostand -= betrag;

    }
}
