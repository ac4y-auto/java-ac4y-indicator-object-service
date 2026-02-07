package ac4y.indicator.service.object.common;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.domain.OriginTransferList;
import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class OriginTransferListResponse extends Ac4yServiceResponse {

	public OriginTransferListResponse() {
		getAc4yIdentification().getTemplate().setGUID("OriginTransferListResponse");
		//setAc4yIdentification(null);
	}

	protected OriginTransferList originTransferList;

	public OriginTransferList getOriginTransferList() {
		return originTransferList;
	}

	public void setOriginTransferList(OriginTransferList originTransferList) {
		this.originTransferList = originTransferList;
	}

}
