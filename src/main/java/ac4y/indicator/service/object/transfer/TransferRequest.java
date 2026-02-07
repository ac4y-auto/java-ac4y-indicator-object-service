package ac4y.indicator.service.object.transfer;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import ac4y.service.domain.Ac4yServiceRequest;

@XmlRootElement
public class TransferRequest extends Ac4yServiceRequest {
	
	public TransferRequest() {
		getAc4yIdentification().getTemplate().setGUID("TransferRequest");
		setAc4yIdentification(null);
	}

	public TransferRequest(
			String aPlus
			,String aMinus
			,Date aDate
			,float aAmount
			,String aOrigin	) {
		
		this(); 
		setPlus(aPlus);
		setMinus(aMinus);
		setDate(aDate);
		setAmount(aAmount);
		setOrigin(aOrigin);
	}

	public String getPlus() {
		return plus;
	}

	public void setPlus(String plus) {
		this.plus = plus;
	}

	public String getMinus() {
		return minus;
	}

	public void setMinus(String minus) {
		this.minus = minus;
	}

	protected String plus;
	protected String minus;

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
	protected String origin;
	
}