package ac4y.indicator.service.object.maintain;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceRequest;

@XmlRootElement
public class MaintainRequest extends Ac4yServiceRequest {
	
	public MaintainRequest() {
		getAc4yIdentification().getTemplate().setGUID("StornoAnalyticsByPersistentIDRequest");
		setAc4yIdentification(null);
	}

	public MaintainRequest(
			String aIndicator
			,Date aDate
			,float aPlus
			,float aMinus) {
		this(); 
		setIndicator(aIndicator);
		setDate(aDate);
		setPlus(aPlus);
		setMinus(aMinus);
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

	public float getPlus() {
		return credit;
	}

	public void setPlus(float credit) {
		this.credit = credit;
	}

	public float getMinus() {
		return debit;
	}

	public void setMinus(float debit) {
		this.debit = debit;
	}

	protected Date date;
	protected float credit;
	protected float debit;
	
}