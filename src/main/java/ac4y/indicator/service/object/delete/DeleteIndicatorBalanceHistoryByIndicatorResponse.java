package ac4y.indicator.service.object.delete;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class DeleteIndicatorBalanceHistoryByIndicatorResponse extends Ac4yServiceResponse {

	public DeleteIndicatorBalanceHistoryByIndicatorResponse() {
		getAc4yIdentification().getTemplate().setGUID("DeleteIndicatorBalanceHistoryByIndicatorResponse");
		setAc4yIdentification(null);
	}
	
}