package model;

public class CrimeTimeDTO {

	String timeInterval;
	long sum1;
	long sum2;
	long sum3;
	long sum4;
	long sum5;
	
	public CrimeTimeDTO() {}
	public CrimeTimeDTO( String timeInterval, long sum1, long sum2, long sum3, long sum4, long sum5) {
		this.timeInterval = timeInterval;
		this.sum1 = sum1;
		this.sum2 = sum2;
		this.sum3 = sum3;
		this.sum4 = sum4;
		this.sum5 = sum5;
	}

	public String getTimeInterval() {
		return timeInterval;
	}
	public void setTimeInterval(String timeInterval) {
		this.timeInterval = timeInterval;
	}
	public long getSum1() {
		return sum1;
	}
	public void setSum1(long sum1) {
		this.sum1 = sum1;
	}
	public long getSum2() {
		return sum2;
	}
	public void setSum2(long sum2) {
		this.sum2 = sum2;
	}
	public long getSum3() {
		return sum3;
	}
	public void setSum3(long sum3) {
		this.sum3 = sum3;
	}
	public long getSum4() {
		return sum4;
	}
	public void setSum4(long sum4) {
		this.sum4 = sum4;
	}
	public long getSum5() {
		return sum5;
	}
	public void setSum5(long sum5) {
		this.sum5 = sum5;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CrimeTimeDTO [timeInterval=");
		builder.append(timeInterval);
		builder.append(", sum1=");
		builder.append(sum1);
		builder.append(", sum2=");
		builder.append(sum2);
		builder.append(", sum3=");
		builder.append(sum3);
		builder.append(", sum4=");
		builder.append(sum4);
		builder.append(", sum5=");
		builder.append(sum5);
		builder.append("]");
		return builder.toString();
	}
}
