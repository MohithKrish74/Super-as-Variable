package com.keyword;


class Vehicle
{
    String fuel_type="Diesel";
}
class Bike extends Vehicle
{
    String fuel_type="Petrol";
    public void show()
    {
        System.out.println("Parent Class Fuel type is "+super.fuel_type);
        System.out.println("Child Class Fuel type is "+fuel_type);

    }

}

public class SuperAsVariable
{
    public static void main(String[] args)
    {
        Bike obj = new Bike();
        obj.show();
    }
}



