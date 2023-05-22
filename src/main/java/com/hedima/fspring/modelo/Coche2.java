package com.hedima.fspring.modelo;

import org.springframework.stereotype.Component;

@Component
public class Coche2 implements IVehiculo{
    @Override
    public String moverse() {
        return "Se esta moviendo";
    }
}
