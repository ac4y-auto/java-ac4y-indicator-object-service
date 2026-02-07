package ac4y.indicator.service.object.transfer;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.Ac4yIndicatorTransferResultResponse;

@XmlRootElement
public class TransferByHumanIDsResponse extends Ac4yIndicatorTransferResultResponse {

	public TransferByHumanIDsResponse() {
		getAc4yIdentification().getTemplate().setGUID("TransferByHumanIDsResponse");
		setAc4yIdentification(null);
	}
	
}
