package ac4y.indicator.service.object.analytics;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.guid8humanid.service.object.common.ByHumanIdsRequest;
import ac4y.guid8humanid.service.object.common.HumanIds;

@XmlRootElement
public class AnalyticsByHumanIDsRequest extends ByHumanIdsRequest {
	
	public AnalyticsByHumanIDsRequest() {
		getAc4yIdentification().getTemplate().setGUID("AnalyticsByHumanIDsRequest");
		setAc4yIdentification(null);
	}

	public AnalyticsByHumanIDsRequest(
			HumanIds humanIds
			,Date aDate
			,float aAmount
			,boolean aMinusAmount
			,String aOrigin	) {
		
		super(humanIds);
		setDate(aDate);
		setAmount(aAmount);
		setMinusAmount(aMinusAmount);
		setOrigin(aOrigin);
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	protected Date date;
	
	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public boolean isMinusAmount() {
		return minusAmount;
	}

	public void setMinusAmount(boolean minusAmount) {
		this.minusAmount = minusAmount;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	protected float amount;
	protected boolean minusAmount;
	protected String origin;
	
	
}