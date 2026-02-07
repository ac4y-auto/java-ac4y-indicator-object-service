package ac4y.indicator.service.object.list.transfer;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.IndicatorTransferListResponse;

@XmlRootElement
public class GetIndicatorTransferListResponse extends IndicatorTransferListResponse {

	public GetIndicatorTransferListResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetIndicatorTransferListResponse");
		setAc4yIdentification(null);
	}

}
