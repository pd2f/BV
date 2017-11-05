package validate.controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import validate.annotation.Validate;
import validate.conf.enumeration.ProcessosENUM;

public class ValidateController {


	public static void validar(Object obj) {
		try {
			Object[] arr = { new String("std") };
			@SuppressWarnings("rawtypes")
			Class clazz = obj.getClass();
			for (Method m : clazz.getDeclaredMethods()) {
				if (m.isAnnotationPresent(Validate.class)) {
					m.getAnnotation(Validate.class).identificador();
					ProcessosENUM.TESTE.getIdentificador();
					if (m.getParameterCount() >= 1)
						System.out.println(m.getName() + "1: " + m.invoke(obj, arr));
					else
						System.out.println(m.getName() + "2: " + m.invoke(obj));

				}
			}
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
