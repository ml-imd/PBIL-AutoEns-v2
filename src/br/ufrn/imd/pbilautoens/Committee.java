package br.ufrn.imd.pbilautoens;

import java.util.List;

import com.google.gson.Gson;

import br.ufrn.imd.pbilautoens.enums.ClassifierType;
import br.ufrn.imd.pbilautoens.enums.CommitteeType;

public class Committee extends Classifier {

	private CommitteeType committeeType;
	private List<Classifier> classifiers;

	public Committee() {
		super();
		this.setClassifierType(ClassifierType.COMMITTEE);
	}

	public int numberOfBaseClassifiers() {
		return this.classifiers.size();
	}
	
	public CommitteeType getCommitteeType() {
		return committeeType;
	}

	public void setCommitteeType(CommitteeType committeeType) {
		this.committeeType = committeeType;
	}

	@Override
	public List<Classifier> getClassifiers() {
		return classifiers;
	}

	public void setClassifiers(List<Classifier> classifiers) {
		this.classifiers = classifiers;
	}

	@Override
	public void print() {
		Gson gson = new Gson();
		String a = gson.toJson(this, Committee.class);
		a = jsonFormatter(a);
		System.out.println(a);
	}

	@Override
	public String toString() {
		Gson gson = new Gson();
		String a = gson.toJson(this, Committee.class);
		a = jsonFormatter(a);
		return a;
	}

}
