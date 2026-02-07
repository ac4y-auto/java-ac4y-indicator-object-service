package ac4y.indicator.service.object.storno;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class StornoTransferByHumanIDsResponse extends Ac4yServiceResponse {

	public StornoTransferByHumanIDsResponse() {
		getAc4yIdentification().getTemplate().setGUID("StornoTransferByHumanIDsResponse");
		setAc4yIdentification(null);
	}
	
}