package ac4y.indicator.service.object.delete;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.service.object.common.ByHumanIdsRequest;
import ac4y.guid8humanid.service.object.common.HumanIds;

@XmlRootElement
public class DeleteAnalyticsByHumanIDsRequest extends ByHumanIdsRequest {
	
	public DeleteAnalyticsByHumanIDsRequest() {
		getAc4yIdentification().getTemplate().setGUID("StornoAnalyticsByHumanIDsRequest");
		setAc4yIdentification(null);
	}

	public DeleteAnalyticsByHumanIDsRequest(
			HumanIds aHumanIds
			) {
		super(aHumanIds);
	}
	
}