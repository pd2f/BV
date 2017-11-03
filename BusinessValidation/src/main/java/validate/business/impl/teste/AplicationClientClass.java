package validate.business.impl.teste;

import validate.annotation.Validate;
import validate.interfaces.BusinessValidation;

public class AplicationClientClass implements BusinessValidation{

	public String execution(String msg) {
		return msg;
	}

	@Validate(identificador = 377)
	public String nonExecution(String msg) {
		return msg;
	}

	@Validate(identificador = 188)
	public String testes() {
		return "teste";
	}

	@Override
	public Boolean valid() {
		return Boolean.TRUE;
	}
}
