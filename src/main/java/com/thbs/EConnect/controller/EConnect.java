package com.thbs.EConnect.controller;



import java.util.Properties;

public class EConnect<T> {
	
	
	
	ProducerBuilder<T> producerbuilder;
	Properties defaultproperties= new Properties();
		
	public EConnect(){
		LoadProperties loadprop = new LoadProperties();
		defaultproperties = loadprop.configProperties();	
	}
	public ProducerBuilder<T> getProducerBuilder() {		
		this.producerbuilder = new ProducerBuilder<T>();
		return producerbuilder;
				
	}
	
	
	
	
	
	
}
