package br.com.alex.designpattern.factory;

import br.com.alex.designpattern.factory.Vehicles.IVehicles;
import br.com.alex.designpattern.factory.Vehicles.Motorcycle;

public class MotorcycleTransport extends Transport{
    @Override
    protected IVehicles createTransport() {
        return new Motorcycle();
    }
}
