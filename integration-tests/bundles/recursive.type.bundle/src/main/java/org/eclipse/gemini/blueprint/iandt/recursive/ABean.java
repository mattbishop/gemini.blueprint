package org.eclipse.gemini.blueprint.iandt.recursive;

public class ABean {


	public ABean(RecursiveGenericType<?> argument) {
		System.out.println("Loaded the generic argument:" + argument);
	}
}
