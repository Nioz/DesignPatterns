package adapterPattern.src;

public class XpayToPayDAdapter implements Xpay {
	
	private final PayD payD;
	
	public XpayToPayDAdapter(){
		this.payD = new PayDImpl();
		payD.setCardExpMonthDate("MMYY");
	}
	
	
	
	@Override
	public String getCreditCardNo() {
		return payD.getCustCardNo();
	}

	@Override
	public String getCustomerName() {
		return payD.getCardOwnerName();
	}

	@Override
	public String getCardExpMonth() {
		return payD.getCardExpMonthDate().substring(0,2);
	}

	@Override
	public String getCardExpYear() {
		return payD.getCardExpMonthDate().substring(2,4);
	}

	@Override
	public Short getCardCVVNo() {
		return payD.getCVVNo().shortValue();
	}

	@Override
	public Double getAmount() {
		return payD.getTotalAmount();
	}

	@Override
	public void setCreditCardNo(String custCardNo) {
		payD.setCustCardNo(custCardNo);
	}

	@Override
	public void setCustomerName(String customerName) {
		payD.setCardOwnerName(customerName);
	}

	@Override
	public void setCardExpMonth(String cardExpMonth) {
		payD.setCardExpMonthDate(cardExpMonth);
	}

	@Override
	public void setCardExpYear(String cardExpYear) {
		payD.setCardExpMonthDate( getCardExpMonth().substring(0,2) + cardExpYear);
	}

	@Override
	public void setCardCVVNo(Short cardCVVNo) {
		payD.setCVVNo((int)(cardCVVNo));
	}

	@Override
	public void setAmount(Double amount) {
		payD.setTotalAmount(amount);
	}

}
