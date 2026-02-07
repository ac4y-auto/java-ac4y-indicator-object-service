package ac4y.indicator.service.object.list.analytics;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.WhereRequest;

@XmlRootElement
public class GetAnalyticsListCountRequest extends WhereRequest {
	
	public GetAnalyticsListCountRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetTransferListCountRequest");
		//setAc4yIdentification(null);
	}

	public GetAnalyticsListCountRequest(String aWhere) {
		super(aWhere);
	}
	
}
