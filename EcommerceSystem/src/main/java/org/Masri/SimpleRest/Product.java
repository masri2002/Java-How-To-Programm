package org.Masri.SimpleRest;

public class Product extends UserLogin{
    public String Name;
    public int Price;
    public int quantity;
    public String location;

    public Product(String n,int p,int q, String d,String User_Name) {
        super();
        this.name = User_Name;
        this.Name = n;
        this.Price = p;
        this.location = d;
        this.quantity = q;
    }

    public void setName(String n) {
        this.Name = n;
    }
    public void setQuantity(int q) {
        this.quantity = q;
    }
    public void setPrice(int p) {
        this.Price = p;
    }
    public void setDescrip(String d) {
        this.location = d;
    }

    public String getname() {
        return Name;
    }
    public int getQuantity() {
        return quantity;
    }


    public int getPrice() {
        return Price;

    }
    public String getlocation() {
        return location;
    }
}
