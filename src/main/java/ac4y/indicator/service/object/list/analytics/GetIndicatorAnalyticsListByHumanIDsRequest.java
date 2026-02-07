package ac4y.indicator.service.object.list.analytics;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.service.object.common.ByHumanIdsRequest;
import ac4y.guid8humanid.service.object.common.HumanIds;

@XmlRootElement
public class GetIndicatorAnalyticsListByHumanIDsRequest extends ByHumanIdsRequest {
	
	public GetIndicatorAnalyticsListByHumanIDsRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetIndicatorAnalyticsListByHumanIDsRequest");
		//setAc4yIdentification(null);
	}

	public GetIndicatorAnalyticsListByHumanIDsRequest(
			HumanIds humanIds) {
		
		super(humanIds);
		
	}
	
}