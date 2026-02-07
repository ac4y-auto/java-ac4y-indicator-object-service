package ac4y.indicator.service.object.transfer;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.Ac4yIndicatorTransferResultResponse;

@XmlRootElement
public class TransferResponse extends Ac4yIndicatorTransferResultResponse {

	public TransferResponse() {
		getAc4yIdentification().getTemplate().setGUID("TransferResponse");
		setAc4yIdentification(null);
	}
	
}