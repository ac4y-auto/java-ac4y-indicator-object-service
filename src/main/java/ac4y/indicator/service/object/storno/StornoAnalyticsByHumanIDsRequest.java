package ac4y.indicator.service.object.storno;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.service.object.common.ByHumanIdsRequest;
import ac4y.guid8humanid.service.object.common.HumanIds;

@XmlRootElement
public class StornoAnalyticsByHumanIDsRequest extends ByHumanIdsRequest {
	
	public StornoAnalyticsByHumanIDsRequest() {
		getAc4yIdentification().getTemplate().setGUID("StornoAnalyticsByHumanIDsRequest");
		setAc4yIdentification(null);
	}

	public StornoAnalyticsByHumanIDsRequest(
			HumanIds aHumanIds
			) {
		super(aHumanIds);
	}
	
}