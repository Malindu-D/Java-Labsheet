public class Item {
    private int location;
    private String description;
    public Item (int location,String description){
        this.location = location;
        this.description =description;
    }

    public int getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

class Monster extends Item {
    public Monster(int location, String description) {
        super(location, description);
    }
}
