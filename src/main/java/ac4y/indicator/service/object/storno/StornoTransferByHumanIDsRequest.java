package ac4y.indicator.service.object.storno;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.service.object.common.ByHumanIdsRequest;
import ac4y.guid8humanid.service.object.common.HumanIds;

@XmlRootElement
public class StornoTransferByHumanIDsRequest extends ByHumanIdsRequest {
	
	public StornoTransferByHumanIDsRequest() {
		getAc4yIdentification().getTemplate().setGUID("StornoTransferByHumanIDsRequest");
		setAc4yIdentification(null);
	}

	public StornoTransferByHumanIDsRequest(
			HumanIds aHumanIds
			) {
		super(aHumanIds);
	}
	
}