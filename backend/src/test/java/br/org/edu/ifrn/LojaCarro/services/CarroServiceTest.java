package br.org.edu.ifrn.LojaCarro.services;

import br.org.edu.ifrn.LojaCarro.model.Carro;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarroServiceTest {

    @Test
    public void save() {
        Carro c = new Carro();
        c.setAno(1);
        c.setModelo("vnioani");
        c.setPreco(516253);
        c.setId(Long.valueOf(1236));

        assertEquals(c.getAno() > 0, true);
        assertEquals(!c.getModelo().isBlank(), true);
        assertEquals(c.getPreco() > 0, true);
        assertEquals(c.getId() > 0, true);
        assertEquals(c.getModelo().length() <= 3, true);
    }


    @Test
    public void findAll() {

    }

    @Test
    public void deleteById() {
        Long id = Long.valueOf(-3);

        assertEquals(id > 0, true);
    }

    @Test
    public void update() {
        Long id = Long.valueOf(-3);
        assertEquals(id > 0, true);
    }

}
