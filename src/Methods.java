import java.util.Scanner;

public class Methods {
    public static Hotel choseHotel(Hotel[] hotels) {
        System.out.println("Выберете отель");
        for (int i = 0; i < hotels.length; i++) {
            System.out.print(i + 1 + " - ");
            System.out.println(hotels[i].getName());
        }
        Scanner sc = new Scanner(System.in);
        Integer userChose = sc.nextInt();
        for (int i = 0; i < hotels.length; i++) {
            if (i + 1 == userChose) {
                System.out.println(hotels[i].getName());
                return hotels[i];
            }
        }
        return null;
    }

    public static Room choseRoom(Room[] rooms) {
        Room thisRoom = null;
        for (int i = 0; i < rooms.length; i++) {
            thisRoom = rooms[i];
            System.out.print(i + 1 + " - ");
            System.out.println(rooms[i].getNumberOfRooms() + " " + rooms[i].getCost() + " " + rooms[i].Free());
        }
        Scanner sc = new Scanner(System.in);
        Integer userChose = sc.nextInt();
        for (int i = 0; i < rooms.length; i++) {
            if (i + 1 == userChose) {
                return thisRoom;
            }
        }
        return null;
    }


    public static void transaction(Client client, Room room) {
//        Scanner sc = new Scanner(System.in);
//        sc =
        if (client.getBillAmmount() < room.getCost()) {
            System.out.println("На вашем счете не достаточно денег");
        } else {
            int finalSumm = 0;
            finalSumm = client.getBillAmmount() - room.getCost();
            client.setBillAmmountll(finalSumm);
            room.Free(true);
            System.out.println("Номер забронирован");

        }
    }
    //public static void choosTheCheapestRoom(Client client, Hotel[] hotels, Room[] rooms){
    //    hotels[0].roomArray

    public static void allMoney(Client[] client) {
        Integer sum = 0;
        for (int i = 0; i < client.length; i++) {
            sum = sum + client[i].getBillAmmount();
        }
        System.out.println(sum);

    }

}