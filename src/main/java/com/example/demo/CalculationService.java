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
		public String addNo(String int01, String int02) throws IOException {
			float addSum = Integer.parseInt(int01) + Integer.parseInt(int02);
			return "The sum of " + int01 + " + " + int02 + " = " + addSum;
		} 

		@RequestMapping(value = "/sub", method = RequestMethod.GET)
		public String subNo(String int01, String int02) throws IOException {
			float subDiff = Integer.parseInt(int01) - Integer.parseInt(int02);
			return "The difference of " + int01 + " - " + int02 + " = " + subDiff;
		}
		
		@RequestMapping(value = "/mlt", method = RequestMethod.GET)
		public String mltNo(String int01, String int02) throws IOException {
			float mltProd = Integer.parseInt(int01) * Integer.parseInt(int02);
			return "The product of " + int01 + " * " + int02 + " = " + mltProd;
		}
		
		@RequestMapping(value = "/div", method = RequestMethod.GET)
		public String divNo(String	 int01, String int02) throws IOException {
			float divQuo = Integer.parseInt(int01) / Integer.parseInt(int02);			
			return "The quotient of " + int01 + " / " + int02 + " = " + divQuo;
		}
		

		
}