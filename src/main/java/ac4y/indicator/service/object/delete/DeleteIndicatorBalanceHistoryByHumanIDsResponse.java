package ac4y.indicator.service.object.delete;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class DeleteIndicatorBalanceHistoryByHumanIDsResponse extends Ac4yServiceResponse {

	public DeleteIndicatorBalanceHistoryByHumanIDsResponse() {
		getAc4yIdentification().getTemplate().setGUID("DeleteIndicatorBalanceHistoryByHumanIDsResponse");
		setAc4yIdentification(null);
	}
	
}