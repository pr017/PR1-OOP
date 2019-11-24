public class KontoDemoApp {

    public static void main(String[] args) {

        Konto k1 = new Konto(inhaber"Susi");


        Konto k2 = new Konto();


        printKonto(k1);
        printKonto(k2);

        k1.abbuchen(betrag 200);
        k2.abbuchen(betrag 500);




    }

}
