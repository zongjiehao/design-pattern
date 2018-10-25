import java.util.List;

public class Customer implements Cloneable {
    private int id;
    private String name;
    private Address address;
    private List<String> hobbies;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    protected Customer clone() throws CloneNotSupportedException {
        return (Customer) super.clone();
    }

    public Customer(int id, String name, Address address, List<String> hobbies) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", hobbies=" + hobbies +
                ",  customer-hashCode=" + this.hashCode() +
                ",  address-hashCode=" + this.address.hashCode() +
                '}';
    }
}
