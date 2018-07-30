package model;

public class CrimeDTO {
	int gender;
	Long sum1;
	Long sum2;
	Long sum3;
	Long sum4;
	Long sum5;
	Long sum6;
	Long sum7;
	
	
	public CrimeDTO(int gender, Long sum1, Long sum2,
					Long sum3, Long sum4, Long sum5, Long sum6, Long sum7) {
	
		this.gender = gender;
		this.sum1 = sum1;
		this.sum2 = sum2;
		this.sum3 = sum3;
		this.sum4 = sum4;
		this.sum5 = sum5;
		this.sum6 = sum6;
		this.sum7 = sum7;
	}

	public int getGender() {
		return gender;
	}


	public void setGender(int gender) {
		this.gender = gender;
	}


	public Long getSum1() {
		return sum1;
	}


	public void setSum1(Long sum1) {
		this.sum1 = sum1;
	}


	public Long getSum2() {
		return sum2;
	}


	public void setSum2(Long sum2) {
		this.sum2 = sum2;
	}


	public Long getSum3() {
		return sum3;
	}


	public void setSum3(Long sum3) {
		this.sum3 = sum3;
	}


	public Long getSum4() {
		return sum4;
	}


	public void setSum4(Long sum4) {
		this.sum4 = sum4;
	}


	public Long getSum5() {
		return sum5;
	}


	public void setSum5(Long sum5) {
		this.sum5 = sum5;
	}


	public Long getSum6() {
		return sum6;
	}


	public void setSum6(Long sum6) {
		this.sum6 = sum6;
	}


	public Long getSum7() {
		return sum7;
	}


	public void setSum7(Long sum7) {
		this.sum7 = sum7;
	}
	
	
	
}
