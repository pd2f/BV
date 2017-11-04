package validate.service.impl.teste;

import java.util.List;

import validate.interfaces.ServicesValidates;

public class ServicesValidatesImpl implements ServicesValidates {

	private List<?> listaproduzida, listavalida;

	@Override
	public Boolean valid() {
		if (this.getListaValida() == null || this.getListaProduzida() == null)
			return Boolean.FALSE;

		return Boolean.logicalAnd(this.getListaValida().containsAll(getListaProduzida()),
				this.getListaProduzida().containsAll(getListaValida()));

	}

	@Override
	public List<?> getListaValida() {
		return this.listavalida;
	}

	@Override
	public List<?> getListaProduzida() {
		return this.listaproduzida;
	}

	@Override
	public void setListaProduzida(List<?> listaproduzida) {
		this.listaproduzida = listaproduzida;
	}

}
