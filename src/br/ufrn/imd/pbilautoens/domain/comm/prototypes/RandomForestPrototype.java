package br.ufrn.imd.pbilautoens.domain.comm.prototypes;

import br.ufrn.imd.pbilautoens.ParameterPrototype;
import br.ufrn.imd.pbilautoens.enums.ParameterType;
import br.ufrn.imd.pbilautoens.exception.InvalidParameterTypeException;

public class RandomForestPrototype extends CommitteePrototype{
	public RandomForestPrototype() throws InvalidParameterTypeException {
		ParameterPrototype i = new ParameterPrototype("I", ParameterType.INT);
		i = buildIntParamete(2, 256, 1, i);
		parameters.put(i.getName(), i);
	
		ParameterPrototype k = new ParameterPrototype("K", ParameterType.INT);
		k = buildIntParamete(1, 32, 1, k);
		parameters.put(k.getName(), k);
		
		ParameterPrototype w = new ParameterPrototype("W", ParameterType.INT);
		w = buildIntParamete(1, 20, 1, w);
		parameters.put(w.getName(), w);
		
		this.setNumberOfBranchClassifiers(1);
	}
}
