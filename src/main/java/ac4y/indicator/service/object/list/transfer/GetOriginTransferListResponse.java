package ac4y.indicator.service.object.list.transfer;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.service.object.common.OriginTransferListResponse;

@XmlRootElement
public class GetOriginTransferListResponse extends OriginTransferListResponse {

	public GetOriginTransferListResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetOriginTransferListResponse");
		setAc4yIdentification(null);
	}

}
