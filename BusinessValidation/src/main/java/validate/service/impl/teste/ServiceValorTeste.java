package validate.service.impl.teste;

import java.util.ArrayList;
import java.util.List;

import validate.annotation.Validate;
import validate.service.impl.ServicesValidatorImpl;

public class ServiceValorTeste extends ServicesValidatorImpl {


	public ServiceValorTeste(List<?> lista) {
		super(lista);
	}

	@Validate(identificador=101)
	@Override
	public List<?> getListaValida() {
		Integer[] inteiros = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10 };
		List<Integer> lt = new ArrayList<>();

		for (Integer integer : inteiros) {
			lt.add(integer);

		}
		
		return lt;
	}

}
