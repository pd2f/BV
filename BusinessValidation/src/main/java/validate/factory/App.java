package validate.factory;

import java.util.ArrayList;
import java.util.List;

import validate.business.impl.teste.AplicationClientClass;
import validate.business.impl.teste.ValidacaoTesteAnnotation;
import validate.controller.ValidateController;
import validate.interfaces.BusinessValidation;
import validate.interfaces.ServicesValidator;
import validate.service.impl.teste.ServiceValorTeste;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		AplicationClientClass aplicacao = new AplicationClientClass();
		aplicacao.execution("Teste de Mensagem anotacao");
		aplicacao.nonExecution("Teste de Mensamgem nonanotacao");
		BusinessValidation bv = new ValidacaoTesteAnnotation();
		ValidateController.validar(bv);
		BusinessValidation val = new AplicationClientClass();
		System.out.println("--------------------------------------");
		ValidateController.validar(val);
		System.out.println("--------------------------------------");

		Integer[] inteiros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> lt = new ArrayList<>();

		for (Integer integer : inteiros) {
			lt.add(integer);

		}

		ServicesValidator sv = new ServiceValorTeste(lt);

		ValidateController.validar(sv);

	}

}
