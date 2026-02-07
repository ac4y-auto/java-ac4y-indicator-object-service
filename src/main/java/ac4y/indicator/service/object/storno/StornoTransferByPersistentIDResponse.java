package ac4y.indicator.service.object.storno;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class StornoTransferByPersistentIDResponse extends Ac4yServiceResponse {

	public StornoTransferByPersistentIDResponse() {
		getAc4yIdentification().getTemplate().setGUID("StornoTransferByPersistentIDResponse");
		setAc4yIdentification(null);
	}
	
}