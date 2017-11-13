package validate.controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

import validate.annotation.Validate;
import validate.conf.enumeration.ValidacoesPacotesENUM;
import validate.service.impl.ServicesValidatorImpl;

public abstract class ValidateController {

	public final static void validar(Object obj, Integer processo) {
		try {
			for (ValidacoesPacotesENUM e : ValidacoesPacotesENUM.values()) {
				Reflections r = new Reflections(e.getNomePacote(), new SubTypesScanner(false));
				Set<Class<? extends ServicesValidatorImpl>> classes = r.getSubTypesOf(ServicesValidatorImpl.class);
				for (Class<?> c : classes) {
					System.out.println(c.getName());
					for (Method m : c.getDeclaredMethods()) {
						if (m.isAnnotationPresent(Validate.class)) {
							if (processo.compareTo(m.getAnnotation(Validate.class).identificador()) == 0)
								System.out.println(m.getName() + ": " + m.invoke(obj));
						}
					}

				}
			}

		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}