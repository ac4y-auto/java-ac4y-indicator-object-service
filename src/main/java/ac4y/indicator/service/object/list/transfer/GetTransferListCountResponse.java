package ac4y.indicator.service.object.list.transfer;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.CountResponse;

@XmlRootElement
public class GetTransferListCountResponse extends CountResponse {

	public GetTransferListCountResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetTransferListCountResponse");
		setAc4yIdentification(null);
	}

}
