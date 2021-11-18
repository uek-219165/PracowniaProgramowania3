public class AfterClass15 {
    static class Lamp {
        boolean lampState;

        void turnOn() {
            lampState = true;
        }

        void turnOff() {
            lampState = false;
        }

        void lampInfo() {
            System.out.println("Is lamp turned on: " + lampState);
        }
    }

    public static void main(String[] args) {
        Lamp lampOne = new Lamp();
        Lamp lampTwo = new Lamp();

        lampOne.turnOn();
        lampTwo.turnOff();

        lampOne.lampInfo();
        lampTwo.lampInfo();
    }

}
