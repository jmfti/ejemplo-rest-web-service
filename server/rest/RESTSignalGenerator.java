package es.uned.scc.grados.appdist.trabajos.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import es.uned.scc.grados.appdist.trabajos.signal.model.data.*;


@Path("SignalGenerator")
public interface RESTSignalGenerator {

	@GET
	@Path("start")
	@Produces({"text/xml"})
	public OperationInfo start();
	
	@GET
	@Path("stop")
	@Produces({"text/xml"})
	public OperationInfo stop();
	
	@GET
	@Path("isrunning")
	@Produces({"text/xml"})
	public OperationInfo isRunning();
	
	@GET
	@Path("get")
	@Produces({"text/xml"})
	public SignalData getSignalValue();
	
	@GET
	@Path("getParams")
	@Produces({"text/xml"})
	public SignalParameters getSignalParameters();
	
	@POST
	@Path("setParams")
	@Produces({"text/xml"})
	public void setSignalParameters(SignalParameters signal_parameters);
}
