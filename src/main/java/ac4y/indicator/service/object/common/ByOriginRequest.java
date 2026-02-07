package ac4y.indicator.service.object.common;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceRequest;

@XmlRootElement
public class ByOriginRequest extends Ac4yServiceRequest {
	
	public ByOriginRequest() {
		getAc4yIdentification().getTemplate().setGUID("ByOriginRequest");
		//setAc4yIdentification(null);
	}

	public ByOriginRequest(
			String aOrigin
			) {
		this(); 
		setOrigin(aOrigin);
	}

	protected String origin;

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

}