package validate.interfaces;

import java.util.List;

public interface ServicesValidator extends BusinessValidation {
	public List<?> getListaValida();

	public void setListaProduzida(List<?> listaproduzida);

	public List<?> getListaProduzida();

}
