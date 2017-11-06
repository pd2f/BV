package validate.factory;

import java.util.ArrayList;
import java.util.List;

import validate.business.impl.teste.AplicationClientClass;
import validate.business.impl.teste.ValidacaoTesteAnnotation;
import validate.controller.TesteController;
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
//		System.out.println("Hello World!");
//		AplicationClientClass aplicacao = new AplicationClientClass();
//		aplicacao.execution("Teste de Mensagem anotacao");
//		aplicacao.nonExecution("Teste de Mensamgem nonanotacao");
//		BusinessValidation bv = new ValidacaoTesteAnnotation();
//		ValidateController.validar(bv);
//		BusinessValidation val = new AplicationClientClass();
//		System.out.println("--------------------------------------");
//		ValidateController.validar(val);
//		System.out.println("--------------------------------------");

		
new TesteController().executarTeste();;
//		ValidateController.validar(sv);

	}

}
