package ac4y.indicator.service.object.storno;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.ByIndicatorRequest;

@XmlRootElement
public class StornoAnalyticsByIndicatorRequest extends ByIndicatorRequest {
	
	public StornoAnalyticsByIndicatorRequest() {
		getAc4yIdentification().getTemplate().setGUID("StornoAnalyticsByPersistentIDRequest");
		//setAc4yIdentification(null);
	}

	public StornoAnalyticsByIndicatorRequest(
			String aIndicator) {
		
		super(aIndicator);
		
	}
	
}