package sdrJavaDeveloper;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Util {


	public static String[] arrFieldsNames(Class clazz) {
		Field[] fields = clazz.getDeclaredFields();
		List<String> arrFieldsNames = new ArrayList<String>();

		for (int indiceFields = 0; indiceFields < fields.length; indiceFields++) {
			if (!containsIdFieldAnotation(fields[indiceFields].getAnnotations())) {
				arrFieldsNames.add(fields[indiceFields].getName());
			}
		}

		String[] arrString = new String[arrFieldsNames.size()];
		arrString = arrFieldsNames.toArray(arrString);
		System.out.println(arrString);
		return arrString;

	}


	public static String getStringInsertValues(Class clazz) {
		Field[] fields = clazz.getDeclaredFields();
		String strFields = "INSERT INTO "+clazz.getSimpleName()+" VALUES (";

		for (int indiceFields = 0; indiceFields < fields.length; indiceFields++) {

			if (!containsIdFieldAnotation(fields[indiceFields].getAnnotations())) {
				if (indiceFields < (fields.length - 1)) {
					strFields += " :" + fields[indiceFields].getName() + ",";
				} else {
					strFields += " :" + fields[indiceFields].getName() + ")";
				}
			}
		}

		System.out.println(strFields);

		return strFields;

	}
	
	
	public static String getStringSelecCompletoByClass(Class clazz){
		return "SELECT count(*) FROM " + clazz.getSimpleName();
	}
	
	
	

	private static boolean containsIdFieldAnotation(Annotation[] anotations) {

		if (anotations.length > 0) {
			for (int indiceAnotations = 0; indiceAnotations < anotations.length; indiceAnotations++) {

				if (anotations[indiceAnotations].annotationType().getSimpleName().contains("Id")) {
					return true;
				}
			}
		}

		return false;
	}

}
