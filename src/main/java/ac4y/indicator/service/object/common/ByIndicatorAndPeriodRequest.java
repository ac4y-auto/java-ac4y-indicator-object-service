package ac4y.indicator.service.object.common;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceRequest;

@XmlRootElement
public class ByIndicatorAndPeriodRequest extends Ac4yServiceRequest {
	
	public ByIndicatorAndPeriodRequest() {
		getAc4yIdentification().getTemplate().setGUID("ByIndicatorAndPeriodRequest");
		//setAc4yIdentification(null);
	}

	public ByIndicatorAndPeriodRequest(
			String aIndicator
			,Date aFrom
			,Date aTo) {
		this(); 
		setIndicator(aIndicator);
		setFrom(aFrom);
		setTo(aTo);
	}

	protected String indicator;

	public String getIndicator() {
		return indicator;
	}

	public void setIndicator(String indicator) {
		this.indicator = indicator;
	} 

	protected Date from;

	public Date getFrom() {
		return from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}
	
	protected Date to;

	public Date getTo() {
		return to;
	}

	public void setTo(Date to) {
		this.to = to;
	}
	
}