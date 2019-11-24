public class PersonDemoApp {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name1 = "Max";
        person1.name2 = "Mustermann";
        person1.job = "none";
        person1.town = "Graz";
        person1.age = 39;
       // System.out.println(person1.name1 + " " + person1.name2 + ", " + person1.age + " Jahre");

        printPerson(person1);
    }

    public static void printPerson(Person x) {

        System.out.println(x.name1 + " " + x.name2 + ", " + x.age + " Jahre");

    }

}
