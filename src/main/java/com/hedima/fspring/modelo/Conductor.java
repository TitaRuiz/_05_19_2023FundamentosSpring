package com.hedima.fspring.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Conductor {
    @Autowired
    private IVehiculo vehiculo;

    public String conducir(){
        return vehiculo.moverse();
    }


}
