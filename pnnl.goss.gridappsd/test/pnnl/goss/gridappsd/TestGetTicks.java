package pnnl.goss.gridappsd;

import java.io.Serializable;

import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;

import junit.framework.TestCase;
import pnnl.goss.core.Client;
import pnnl.goss.core.Client.PROTOCOL;
import pnnl.goss.core.ClientFactory;
import pnnl.goss.core.GossResponseEvent;
import pnnl.goss.core.client.ClientServiceFactory;
import pnnl.goss.gridappsd.utils.GridAppsDConstants;
import pnnl.goss.gridappsd.utils.RunCommandLine;

public class TestGetTicks {

	

	public static void main(String[] args){

		try {
			
			ClientFactory clientFactory = new ClientServiceFactory();
			
			Client client;
			
			//Step1: Create GOSS Client
			Credentials credentials = new UsernamePasswordCredentials(
					GridAppsDConstants.username, GridAppsDConstants.password);
			client = clientFactory.create(PROTOCOL.OPENWIRE, credentials);
			
			//Subscribe to bridge output
			client.subscribe("*", new GossResponseEvent() {
				
				@Override
				public void onMessage(Serializable response) {
					System.out.println("simulation output is: "+response);
					
				}
			});
			
			//Start fncs_goss_bridge.py
			//RunCommandLine.runCommand("python ./scripts/fncs_goss_bridge.py");
			
			 
			
			while (true){
				Thread.sleep(1000);
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
}
