package br.com.alex.designpattern.factory.Vehicles;

import java.awt.*;

public class Motorcycle implements IVehicles{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Staring with motorcycle");
    }

    @Override
    public void getCargo() {
        System.out.println("Take food");
    }
}
