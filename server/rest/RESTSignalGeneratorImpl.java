package es.uned.scc.grados.appdist.trabajos.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import es.uned.scc.grados.appdist.trabajos.signal.model.SignalGenerator;
import es.uned.scc.grados.appdist.trabajos.signal.model.SignalGeneratorThread;
import es.uned.scc.grados.appdist.trabajos.signal.model.data.OperationInfo;
import es.uned.scc.grados.appdist.trabajos.signal.model.data.SignalData;
import es.uned.scc.grados.appdist.trabajos.signal.model.data.SignalParameters;


@Path("SignalGenerator")
public class RESTSignalGeneratorImpl implements RESTSignalGenerator {
	
	private SignalGeneratorThread sgt;
	
	public RESTSignalGeneratorImpl(){
		sgt = new SignalGeneratorThread(0.001);
	}

	@GET
	@Path("start")
	@Produces({"text/xml"})
	@Override
	public OperationInfo start() {
		// TODO Auto-generated method stub
		return sgt.start();
	}

	@GET
	@Path("stop")
	@Produces({"text/xml"})
	@Override
	public OperationInfo stop() {
		// TODO Auto-generated method stub
		return sgt.stop();
	}

	@GET
	@Path("isrunning")
	@Produces({"text/xml"})
	@Override
	public OperationInfo isRunning() {
		// TODO Auto-generated method stub
		return sgt.isThreadRunning();
	}

	@GET
	@Path("get")
	@Produces({"text/xml"})
	@Override
	public SignalData getSignalValue() {
		// TODO Auto-generated method stub
		return new SignalData(sgt.getSignalgenerator().getTime(), sgt.getSignalgenerator().getOutput());
	}

	@GET
	@Path("getParams")
	@Produces({"text/xml"})
	@Override
	public SignalParameters getSignalParameters() {
		// TODO Auto-generated method stub
		SignalGenerator sg = sgt.getSignalgenerator();
		SignalParameters sp = new SignalParameters(sg.getType(), sg.getAmplitude(), sg.getFrequency());
		return sp;
	}

	@POST
	@Path("setParams")
	@Produces({"text/xml"})
	@Override
	public void setSignalParameters(SignalParameters signal_parameters) {
		// TODO Auto-generated method stub
		sgt.getSignalgenerator().setAmplitude(signal_parameters.getAmplitude());
		sgt.getSignalgenerator().setFrequency(signal_parameters.getFrequency());
		sgt.getSignalgenerator().setSignalType(signal_parameters.getType());
	}

}
