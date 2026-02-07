package ac4y.indicator.service.object.list.transfer;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.WhereRequest;

@XmlRootElement
public class GetTransferListRequest extends WhereRequest {
	
	public GetTransferListRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetTransferListRequest");
		//setAc4yIdentification(null);
	}

	public GetTransferListRequest(String aWhere) {
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
