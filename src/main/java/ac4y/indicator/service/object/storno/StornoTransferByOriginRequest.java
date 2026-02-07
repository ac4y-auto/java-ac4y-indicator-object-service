package ac4y.indicator.service.object.storno;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.ByOriginRequest;

@XmlRootElement
public class StornoTransferByOriginRequest extends ByOriginRequest {
	
	public StornoTransferByOriginRequest() {
		getAc4yIdentification().getTemplate().setGUID("StornoTransferByOriginRequest");
		//setAc4yIdentification(null);
	}

	public StornoTransferByOriginRequest(
			String aOrigin) {
		
		super(aOrigin);
		
	}
	
}