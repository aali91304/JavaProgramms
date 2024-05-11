package JavaChallenges;

public class carFinal {
    final int noOfWheels;
    final String model;
    final int engineInLitre;

    public carFinal(int noOfWheels, String model, int engineInLitre) {
        this.noOfWheels = noOfWheels;
        this.model = model;
        this.engineInLitre = engineInLitre;
    }

    public static void main(String[] args) {
        carFinal myCar = new carFinal(4, "Toyota Camry", 5);
        System.out.println("My car model: " + myCar.model);
        System.out.println("Number of wheels: " + myCar.noOfWheels);
        System.out.println("Engine in liters: " + myCar.engineInLitre);

    }
}
