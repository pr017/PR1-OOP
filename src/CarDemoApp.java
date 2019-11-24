public class CarDemoApp {

    public static void main(String[] args) {

        Car porsche911;
        porsche911 = new Car();
        porsche911.colour = "black";
        porsche911.horsePower = 320;
        porsche911.manufacturer = "Porsche AG";
        porsche911.productionYear = 2019;
        porsche911.co2Output = 400;
        System.out.println("Farbe: " + porsche911.colour);


        Car golf8 = new Car();
        golf8.colour = "orange";
        golf8.co2Output = 80;
        golf8.productionYear = 2019;
        golf8.manufacturer = "Volkswagen";
        golf8.horsePower = 85;
        System.out.println(golf8.horsePower);

        System.out.println("Aktueller Gang: " + golf8.getCurrentGear());
        golf8.setGear(3);
        System.out.println("Aktueller Gang: " + golf8.getCurrentGear());
        golf8.shiftGear();
        System.out.println("Aktueller Gang: " + golf8.getCurrentGear());
        golf8.shiftGear(2);
        System.out.println("Aktueller Gang: " + golf8.getCurrentGear());
        golf8.setGear(1);
        System.out.println("Aktueller Gang: " + golf8.getCurrentGear());
    }

}
