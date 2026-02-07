package ac4y.indicator.service.object.list.transfer;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.ByOriginRequest;

@XmlRootElement
public class GetOriginTransferListRequest extends ByOriginRequest {
	
	public GetOriginTransferListRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetOriginTransferListRequest");
		//setAc4yIdentification(null);
	}

	public GetOriginTransferListRequest(
			String aOrigin) {
		
		super(aOrigin);
		
	}
	
}