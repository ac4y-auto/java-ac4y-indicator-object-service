package ac4y.indicator.service.object.list.transfer;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.service.object.common.ByHumanIdsRequest;
import ac4y.guid8humanid.service.object.common.HumanIds;

@XmlRootElement
public class GetIndicatorTransferListByHumanIDsRequest extends ByHumanIdsRequest {
	
	public GetIndicatorTransferListByHumanIDsRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetIndicatorTransferListByHumanIDsRequest");
		//setAc4yIdentification(null);
	}

	public GetIndicatorTransferListByHumanIDsRequest(
			HumanIds humanIds) {
		
		super(humanIds);
		
	}
	
}