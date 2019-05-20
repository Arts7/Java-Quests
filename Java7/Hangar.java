public class Hangar {

    public static void main(String[] args) {

        Car clio = new Car ("Clio", 123458);
        Boat titanic = new Boat ("Titanic", 2546);

        System.out.println("Je suis "+ clio.getBrand()+" et je fais vroum vroum!");
        System.out.println("Je suis " +titanic.getBrand()+" et je fais glou glou!");
    }
}