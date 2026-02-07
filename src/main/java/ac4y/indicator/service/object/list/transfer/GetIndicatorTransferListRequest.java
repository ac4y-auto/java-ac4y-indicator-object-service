package ac4y.indicator.service.object.list.transfer;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.ByIndicatorRequest;

@XmlRootElement
public class GetIndicatorTransferListRequest extends ByIndicatorRequest {
	
	public GetIndicatorTransferListRequest() {
		getAc4yIdentification().getTemplate().setGUID("GetIndicatorTransferListRequest");
		//setAc4yIdentification(null);
	}

	public GetIndicatorTransferListRequest(
			String aIndicator) {
		
		super(aIndicator);
		
	}
	
}