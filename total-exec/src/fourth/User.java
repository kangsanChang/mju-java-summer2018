package fourth;

public class User {
	private String payType, uName;

	public String getPayType() {
		return payType;
	}

	public String getuName() {
		return uName;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public User(String uName, String payType) {
		this.payType = payType;
		this.uName = uName;
	}
	
}
