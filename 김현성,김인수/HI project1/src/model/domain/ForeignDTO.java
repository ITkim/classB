package model.domain;

public class ForeignDTO {
	private String national; 
	private String gender;
	private String gend_total;
	private String  age4;
	private String  age9;
	private String  age14;
	private String  age19;
	private String  age24;
	private String  age29;
	private String  age34;
	private String  age39;
	private String  age44;
	private String  age49;
	private String  age54;
	private String  age59;
	private String  age60; 

	public ForeignDTO() {
		super();
	}
	public ForeignDTO( String national, String gender,
						 String gend_total, String  age4,
						 String  age9, String  age14,
						 String  age19, String  age24,
						 String  age29, String  age34,
						 String  age39, String  age44,
						 String  age49, String  age54,
						 String  age59, String  age60 ) {
		super();
		this.national = national;
		this.gender = gender;
		this.gend_total = gend_total;
		this.age4 = age4;
		this.age9 = age9;
		this.age14 = age14;
		this.age19 = age19;
		this.age24 = age24;
		this.age29 = age29;
		this.age34 = age34;
		this.age39 = age39;
		this.age44 = age44;
		this.age49 = age49;
		this.age54 = age54;
		this.age59 = age59;
		this.age60 = age60;	
	}	
	
	public String getNational() {
		return national;
	}

	public void setNational(String national) {
		this.national = national;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGend_total() {
		return gend_total;
	}

	public void setGend_total(String gend_total) {
		this.gend_total = gend_total;
	}

	public String getAge4() {
		return age4;
	}

	public void setAge4(String age4) {
		this.age4 = age4;
	}

	public String getAge9() {
		return age9;
	}

	public void setAge9(String age9) {
		this.age9 = age9;
	}

	public String getAge14() {
		return age14;
	}

	public void setAge14(String age14) {
		this.age14 = age14;
	}

	public String getAge19() {
		return age19;
	}

	public void setAge19(String age19) {
		this.age19 = age19;
	}

	public String getAge24() {
		return age24;
	}

	public void setAge24(String age24) {
		this.age24 = age24;
	}

	public String getAge29() {
		return age29;
	}

	public void setAge29(String age29) {
		this.age29 = age29;
	}

	public String getAge34() {
		return age34;
	}

	public void setAge34(String age34) {
		this.age34 = age34;
	}

	public String getAge39() {
		return age39;
	}

	public void setAge39(String age39) {
		this.age39 = age39;
	}

	public String getAge44() {
		return age44;
	}

	public void setAge44(String age44) {
		this.age44 = age44;
	}

	public String getAge49() {
		return age49;
	}

	public void setAge49(String age49) {
		this.age49 = age49;
	}

	public String getAge54() {
		return age54;
	}

	public void setAge54(String age54) {
		this.age54 = age54;
	}

	public String getAge59() {
		return age59;
	}

	public void setAge59(String age59) {
		this.age59 = age59;
	}

	public String getAge60() {
		return age60;
	}

	public void setAge60(String age60) {
		this.age60 = age60;
	}



}
