package br.ufrn.imd.pbilautoens;

import java.util.ArrayList;
import java.util.List;

import br.ufrn.imd.pbilautoens.enums.ParameterType;
import br.ufrn.imd.pbilautoens.exception.InvalidParameterTypeException;

public class ParameterPrototype {

	protected ParameterType type;
	private String name;
	private List<?> possibilities;

	public ParameterPrototype(String name, ParameterType parameterType) throws InvalidParameterTypeException {
		this.name = name;
		if (isCorrectParameterType(parameterType)) {
			this.type = parameterType;
			castPossibilities();
		} else {
			throw new InvalidParameterTypeException();
		}
	}
	
	public boolean isCorrectParameterType(ParameterType parameterType) {

		if (parameterType == ParameterType.BOOLEAN || parameterType == ParameterType.CHAR
				|| parameterType == ParameterType.DOUBLE || parameterType == ParameterType.INT
				|| parameterType == ParameterType.STRING) {
			return true;
		} else {
			return false;
		}
	}

	public void castPossibilities() {
		switch (this.type) {
			case BOOLEAN:
				this.setPossibilities(new ArrayList<Boolean>());
				break;
			case CHAR:
				this.setPossibilities(new ArrayList<String>());
				break;
			case DOUBLE:
				this.setPossibilities(new ArrayList<Double>());
				break;
			case INT:
				this.setPossibilities(new ArrayList<Integer>());
				break;
			case STRING:
				this.setPossibilities(new ArrayList<String>());
				break;
			default:
				break;
		}
	}
	
	public ParameterType getType() {
		return type;
	}
	
	public void setType(ParameterType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<?> getPossibilities() {
		return possibilities;
	}
	
	@Override
	public String toString() {
		return name+" :"+possibilities.toString();
	}
	
	public void setPossibilities(List<?> possibilities) {
		this.possibilities = possibilities;
	}
	
}
