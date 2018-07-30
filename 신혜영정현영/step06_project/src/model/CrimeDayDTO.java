package model;

public class CrimeDayDTO {
	String bigClassify;
	String dayName;
	Long sum;
	
	public CrimeDayDTO(String bigClassify, String dayName, Long sum) {
		
		this.bigClassify = bigClassify;
		this.dayName = dayName;
		this.sum = sum;
	}

	public String getBigClassify() {
		return bigClassify;
	}

	public void setBigClassify(String bigClassify) {
		this.bigClassify = bigClassify;
	}

	public String getDayName() {
		return dayName;
	}

	public void setDayName(String dayName) {
		this.dayName = dayName;
	}

	public Long getSum() {
		return sum;
	}

	public void setSum(Long sum) {
		this.sum = sum;
	}

	
}
