package ac4y.indicator.service.object.list.analytics;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.ByOriginRequest;

@XmlRootElement
public class GetOriginAnalyticsListRequest extends ByOriginRequest {
	
	public GetOriginAnalyticsListRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetOriginAnalyticsListRequest");
		//setAc4yIdentification(null);
	}

	public GetOriginAnalyticsListRequest(
			String aOrigin) {
		
		super(aOrigin);
		
	}
	
}