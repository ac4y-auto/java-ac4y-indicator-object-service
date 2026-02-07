package ac4y.indicator.service.object.list.balancehistory;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.CountResponse;

@XmlRootElement
public class GetBalanceHistoryListCountResponse extends CountResponse {

	public GetBalanceHistoryListCountResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetTransferListCountResponse");
		setAc4yIdentification(null);
	}

}
