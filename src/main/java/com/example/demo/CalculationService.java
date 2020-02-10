package com.example.demo;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller  
@RestController
public class CalculationService {

	//using get method and hello-world as URI  
		@RequestMapping(method = RequestMethod.GET, path = "/add")
		public double addNo(double int01, double int02) throws IOException {
			double addSum = int01 + int02;
			return addSum;
		} 

		@RequestMapping(value = "/sub", method = RequestMethod.GET)
		public double subNo(double int01, double int02) throws IOException {
			double subDiff = int01 - int02;
			return subDiff;
		}
		
		@RequestMapping(value = "/mlt", method = RequestMethod.GET)
		public double mltNo(double int01, double int02) throws IOException {
			double mltProd = int01 * int02;
			return mltProd;
		}
		
		@RequestMapping(value = "/div", method = RequestMethod.GET)
		public double divNo(double int01, double int02) throws IOException {
			double divQuo = int01 / int02;			
			return divQuo;
		}
		

		
}