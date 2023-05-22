package com.hedima.fspring.modelo.ejemplo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component
public class Coche {
    private String matricula;
    private String modelo;

}
