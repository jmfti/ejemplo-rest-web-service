package es.uned.scc.grados.appdist.trabajos.plot;

import org.apache.cxf.jaxrs.client.JAXRSClientFactory;

import es.uned.scc.grados.appdist.trabajos.rest.RESTSignalGenerator;

public class RESTClient {

	public static void main(String[] args) {
		
		RESTSignalGenerator sg = JAXRSClientFactory.create("http://localhost:9018", RESTSignalGenerator.class);
		PlottingFrame pf = new PlottingFrame(sg);
		pf.show();
		// (1) remote GET call to http://bookstore.com/bookstore
		//System.out.println(sg.getSignalValue());
		
	}
}
