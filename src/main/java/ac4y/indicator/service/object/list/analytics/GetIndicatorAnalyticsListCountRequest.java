package ac4y.indicator.service.object.list.analytics;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.ByIndicatorRequest;

@XmlRootElement
public class GetIndicatorAnalyticsListCountRequest extends ByIndicatorRequest {
	
	public GetIndicatorAnalyticsListCountRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetIndicatorAnalyticsListCountRequest");
		//setAc4yIdentification(null);
	}

	public GetIndicatorAnalyticsListCountRequest(
			String aIndicator) {
		
		super(aIndicator);
		
	}
	
}