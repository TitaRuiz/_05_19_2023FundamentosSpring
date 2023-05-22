package com.hedima.fspring.modelo.ejemplo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component
public class SeguroCoche {
    @Autowired
    private ITaller taller;
    private String aseguradora;

    public String reparar(Coche c){
        return taller.reparar(c);
    }
}
