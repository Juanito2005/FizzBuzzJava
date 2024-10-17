package org.factoriaf5.fizzbuzz;

public class FizzbuzzLogic {
    public String FizzBuzz(Integer numero) {
        String numeroCadenaString = numero.toString();
        if (numero % 3 == 0 && numero % 5 == 0) {
            return "fizzbuzz";
        } else if (numero % 3 == 0 || numeroCadenaString.contains("3")) {
            return "fizz";
        } else if (numero % 5 == 0 || numeroCadenaString.contains("5") ) {
            return "buzz";
        }
        return String.valueOf(numero);
    }
}