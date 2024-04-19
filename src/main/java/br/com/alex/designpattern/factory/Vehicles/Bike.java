package br.com.alex.designpattern.factory.Vehicles;

public class Bike implements IVehicles{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Starting delivery with bike");
    }

    @Override
    public void getCargo() {
        System.out.println("Take food");
    }
}
