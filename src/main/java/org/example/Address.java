package org.example;

import javax.persistence.*;

@Entity
@Table(name = "Adress")
public class Address {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "aids")
    private  int aid;
    @Column(name = "Village") private String vlg;
    @Column(name = "pin") private int pin;

    @Override
    public String toString() {
        return "Address{" +
                "aid=" + aid +
                ", vlg='" + vlg + '\'' +
                ", pin=" + pin +
                ", State='" + State + '\'' +
                '}';
    }

    public  Address()
{

}
    public Address(String vlg, int pin, String state) {
        this.vlg = vlg;
        this.pin = pin;
        State = state;
    }
    public Address(int aid, String vlg, int pin, String state) {
        this.aid = aid;
        this.vlg = vlg;
        this.pin = pin;
        State = state;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    @Column(name = "State")
    private String State;



    public String getVlg() {
        return vlg;
    }

    public void setVlg(String vlg) {
        this.vlg = vlg;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }
}
