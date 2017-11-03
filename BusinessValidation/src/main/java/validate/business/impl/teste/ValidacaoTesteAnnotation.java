package validate.business.impl.teste;

import validate.annotation.Validate;
import validate.interfaces.BusinessValidation;

public class ValidacaoTesteAnnotation implements BusinessValidation {

	public Boolean valid() {
		return Boolean.TRUE;
	}

	public Boolean invalid() {
		return Boolean.FALSE;
	}

	@Validate(identificador=361)
	public Boolean validarQuantidade() {
		return this.valid();
		
	}
}
