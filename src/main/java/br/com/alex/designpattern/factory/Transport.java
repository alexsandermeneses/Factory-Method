package br.com.alex.designpattern.factory;

import br.com.alex.designpattern.factory.Vehicles.IVehicles;

public abstract class Transport {
       void startTransport(){
            IVehicles vehicles = createTransport();
            vehicles.startRoute();
       }
       protected abstract IVehicles createTransport();
}