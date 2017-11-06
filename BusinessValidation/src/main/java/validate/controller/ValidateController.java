package validate.controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

import validate.annotation.Validate;
import validate.service.impl.ServicesValidatorImpl;

public abstract class ValidateController {

	public static void validar(Object obj, Integer processo) {
		try {
			Package pk = obj.getClass().getPackage();
			System.out.println(pk.getPackages().length);
			Reflections r = new Reflections(pk.getName(), new SubTypesScanner(false));
			Set<Class<? extends ServicesValidatorImpl>> classes = r.getSubTypesOf(ServicesValidatorImpl.class);
			System.out.println(classes.size());
			// exibe a lista classes
			for (Class<?> c : classes) {
				System.out.println(c.getName());
				for (Method m : c.getDeclaredMethods()) {
					if (m.isAnnotationPresent(Validate.class)) {
						if (processo.compareTo(m.getAnnotation(Validate.class).identificador()) == 0)
							System.out.println(m.getName() + ": " + m.invoke(obj));

					}
				}

			}

//			@SuppressWarnings("rawtypes")
//			Class clazz = obj.getClass();
//			for (Method m : clazz.getDeclaredMethods()) {
//				if (m.isAnnotationPresent(Validate.class)) {
//					if (processo.compareTo(m.getAnnotation(Validate.class).identificador()) == 0)
//						System.out.println(m.getName() + ": " + m.invoke(obj));
//
//				}
//			}
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
