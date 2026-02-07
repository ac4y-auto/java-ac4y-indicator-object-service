package ac4y.indicator.service.object.list.transfer;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.domain.Ac4yIndicatorTransferList;
import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class GetTransferListResponse extends Ac4yServiceResponse {

	public GetTransferListResponse() {
		getAc4yIdentification().getTemplate().setGUID("IndicatorAnalyticsListResponse");
		setAc4yIdentification(null);
	}

	protected Ac4yIndicatorTransferList ac4yIndicatorTransferList;

	public Ac4yIndicatorTransferList getAc4yIndicatorTransferList() {
		return ac4yIndicatorTransferList;
	}

	public void setAc4yIndicatorTransferList(Ac4yIndicatorTransferList ac4yIndicatorTransferList) {
		this.ac4yIndicatorTransferList = ac4yIndicatorTransferList;
	}

}
