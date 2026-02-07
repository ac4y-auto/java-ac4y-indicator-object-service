package ac4y.indicator.service.object.storno;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.ByOriginRequest;

@XmlRootElement
public class StornoAnalyticsByOriginRequest extends ByOriginRequest {
	
	public StornoAnalyticsByOriginRequest() {
		getAc4yIdentification().getTemplate().setGUID("StornoAnalyticsByOriginRequest");
		//setAc4yIdentification(null);
	}

	public StornoAnalyticsByOriginRequest(
			String aOrigin) {
		
		super(aOrigin);
		
	}
	
}