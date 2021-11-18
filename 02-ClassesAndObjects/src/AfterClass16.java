public class AfterClass16 {
    static class Rectangle {
        int sideA;
        int sideB;

        public Rectangle(int sideA, int sideB) {
            this.sideA = sideA;
            this.sideB = sideB;
        }

        void showDimensions() {
            System.out.println("Wymiary Prostokąta to: " + sideA + "x" + sideB);
        }

        void showPerimeters() {
            System.out.println("Obwód prostokąta wynosi: " + (2*sideA + 2*sideB));
        }

        void showSurfaceArea() {
            System.out.println("Pole prostokąta to: " + (sideA*sideB));
        }
    }

    public static void main(String[] args) {
        Rectangle rectOne = new Rectangle(2,4);
        Rectangle rectTwo = new Rectangle(2,7);

        rectOne.showDimensions();
        rectOne.showPerimeters();
        rectOne.showSurfaceArea();
        System.out.println();
        rectTwo.showDimensions();
        rectTwo.showPerimeters();
        rectTwo.showSurfaceArea();
    }
}
