package com.crio.qcalc;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcApplication {

	public static void main(String[] args) {
		// SpringApplication.run(QcalcApplication.class, args);
		StandardCalculator calc = new StandardCalculator();
		calc.add(1, 2);
		System.out.println(calc.getResult());

		calc.substract(1, 2);
		System.out.println(calc.getResult());
	}
}