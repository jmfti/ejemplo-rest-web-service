package es.uned.scc.grados.appdist.trabajos.rest;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;



public class RESTServer {
	
	public RESTServer(){
		
	}

	public static void main(String[] args) {
		
		JAXRSServerFactoryBean sf = new JAXRSServerFactoryBean();
		sf.setResourceClasses(RESTSignalGeneratorImpl.class);
		sf.setResourceProvider(RESTSignalGeneratorImpl.class, 
				new SingletonResourceProvider( new RESTSignalGeneratorImpl()));
		sf.setAddress("http://localhost:9018/");
		sf.create();
	}
}
