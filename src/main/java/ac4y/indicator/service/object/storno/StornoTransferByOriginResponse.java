package ac4y.indicator.service.object.storno;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class StornoTransferByOriginResponse extends Ac4yServiceResponse {

	public StornoTransferByOriginResponse() {
		getAc4yIdentification().getTemplate().setGUID("StornoTransferByOriginResponse");
		setAc4yIdentification(null);
	}
	
}