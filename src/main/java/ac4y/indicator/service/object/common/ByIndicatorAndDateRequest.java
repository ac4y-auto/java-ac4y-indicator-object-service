package ac4y.indicator.service.object.common;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceRequest;

@XmlRootElement
public class ByIndicatorAndDateRequest extends Ac4yServiceRequest {
	
	public ByIndicatorAndDateRequest() {
		getAc4yIdentification().getTemplate().setGUID("ByIndicatorAndDateRequest");
		//setAc4yIdentification(null);
	}

	public ByIndicatorAndDateRequest(
			String aIndicator
			,Date aDate) {
		this(); 
		setIndicator(aIndicator);
		setDate(aDate);
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
	
}