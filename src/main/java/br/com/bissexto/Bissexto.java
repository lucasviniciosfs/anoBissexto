package br.com.bissexto;

/**
 * Hello world!
 *
 */
public class Bissexto {
	public boolean anoBissexto(int ano) {

		// se o ano for maior que 400
		if (ano % 400 == 0) {
			System.out.println(ano + " é bissexto.");
			return true;
		// se o ano for menor que 400
		} else if ((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println(ano + " é bissexto.");
			return true; 
		} else {
			System.out.println(ano + " não é bissexto");
			return false;
		}
	}
}
