package fr.retromon.generator; 

import fr.retromon.generator.values.Types;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author theo
 */
public class MethodSignature {
	
	private final String accessibility;
	private final String returnType;
	private final String methodName;
	private final Map<String, Types> parameters;
	
	public MethodSignature(String stringMethodSignature) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public String getAccessibility() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public String getReturnType() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public String getMethodName() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public Map<String, Types> getParameters() {
		return this.parameters;
	}

}
