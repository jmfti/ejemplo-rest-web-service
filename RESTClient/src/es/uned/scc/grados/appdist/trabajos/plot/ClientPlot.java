package es.uned.scc.grados.appdist.trabajos.plot;

import java.rmi.RemoteException;

import es.uned.scc.grados.appdist.trabajos.signal.model.data.SignalData;
import es.uned.scc.grados.appdist.trabajos.signal.model.data.SignalParameters;

public interface ClientPlot {
    boolean start() throws RemoteException;
    boolean stop() throws RemoteException;
    SignalData getSignalValue() throws RemoteException;
    public SignalParameters getSignalParameters() throws RemoteException;
    public void setSignalParameters(SignalParameters sp) throws RemoteException;
}