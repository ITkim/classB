package model.domain;

public class TrashDTO {
	
	public String getProvince() {
		return province;
	}
	
	private String province;
	private float bury;
	private float fire;
	private float rec;
	private float total;
	
	public TrashDTO() {
		super();
	}
	public TrashDTO(String province,
					float bury, float fire, float rec,
					float total) {
		super();
		this.province = province;
		this.bury = bury;
		this.fire = fire;
		this.rec = rec;
		this.total = total;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	public float getBury() {
		return bury;
	}
	public void setBury(float bury) {
		this.bury = bury;
	}
	public float getFire() {
		return fire;
	}
	public void setFire(float fire) {
		this.fire = fire;
	}
	public float getRec() {
		return rec;
	}
	public void setRec(float rec) {
		this.rec = rec;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
}
