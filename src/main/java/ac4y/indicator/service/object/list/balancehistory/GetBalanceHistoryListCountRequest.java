package ac4y.indicator.service.object.list.balancehistory;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.WhereRequest;

@XmlRootElement
public class GetBalanceHistoryListCountRequest extends WhereRequest {
	
	public GetBalanceHistoryListCountRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetTransferListCountRequest");
		//setAc4yIdentification(null);
	}

	public GetBalanceHistoryListCountRequest(String aWhere) {
		super(aWhere);
	}
	
}
