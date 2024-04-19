package br.com.alex.designpattern.factory;

import br.com.alex.designpattern.factory.Vehicles.Bike;
import br.com.alex.designpattern.factory.Vehicles.IVehicles;

public class BikeTransport extends Transport{

    @Override
    protected IVehicles createTransport() {
        return new Bike();
    }
}