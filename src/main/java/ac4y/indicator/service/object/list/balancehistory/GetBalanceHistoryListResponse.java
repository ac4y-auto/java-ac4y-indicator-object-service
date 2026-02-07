package ac4y.indicator.service.object.list.balancehistory;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.indicator.domain.Ac4yIndicatorBalanceHistoryList;
import ac4y.service.domain.Ac4yServiceResponse;

@XmlRootElement
public class GetBalanceHistoryListResponse extends Ac4yServiceResponse {

	public GetBalanceHistoryListResponse() {
		getAc4yIdentification().getTemplate().setGUID("GetBalanceHistoryListResponse");
		setAc4yIdentification(null);
	}

	protected Ac4yIndicatorBalanceHistoryList ac4yIndicatorBalanceHistoryList;

	public Ac4yIndicatorBalanceHistoryList getAc4yIndicatorBalanceHistoryList() {
		return ac4yIndicatorBalanceHistoryList;
	}

	public void setAc4yIndicatorBalanceHistoryList(Ac4yIndicatorBalanceHistoryList ac4yIndicatorBalanceHistoryList) {
		this.ac4yIndicatorBalanceHistoryList = ac4yIndicatorBalanceHistoryList;
	}

}
