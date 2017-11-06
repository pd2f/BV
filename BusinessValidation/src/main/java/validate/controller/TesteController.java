package validate.controller;

import java.util.ArrayList;
import java.util.List;

import validate.conf.enumeration.ProcessosENUM;
import validate.interfaces.ServicesValidator;
import validate.service.impl.teste.ServiceValorTeste;

public class TesteController extends ValidateController {

	public void executarTeste() {
		Integer[] inteiros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> lt = new ArrayList<>();
		for (Integer integer : inteiros) {
			lt.add(integer);
		}
		ServicesValidator sv = new ServiceValorTeste(lt);
		TesteController.validar(sv,ProcessosENUM.TESTE.getIdentificador());
	}
}
