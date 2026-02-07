package ac4y.indicator.service.object.storno;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.ByPersistentIDRequest;

@XmlRootElement
public class StornoTransferByPersistentIDRequest extends ByPersistentIDRequest {
	
	public StornoTransferByPersistentIDRequest() {
		getAc4yIdentification().getTemplate().setGUID("StornoTransferByPersistentIDRequest");
		//setAc4yIdentification(null);
	}

	public StornoTransferByPersistentIDRequest(
			int aPersistentID) {
		
		super(aPersistentID);
		
	}
	
}