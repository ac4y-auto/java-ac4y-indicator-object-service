package ac4y.indicator.service.object.delete;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class DeleteIndicatorBalanceHistoryByPersistentIDResponse extends Ac4yServiceResponse {

	public DeleteIndicatorBalanceHistoryByPersistentIDResponse() {
		getAc4yIdentification().getTemplate().setGUID("DeleteIndicatorBalanceHistoryByPersistentIDResponse");
		setAc4yIdentification(null);
	}
	
}