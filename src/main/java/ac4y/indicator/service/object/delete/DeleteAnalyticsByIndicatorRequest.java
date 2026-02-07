package ac4y.indicator.service.object.delete;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.ByIndicatorRequest;

@XmlRootElement
public class DeleteAnalyticsByIndicatorRequest extends ByIndicatorRequest {
	
	public DeleteAnalyticsByIndicatorRequest() {
		getAc4yIdentification().getTemplate().setGUID("StornoAnalyticsByPersistentIDRequest");
		//setAc4yIdentification(null);
	}

	public DeleteAnalyticsByIndicatorRequest(
			String aIndicator) {
		
		super(aIndicator);
		
	}
	
}