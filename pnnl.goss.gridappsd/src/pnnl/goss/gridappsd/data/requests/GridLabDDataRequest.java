package pnnl.goss.gridappsd.data.requests;

import pnnl.goss.gridappsd.requests.DataRequest;

public class GridLabDDataRequest extends DataRequest {

	private static final long serialVersionUID = -5241895690628877860L;
	String line = null;
	String subGeographicalRegion = null;
	
	public GridLabDDataRequest(String line, String subGeographicalRegion) {
		this.line = line;
		this.subGeographicalRegion = subGeographicalRegion;
	}
	
	
	
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public String getSubGeographicalRegion() {
		return subGeographicalRegion;
	}
	public void setSubGeographicalRegion(String subGeographicalRegion) {
		this.subGeographicalRegion = subGeographicalRegion;
	}
	
	
}
