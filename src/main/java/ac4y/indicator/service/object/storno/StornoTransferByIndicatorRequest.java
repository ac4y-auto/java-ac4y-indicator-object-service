package ac4y.indicator.service.object.storno;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.ByIndicatorRequest;

@XmlRootElement
public class StornoTransferByIndicatorRequest extends ByIndicatorRequest {
	
	public StornoTransferByIndicatorRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetIndicatorAnalyticsListRequest");
		//setAc4yIdentification(null);
	}

	public StornoTransferByIndicatorRequest(
			String aIndicator) {
		
		super(aIndicator);
		
	}
	
}