public class House extends Building{
    private int floors;
    private String ownerName;

    public House(int floors, String ownerName,int height, double area, String address){
        super(height, area, address);
        try {
            setFloors(floors);
            this.ownerName = ownerName;
        } catch (FloorException e){
            System.err.println(e.getMessage());
        }
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) throws FloorException {
        if(floors < 0){
            throw new FloorException();
        }
        this.floors = floors;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
