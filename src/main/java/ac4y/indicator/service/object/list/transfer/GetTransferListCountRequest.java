package ac4y.indicator.service.object.list.transfer;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.WhereRequest;

@XmlRootElement
public class GetTransferListCountRequest extends WhereRequest {
	
	public GetTransferListCountRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetTransferListCountRequest");
		//setAc4yIdentification(null);
	}

	public GetTransferListCountRequest(String aWhere) {
		super(aWhere);
	}
	
}
