package com.ejercicioJava.jpa.entity;

import static org.junit.Assert.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ejercicioJava.jpa.entity.Telefonos;


class TelefonosTest {

	private Telefonos sut;

	@BeforeEach
    public void setup() {
        sut = new Telefonos();
    }
	
	@Test 
    public void createTelefonosTest() {
		assertNotNull(sut);        
    }

}
