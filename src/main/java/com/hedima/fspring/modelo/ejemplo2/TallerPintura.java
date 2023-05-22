package com.hedima.fspring.modelo.ejemplo2;

import org.springframework.stereotype.Component;

@Component("tp")
public class TallerPintura implements ITaller{
    @Override
    public String reparar(Coche c) {
        return "El coche con matricula " + c.getMatricula() + " se está reparando en taller de pintura";
    }
}
