public class Address implements Cloneable{
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Address(String description) {
        this.description = description;
    }
    public Address Clone() throws CloneNotSupportedException{
        return (Address) super.clone();
    }
}
