package model;

public class CrimeTimeDTO {
	
	String bigClassify;
	String timeName;
	Long sum;
	
	public CrimeTimeDTO(String bigClassify, String timeName,Long sum) {
	
		this.bigClassify = bigClassify;
		this.timeName = timeName;
		this.sum = sum;
	}
	
	
	public String getTimeName() {
		return timeName;
	}


	public void setTimeName(String timeName) {
		this.timeName = timeName;
	}


	public String getBigClassify() {
		return bigClassify;
	}
	public void setBigClassify(String bigClassify) {
		this.bigClassify = bigClassify;
	}
	public Long getSum() {
		return sum;
	}
	public void setSum(Long sum) {
		this.sum = sum;
	}
	
	
}
