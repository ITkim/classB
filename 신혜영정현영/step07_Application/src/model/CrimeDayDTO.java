package model;

public class CrimeDayDTO {
	String bigClassify;
	long sumOfSun;
	long sumOfMon;
	long sumOfTue;
	long sumOfWed;
	long sumOfThu;
	long sumOfFri;
	long sumOfSat;
	
	public CrimeDayDTO() {}
	public CrimeDayDTO(String bigClassify, long sumOfSun, long sumOfMon, long sumOfTue, long sumOfWed, long sumOfThu, long sumOfFri, long sumOfSat) {
		
		this.bigClassify = bigClassify;
		this.sumOfSun = sumOfSun;
		this.sumOfMon = sumOfMon;
		this.sumOfTue = sumOfTue;
		this.sumOfWed = sumOfWed;
		this.sumOfThu = sumOfThu;
		this.sumOfFri = sumOfFri;
		this.sumOfSat = sumOfSat;
	}
	public String getBigClassify() {
		return bigClassify;
	}
	public void setBigClassify(String bigClassify) {
		this.bigClassify = bigClassify;
	}
	public long getSumOfSun() {
		return sumOfSun;
	}
	public void setSumOfSun(long sumOfSun) {
		this.sumOfSun = sumOfSun;
	}
	public long getSumOfMon() {
		return sumOfMon;
	}
	public void setSumOfMon(long sumOfMon) {
		this.sumOfMon = sumOfMon;
	}
	public long getSumOfTue() {
		return sumOfTue;
	}
	public void setSumOfTue(long sumOfTue) {
		this.sumOfTue = sumOfTue;
	}
	public long getSumOfWed() {
		return sumOfWed;
	}
	public void setSumOfWed(long sumOfWed) {
		this.sumOfWed = sumOfWed;
	}
	public long getSumOfThu() {
		return sumOfThu;
	}
	public void setSumOfThu(long sumOfThu) {
		this.sumOfThu = sumOfThu;
	}
	public long getSumOfFri() {
		return sumOfFri;
	}
	public void setSumOfFri(long sumOfFri) {
		this.sumOfFri = sumOfFri;
	}
	public long getSumOfSat() {
		return sumOfSat;
	}
	public void setSumOfSat(long sumOfSat) {
		this.sumOfSat = sumOfSat;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CrimeDayDTO [bigClassify=");
		builder.append(bigClassify);
		builder.append(", sumOfSun=");
		builder.append(sumOfSun);
		builder.append(", sumOfMon=");
		builder.append(sumOfMon);
		builder.append(", sumOfTue=");
		builder.append(sumOfTue);
		builder.append(", sumOfWed=");
		builder.append(sumOfWed);
		builder.append(", sumOfThu=");
		builder.append(sumOfThu);
		builder.append(", sumOfFri=");
		builder.append(sumOfFri);
		builder.append(", sumOfSat=");
		builder.append(sumOfSat);
		builder.append("]");
		return builder.toString();
	}
}
