package it.eng.opsi.service.connector.adapter;

import java.util.ArrayList;

import it.eng.opsi.service.connector.beans.OutBean;


public interface Adapter {
	
	public abstract ArrayList<OutBean> adaptOut(Object body);
	public abstract Object adaptIn(Object body);
	

}
