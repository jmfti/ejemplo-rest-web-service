package es.uned.scc.grados.appdist.trabajos.plot;

import java.rmi.RemoteException;

import es.uned.scc.grados.appdist.trabajos.rest.RESTSignalGenerator;
import es.uned.scc.grados.appdist.trabajos.signal.model.data.SignalData;
import es.uned.scc.grados.appdist.trabajos.signal.model.data.SignalParameters;
import es.uned.scc.grados.appdist.trabajos.ws.SignalGeneratorWS;

public class PlottingFrame implements ClientPlot {

	private  RESTSignalGenerator ws;
	private ClientGUI frame;
	
	public PlottingFrame(RESTSignalGenerator tws){
		this.ws = tws;
		frame = new ClientGUI(this);
	}

	@Override
	public boolean start() throws RemoteException {
		return ws.start().isOk();
	}

	@Override
	public boolean stop() throws RemoteException {
		// TODO Auto-generated method stub
		return ws.stop().isOk();
	}

	@Override
	public SignalData getSignalValue() throws RemoteException {
		// TODO Auto-generated method stub
		return ws.getSignalValue();
	}

	@Override
	public SignalParameters getSignalParameters() throws RemoteException {
		// TODO Auto-generated method stub
		return ws.getSignalParameters();
	}

	@Override
	public void setSignalParameters(SignalParameters sp) throws RemoteException {
		// TODO Auto-generated method stub
		ws.setSignalParameters(sp);
	}
	
	public void show(){
        frame.getFrame().setVisible(true);
    }
	
}

