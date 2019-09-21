package dto;

import entities.Person;
import entities.Address;

public class PersonDTO {

    private long id;
    private String fName;
    private String lName;
    private String phone;
    private Address address;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    
    
    public PersonDTO(Person p) {
        this.id = p.getId();
        this.fName = p.getfName();
        this.lName = p.getlName();
        this.phone = p.getPhone();
        this.address = p.getAddress();
    }
    
    public PersonDTO() {
    }
}
