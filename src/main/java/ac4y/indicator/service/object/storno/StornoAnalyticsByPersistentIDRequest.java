package ac4y.indicator.service.object.storno;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.ByPersistentIDRequest;

@XmlRootElement
public class StornoAnalyticsByPersistentIDRequest extends ByPersistentIDRequest {
	
	public StornoAnalyticsByPersistentIDRequest() {
		getAc4yIdentification().getTemplate().setGUID("StornoAnalyticsByPersistentIDRequest");
		//setAc4yIdentification(null);
	}

	public StornoAnalyticsByPersistentIDRequest(
			int aPersistentID) {
		
		super(aPersistentID);
		
	}
	
}