package validate.service.impl;

import java.util.List;

import validate.interfaces.ServicesValidator;

/**
 * Classe abstrata que implementa a interface de serviço de validação.
 * 
 * É requerido que o controle da aplicação instancie e forneça o resultado a ser validado
 * à instância; preferencialmente usando o construtor. 
 * O serviço que herdará a implementação {@linkplain ServicesValidatorImpl}
 * deverá fornecer a lista de resultados ou critérios válidos. 
 * 
 * @author pfranco
 *
 * @category Validação (Validar Produto ou Componente de Produto)
 */
public abstract class ServicesValidatorImpl implements ServicesValidator {

	private List<?> listaproduzida;

	public ServicesValidatorImpl(List<?> lista) {
		this.setListaProduzida(lista);
	}
	
	@Override
	public final Boolean valid() {
		if (this.getListaValida() == null || this.getListaProduzida() == null)
			return Boolean.FALSE;

		return Boolean.logicalAnd(this.getListaValida().containsAll(getListaProduzida()),
				this.getListaProduzida().containsAll(getListaValida()));

	}

	@Override
	public abstract List<?> getListaValida();

	@Override
	public List<?> getListaProduzida() {
		return this.listaproduzida;
	}

	@Override
	public void setListaProduzida(List<?> listaproduzida) {
		this.listaproduzida = listaproduzida;
	}

}
