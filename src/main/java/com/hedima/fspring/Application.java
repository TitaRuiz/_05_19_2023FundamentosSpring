package com.hedima.fspring;

import com.hedima.fspring.modelo.ejemplo2.Coche;
import com.hedima.fspring.modelo.Conductor;
import com.hedima.fspring.modelo.ejemplo2.SeguroCoche;
import com.hedima.fspring.modelo.ejemplo2.TallerMecanica;
import com.hedima.fspring.modelo.ejemplo2.TallerPintura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private Conductor c2;
    @Autowired
    private Coche c1;
    @Autowired
    private SeguroCoche s1;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Coche c1 = new Coche();
//        c1.setDeposito(35);
//        Conductor c2 = new Conductor();
//        c2.setVehiculo(c1);
//        ((Coche) c2.getVehiculo()).setDeposito(35);
//        System.out.println(c2.conducir());
//        Coche c1 = new Coche();
        c1.setMatricula("123ABC");
        c1.setModelo("Seat Leon");
//        TallerPintura tp = new TallerPintura();
//        TallerMecanica tm = new TallerMecanica();
//        SeguroCoche s1 = new SeguroCoche();
//        s1.setTaller(tm);

        System.out.println(s1.reparar(c1));

    }
}
