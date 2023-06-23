package it.eng.opsi.service.connector.adapter;

import java.io.IOException;
import java.util.ArrayList;

import it.eng.opsi.service.connector.beans.OutBean;


public interface Adapter {
	
	public abstract ArrayList<OutBean> adaptOut(Object body) throws IOException, InterruptedException;
	public abstract Object adaptIn(Object body);
	

}
