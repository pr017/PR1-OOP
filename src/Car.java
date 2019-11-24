public class Car {          //keine Main-Methode. Klassen immer groß geschrieben! Variablen klein

    public String colour;
    public String manufacturer;
    public int productionYear;
    public int horsePower;
    public double co2Output;

    private int currentGear;

    public int getCurrentGear(){
        return currentGear;
    }

    public void shiftGear(){           //kein static mehr nötig.

        shiftGear(1);
    }

    public void shiftGear(int gear){
        if (currentGear + gear < 1)
            return;

        if (currentGear + gear <= 7);       // einzeilige if -> geschwungene KLammer weglassen
        currentGear += gear;
    }

    public void setGear(int currentGear){

       this.currentGear = currentGear;
    }
}
