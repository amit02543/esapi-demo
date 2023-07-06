package com.amit.esapi;

import org.owasp.esapi.ESAPI;
import org.owasp.esapi.codecs.OracleCodec;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EsapiTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsapiTestingApplication.class, args);
		String table = ESAPI.encoder().encodeForSQL(new OracleCodec(), "Table");
		System.out.println("table = " + table);
	}

}
