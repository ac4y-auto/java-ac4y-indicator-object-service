package ac4y.indicator.service.object.delete;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.ByIndicatorRequest;

@XmlRootElement
public class DeleteIndicatorBalanceHistoryByIndicatorRequest extends ByIndicatorRequest {
	
	public DeleteIndicatorBalanceHistoryByIndicatorRequest() {
		getAc4yIdentification().getTemplate().setGUID("DeleteIndicatorBalanceHistoryByIndicatorRequest");
		//setAc4yIdentification(null);
	}

	public DeleteIndicatorBalanceHistoryByIndicatorRequest(
			String aIndicator) {
		
		super(aIndicator);
		
	}
	
}