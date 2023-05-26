public class Methods {
    public static void transaction(Client client, Room roomCost){
        if(client.getBillAmmount() < roomCost.getCost()) {
            System.out.println("На вашем счете не достаточно денег");
        }else {
            int finalSumm = 0;
            finalSumm = client.getBillAmmount() - roomCost.getCost();
            client.setBillAmmountll(finalSumm);
            System.out.println();
        }
    }
}
