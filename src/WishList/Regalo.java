package WishList;

public class Regalo {
    private String description;
    private String destination;

    public Regalo(String description, String destination) {
        this.description = description;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Regalo{" +
                "description='" + description + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
