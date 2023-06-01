import java.util.Scanner;

public class Methods {
    public static void transaction(Client client, Room room) {
//        Scanner sc = new Scanner(System.in);
//        sc =
        if (client.getBillAmmount() < room.getCost()) {
            System.out.println("На вашем счете не достаточно денег");
        } else {
            int finalSumm = 0;
            finalSumm = client.getBillAmmount() - room.getCost();
            client.setBillAmmountll(finalSumm);
            room.setNotFree(true);
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