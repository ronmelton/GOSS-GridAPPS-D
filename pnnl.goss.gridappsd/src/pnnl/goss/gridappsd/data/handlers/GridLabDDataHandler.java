package pnnl.goss.gridappsd.data.handlers;

import java.util.HashMap;
import java.util.Map;

import pnnl.goss.core.DataError;
import pnnl.goss.core.DataResponse;
import pnnl.goss.core.Request;
import pnnl.goss.core.Response;
import pnnl.goss.core.security.AuthorizationHandler;
import pnnl.goss.core.security.AuthorizeAll;
import pnnl.goss.core.server.RequestHandler;
import pnnl.goss.gridappsd.data.requests.GridLabDDataRequest;

public class GridLabDDataHandler implements RequestHandler {

	public static void main(String[] args) {
		GridLabDDataRequest req = new GridLabDDataRequest("ieee8500","ieee8500_SubRegion");
		new GridLabDDataHandler().handle(req);
	}

	@Override
	public Map<Class<? extends Request>, Class<? extends AuthorizationHandler>> getHandles() {
		Map<Class<? extends Request>, Class<? extends AuthorizationHandler>> handles = new HashMap<Class<? extends Request>, Class<? extends AuthorizationHandler>>();
		handles.put(GridLabDDataRequest.class, AuthorizeAll.class);
		return handles;
	}

	@Override
	public Response handle(Request request) {
		//TODO check content in the request for validity
		if(!(request instanceof GridLabDDataRequest)){
			return new DataResponse(new DataError(
					"Invalid request type specified!"));
		}
		
		
		GridLabDDataRequest dataRequest = (GridLabDDataRequest)request;
		
		//[SubGeographicalRegion_name = "
		//+ SubGeographicalRegion_name + ", GeographicalRegion_name = "
		// + GeographicalRegion_name + ", Line_name = " + Line_name + "]
		//TODO parse data request string??? for line and sub region name or just get them out of request object
		
		//call sql to cim
		
		//call cim to glm
		
		//return glm file path  (base? or busxy?)
		
		
		String responsePath = "";
		return new DataResponse(responsePath);
	}

}
