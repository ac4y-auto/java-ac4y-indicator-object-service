package ac4y.indicator.service.object.delete;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.ByPersistentIDRequest;

@XmlRootElement
public class DeleteIndicatorBalanceHistoryByPersistentIDRequest extends ByPersistentIDRequest {
	
	public DeleteIndicatorBalanceHistoryByPersistentIDRequest() {
		getAc4yIdentification().getTemplate().setGUID("DeleteIndicatorBalanceHistoryByPersistentIDRequest");
		//setAc4yIdentification(null);
	}

	public DeleteIndicatorBalanceHistoryByPersistentIDRequest(
			int aPersistentID) {
		
		super(aPersistentID);
		
	}
	
}