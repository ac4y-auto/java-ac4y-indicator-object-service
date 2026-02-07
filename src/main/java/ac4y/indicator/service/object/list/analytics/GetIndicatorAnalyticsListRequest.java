package ac4y.indicator.service.object.list.analytics;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.ByIndicatorRequest;

@XmlRootElement
public class GetIndicatorAnalyticsListRequest extends ByIndicatorRequest {
	
	public GetIndicatorAnalyticsListRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetIndicatorAnalyticsListRequest");
		//setAc4yIdentification(null);
	}

	public GetIndicatorAnalyticsListRequest(
			String aIndicator) {
		
		super(aIndicator);
		
	}
	
}