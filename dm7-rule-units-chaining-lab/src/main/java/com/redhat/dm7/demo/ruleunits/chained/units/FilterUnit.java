package com.redhat.dm7.demo.ruleunits.chained.units;

import org.kie.api.runtime.rule.DataSource;
import org.kie.api.runtime.rule.RuleUnit;

import com.redhat.dm7.demo.ruleunits.chained.model.Person;

public class FilterUnit implements RuleUnit {
	
	private DataSource<Person> persons;

	public FilterUnit() {
	}
	
	public DataSource<Person> getPersons() {
		return persons;
	}

	public void setPersons(DataSource<Person> persons) {
		this.persons = persons;
	}
		
}
