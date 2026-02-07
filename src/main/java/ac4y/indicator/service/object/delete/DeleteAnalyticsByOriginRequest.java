package ac4y.indicator.service.object.delete;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.ByOriginRequest;

@XmlRootElement
public class DeleteAnalyticsByOriginRequest extends ByOriginRequest {
	
	public DeleteAnalyticsByOriginRequest() {
		getAc4yIdentification().getTemplate().setGUID("StornoAnalyticsByOriginRequest");
		//setAc4yIdentification(null);
	}

	public DeleteAnalyticsByOriginRequest(
			String aOrigin) {
		
		super(aOrigin);
		
	}
	
}