package ac4y.indicator.service.object.storno;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class StornoTransferByIndicatorResponse extends Ac4yServiceResponse {

	public StornoTransferByIndicatorResponse() {
		getAc4yIdentification().getTemplate().setGUID("StornoTransferByIndicatorResponse");
		setAc4yIdentification(null);
	}
	
}