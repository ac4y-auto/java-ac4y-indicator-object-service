package ac4y.indicator.service.object.common;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.domain.Ac4yIndicatorTransfer;
import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class Ac4yIndicatorTransferResultResponse extends Ac4yServiceResponse {

	public Ac4yIndicatorTransferResultResponse() {
		getAc4yIdentification().getTemplate().setGUID("Ac4yIndicatorTransferResultResponse");
		//setAc4yIdentification(null);
	}
	
	protected Ac4yIndicatorTransfer ac4yIndicatorTransfer;

	public Ac4yIndicatorTransfer getAc4yIndicatorTransfer() {
		return ac4yIndicatorTransfer;
	}

	public void setAc4yIndicatorTransfer(Ac4yIndicatorTransfer ac4yIndicatorTransfer) {
		this.ac4yIndicatorTransfer = ac4yIndicatorTransfer;
	}

	
}
