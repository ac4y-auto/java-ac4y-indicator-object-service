package ac4y.indicator.service.object.delete;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.service.object.common.ByHumanIdsRequest;
import ac4y.guid8humanid.service.object.common.HumanIds;

@XmlRootElement
public class DeleteIndicatorBalanceHistoryByHumanIDsRequest extends ByHumanIdsRequest {
	
	public DeleteIndicatorBalanceHistoryByHumanIDsRequest() {
		getAc4yIdentification().getTemplate().setGUID("DeleteIndicatorBalanceHistoryByHumanIDsRequest");
		setAc4yIdentification(null);
	}

	public DeleteIndicatorBalanceHistoryByHumanIDsRequest(
			HumanIds aHumanIds
			) {
		super(aHumanIds);
	}
	
}