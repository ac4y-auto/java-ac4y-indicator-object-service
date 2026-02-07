package ac4y.indicator.service.object.list.balancehistory;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceRequest;

@XmlRootElement
public class GetBalanceHistoryListRequest extends Ac4yServiceRequest {
	
	public GetBalanceHistoryListRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetBalanceHistoryListRequest");
		setAc4yIdentification(null);
	}

	public GetBalanceHistoryListRequest(String aWhere) {
		this(); 
		setWhere(aWhere);
	}

	protected String where;

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	} 
	
}
