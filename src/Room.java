public class Room {

    private Integer roomId;
    private Integer numberOfRooms;
    private String gender;
    private Integer cost;
    private boolean Free;



    public Room(Integer roomId, Integer numberOfRooms, String gender, Integer cost, boolean Free) {
        this.roomId = roomId;
        this.numberOfRooms = numberOfRooms;
        this.gender = gender;
        this.cost = cost;
        this.Free = Free;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(Integer numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public boolean Free() {
        return Free;
    }

    public void Free(boolean notFree) {
        this.Free = Free;
    }
}
