public class AfterClass22 {
    static class Room {
        String number;
        int beds;
        boolean occupied;
        String guestName;

        public Room(String number) {
            this.number = number;
            beds = 2;
        }

        public Room(String number, int beds) {
            this.number = number;
            this.beds = beds;
        }

        void checkin(String guestName) {
            this.guestName = guestName;
            this.occupied = true;
        }

        void checkout() {
            guestName = "Free room";
        }

        void isOccupied() {
            if (occupied == true) {
                System.out.println("Is occupied.");
            } else {
                System.out.println("Is not occupied.");
            }
        }

        void displayStatus() {
            System.out.println("Room: " + number + ", Beds:" + beds + ", Is occupied: " + occupied + ", Guest Name: " + guestName);
        }
    }
//===================== methods for handlig rooms data ====================================

//        single room data
        static void showOneRoom(int roomNumber, Room[] rooms) {
            if (roomNumber <= (rooms.length-1)) {
                rooms[roomNumber].displayStatus();
                System.out.println();
            } else {
                System.out.println("There is only rooms form: 0 - " + (rooms.length-1));
                System.out.println();
            }
        }

//        all room data
        static void showAllRooms(Room[] rooms) {
            for (int i = 0; i < rooms.length; i++) {
                rooms[i].displayStatus();
            }
            System.out.println();
        }

//        display rooms with specified number of beds
        static void showRoomWithSpecBeds(int beds, Room[] rooms) {
            for (int i = 0; i < rooms.length; i++) {
                if (rooms[i].beds == beds) {
                    rooms[i].displayStatus();
                }
            }
        }

//        display roomsAvailability

        static void showRoomsAvailability(Room[] rooms) {
            int occupiedRooms = 0;
            int freeRooms = 0;

            for (int i = 0; i < rooms.length; i++) {
                if (rooms[i].occupied == false) {
                    freeRooms += 1;
                } else {
                    occupiedRooms +=1;
                }
            }

            System.out.println("Free rooms: " + freeRooms);
            System.out.println("Occupied rooms: " + occupiedRooms);
        }

//        display available beds
        static void showAvailableBeds(Room[] rooms) {
            int sumOfBeds  = 0;
            for (int i = 0; i < rooms.length; i++) {
                if (rooms[i].occupied == false) {
                    sumOfBeds += rooms[i].beds;
                }
            }
            System.out.println("Free beds at the moment: " + sumOfBeds);
        }



//========================= MAIN ===================================
        public static void main(String[]args) {

            Room[] listOfRooms = new Room[6];

//          Creating new rooms in array
            for (int i = 0; i < listOfRooms.length; i++) {
                if (i < 3) {
                    listOfRooms[i] = new Room(String.valueOf(i));
                } else if (i >= 3 && i < 5) {
                    listOfRooms[i] = new Room(String.valueOf(i), 3);
                } else {
                    listOfRooms[i] = new Room(String.valueOf(i), 1);
                }
            }

            listOfRooms[2].checkin("Thomas");
            listOfRooms[5].checkin("Angela");


            showOneRoom(2, listOfRooms); // a
            showAllRooms(listOfRooms); // b
            showRoomWithSpecBeds(3, listOfRooms); // c
            System.out.println();
            showRoomsAvailability(listOfRooms); // d
            System.out.println();
            showAvailableBeds(listOfRooms); // e

        }
    }

