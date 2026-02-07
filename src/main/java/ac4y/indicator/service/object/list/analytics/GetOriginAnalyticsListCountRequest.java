package ac4y.indicator.service.object.list.analytics;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.ByOriginRequest;

@XmlRootElement
public class GetOriginAnalyticsListCountRequest extends ByOriginRequest {
	
	public GetOriginAnalyticsListCountRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetOriginAnalyticsListCountRequest");
		//setAc4yIdentification(null);
	}

	public GetOriginAnalyticsListCountRequest(
			String aOrigin) {
		
		super(aOrigin);
		
	}
	
}