package com.application.springqlbh.dal;

import javax.persistence.*;

@Entity
public class Customers {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CustomerID", nullable = false)
    private int customerId;
    @Basic
    @Column(name = "Password", nullable = false, length = 20)
    private String password;
    @Basic
    @Column(name = "Fullname", nullable = false, length = 40)
    private String fullname;
    @Basic
    @Column(name = "Address", nullable = true, length = 50)
    private String address;
    @Basic
    @Column(name = "City", nullable = true, length = 20)
    private String city;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customers customers = (Customers) o;

        if (customerId != customers.customerId) return false;
        if (password != null ? !password.equals(customers.password) : customers.password != null) return false;
        if (fullname != null ? !fullname.equals(customers.fullname) : customers.fullname != null) return false;
        if (address != null ? !address.equals(customers.address) : customers.address != null) return false;
        if (city != null ? !city.equals(customers.city) : customers.city != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customerId;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (fullname != null ? fullname.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }
}
