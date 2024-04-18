package br.com.alex.designpattern.factory.Vehicles;

public class Car implements IVehicles{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Starting with car");
    }

    @Override
    public void getCargo() {
        System.out.println("Take");
    }
}
