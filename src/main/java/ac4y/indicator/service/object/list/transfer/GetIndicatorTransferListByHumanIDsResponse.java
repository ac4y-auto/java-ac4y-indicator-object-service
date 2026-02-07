package ac4y.indicator.service.object.list.transfer;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.IndicatorTransferListResponse;

@XmlRootElement
public class GetIndicatorTransferListByHumanIDsResponse extends IndicatorTransferListResponse {

	public GetIndicatorTransferListByHumanIDsResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetIndicatorTransferListByHumanIDsResponse");
		setAc4yIdentification(null);
	}

}
