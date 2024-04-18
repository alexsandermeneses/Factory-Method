package br.com.alex.designpattern.factory;

import br.com.alex.designpattern.factory.Vehicles.Car;
import br.com.alex.designpattern.factory.Vehicles.IVehicles;

public class CarTransport extends Transport{
    @Override
    protected IVehicles createTransport() {
        return new Car();
    }
}
