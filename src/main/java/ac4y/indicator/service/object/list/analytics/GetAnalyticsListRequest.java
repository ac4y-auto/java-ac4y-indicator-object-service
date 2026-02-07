package ac4y.indicator.service.object.list.analytics;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.WhereRequest;

@XmlRootElement
public class GetAnalyticsListRequest extends WhereRequest {
	
	public GetAnalyticsListRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetAnalyticsListRequest");
		//setAc4yIdentification(null);
	}

	public GetAnalyticsListRequest(String aWhere) {
		super(aWhere);
	}

}
