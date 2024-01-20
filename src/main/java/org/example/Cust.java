package org.example;

import javax.persistence.*;

@Entity
@Table(name = "Customer")
public class Cust {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cid")
    private int id;
    @Column(name = "cName")
    private String name;
    @Column(name = "phone")
    private int ph;
    @Column(name = "Email")
    private  String email;
    @OneToOne(fetch = FetchType.LAZY,cascade =CascadeType.REMOVE)
    @JoinColumn(name = "aid")

    private  Address address;

    public Cust(String name, int ph, String email, Address address) {
        this.name = name;
        this.ph = ph;
        this.email = email;
        this.address = address;
    }
    public Cust() {
        // Initialize any default values or perform other necessary setup
    }
    public Cust(String name, int ph, String email) {
        this.name = name;
        this.ph = ph;
        this.email = email;
    }

    public Cust(int id, String name, int ph, String email, Address address) {
        this.id = id;
        this.name = name;
        this.ph = ph;
        this.email = email;
        this.address = address;
    }

    public Cust(int id, String name, int ph, String email) {
        this.id = id;
        this.name = name;
        this.ph = ph;
        this.email = email;
    }

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

    public int getPh() {
        return ph;
    }

    public void setPh(int ph) {
        this.ph = ph;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Cust{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph=" + ph +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
