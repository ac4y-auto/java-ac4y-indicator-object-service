package ac4y.indicator.service.object.analytics;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceRequest;

@XmlRootElement
public class AnalyticsRequest extends Ac4yServiceRequest {
	
	public AnalyticsRequest() {
		getAc4yIdentification().getTemplate().setGUID("AnalyticsRequest");
		setAc4yIdentification(null);
	}

	public AnalyticsRequest(
			String aIndicator
			,Date aDate
			,float aAmount
			,boolean aNegative
			,String aOrigin	) {
		this(); 
		setIndicator(aIndicator);
		setDate(aDate);
		setAmount(aAmount);
		setNegative(aNegative);
		setOrigin(aOrigin);
	}

	protected String indicator;

	public String getIndicator() {
		return indicator;
	}

	public void setIndicator(String indicator) {
		this.indicator = indicator;
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

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	protected float amount;
	protected boolean negative;
	
	public boolean isNegative() {
		return negative;
	}

	public void setNegative(boolean negative) {
		this.negative = negative;
	}

	protected String origin;
	
}