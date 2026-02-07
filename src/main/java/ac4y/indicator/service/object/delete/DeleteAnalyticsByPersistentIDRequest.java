package ac4y.indicator.service.object.delete;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.ByPersistentIDRequest;

@XmlRootElement
public class DeleteAnalyticsByPersistentIDRequest extends ByPersistentIDRequest {
	
	public DeleteAnalyticsByPersistentIDRequest() {
		getAc4yIdentification().getTemplate().setGUID("StornoAnalyticsByPersistentIDRequest");
		//setAc4yIdentification(null);
	}

	public DeleteAnalyticsByPersistentIDRequest(
			int aPersistentID) {
		
		super(aPersistentID);
		
	}
	
}