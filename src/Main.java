public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("Max", "male", "+7131332", "fg@njd.ru", 290);
        Client client2 = new Client("Lera", "female", "+71232442", "jfjf@gdjgn.ru", 10);
        Client [] clients = new Client[]{client1, client2};

        Room hotel1room1 = new Room(1, 2,"male", 200, false);
        Room[] roomsHotel1 = new Room[]{hotel1room1};
        Hotel hotel1 = new Hotel("Vagas", roomsHotel1);

        Room[] roomsHotel2 = new Room[]{};
        Hotel hotel2 = new Hotel("Vagas", roomsHotel2);

        Room[] roomsHotel3 = new Room[]{};
        Hotel hotel3 = new Hotel("Vagas", roomsHotel3);

        Hotel [] hotelsArray = new Hotel[]{hotel1, hotel2, hotel3};

        //Methods.transaction(client1, hotel1room1);
        Methods.allMoney(clients);


    }
}