package validate.factory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import validate.annotation.Validate;
import validate.business.impl.teste.AplicationClientClass;
import validate.business.impl.teste.ValidacaoTesteAnnotation;
import validate.interfaces.BusinessValidation;

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
		validar(bv);
		BusinessValidation val = new AplicationClientClass();
		System.out.println("--------------------------------------");
		validar(val);
		System.out.println("--------------------------------------");

	}

	public static void validar(Object obj) {
		try {
			Object[] arr = { new String("std") };
			Class clazz = obj.getClass();
			for (Method m : clazz.getDeclaredMethods()) {
				if (m.isAnnotationPresent(Validate.class)) {
					System.out.println("identificador = " + m.getAnnotation(Validate.class).identificador());
					if (m.getParameterCount() >= 1)
						System.out.println(m.getName() + ": " + m.invoke(obj, arr));
					else
						System.out.println(m.getName() + ": " + m.invoke(obj));

				}
			}
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
