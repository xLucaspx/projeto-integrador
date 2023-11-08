package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	public static boolean validaString(String s) {
		if (s == null) return false;

		return !s.trim().isEmpty();
	}

	public static boolean validaCnpj(String cnpj) {
		if (cnpj == null) return false;

		Pattern p = Pattern.compile("^\\d{2}\\.?\\d{3}\\.?\\d{3}/?\\d{4}-?\\d{2}$");
		Matcher m = p.matcher(cnpj);
		return m.matches();
	}

	public static boolean validaTelefone(String telefone) {
		if (telefone == null) return false;

		Pattern p = Pattern.compile(
				"^\\(?(?:[14689][1-9]|2[12478]|3[1234578]|5[1345]|7[134579])\\)? ?(?:[2-8]|9 ?[1-9])[0-9]{3}\\-?[0-9]{4}$");
		Matcher m = p.matcher(telefone);
		return m.matches();
	}

	public static boolean validaEmail(String email) {
		if (email == null) return false;

		Pattern p = Pattern.compile(
				"^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");
		Matcher m = p.matcher(email);
		return m.matches();
	}

	public static boolean validaCep(String cep) {
		if (cep == null) return false;

		Pattern p = Pattern.compile("^\\d{5}-?\\d{3}$");
		Matcher m = p.matcher(cep);
		return m.matches();
	}

	public static boolean validaUf(String uf) {
		if (uf == null) return false;

		Pattern p = Pattern.compile("^[A-Z]{2}$");
		Matcher m = p.matcher(uf);
		return m.matches();
	}
}
