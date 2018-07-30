/* 1. 순수한 데이터값 보유하게 되는 정형 구조
 * 2. table의 컬럼과 클래스의 멤버 변수들이 1:1 매핑
 * 3. class명명 규칙
 * 		- ~DTO.java/~VO.java/~Bean.java/~.java
 * 4. 개발 구조
 * 		멤버 변수 / 기본 생성자 / 멤버변수 초기화하는 일반 생성자 / 
 *     멤버변수 값 수정/값 반환(getXxx()/setXxx()) 메소드 /
 *     toString() 재정의 - 주로 모든 멤버 변수값을 문자열로 조합해서 반환 */
package model;

public class CrimeDTO {
	private int gender;  //남, 여
	long sum1;//10대의 범죄율
	long sum2;//20대의 범죄율
	long sum3;
	long sum4;
	long sum5;
	long sum6;
	long sum7;//70대 이상이상의 범죄률 
	
	public CrimeDTO() {}	
	public CrimeDTO(int gender, long sum1, long sum2, long sum3, long sum4, long sum5, long sum6, long sum7) {
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
	public long getSum6() {
		return sum6;
	}
	public void setSum6(long sum6) {
		this.sum6 = sum6;
	}
	public long getSum7() {
		return sum7;
	}
	public void setSum7(long sum7) {
		this.sum7 = sum7;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CrimeDTO [gender=");
		builder.append(gender);
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
		builder.append(", sum6=");
		builder.append(sum6);
		builder.append(", sum7=");
		builder.append(sum7);
		builder.append("]");
		return builder.toString();
	}
}














