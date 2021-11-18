public class AfterClass16 {
    static class InternetDevice {
        String name;
        boolean onlineStatus;
        static int devicesOnline = 0;

        public InternetDevice(String name) {
            this.name = name;
        }

        void connect() {
            if (onlineStatus == false) {
                onlineStatus = true;
                devicesOnline += 1;
            }
        }

        void disconnect() {
            if (onlineStatus == true) {
                onlineStatus = false;
                devicesOnline -= 1;
            }
        }

        void isConnected() {
            if (onlineStatus == false) {
                System.out.println("Device is offline..");
            } else {
                System.out.println("Device is online..");
            }
        }

        void displayStatus() {
            System.out.println("Device: " + name);
            isConnected();
        }

        public static void displayConnections() {
            System.out.println("Devices online: " + devicesOnline);
        }

    }

    public static void main(String[] args) {
        InternetDevice pc = new InternetDevice("personal computer");
        InternetDevice tablet = new InternetDevice("tablet");
        InternetDevice laptop = new InternetDevice("laptop");
        InternetDevice smartphone = new InternetDevice("smartphone");
        InternetDevice tv = new InternetDevice("tv");

        pc.connect();
        tablet.disconnect();
        laptop.disconnect();
        smartphone.connect();
        tv.connect();


        pc.displayStatus();
        tablet.displayStatus();
        laptop.displayStatus();
        smartphone.displayStatus();
        tv.displayStatus();

        InternetDevice.displayConnections();






    }
}
