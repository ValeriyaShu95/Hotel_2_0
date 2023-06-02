public class Hotel {
    private Room [] roomArray = new Room[]{};
    private String name;

    public Hotel(String name, Room[] roomArray) {
        this.name = name;
        this.roomArray = roomArray;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room[] getRoomArray() {
        return roomArray;
    }

    public void setRoomArray(Room[] roomArray) {
        this.roomArray = roomArray;
    }
}
