package pojo_class;

public class employee {

	private int eid;
	private String ename;
	private int esal;
	private String dept;
	private int mob;
	
	public employee() {
		
	}

	public employee(int eid, String ename, int esal, String dept, int mob) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.dept = dept;
		this.mob = mob;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsal() {
		return esal;
	}

	public void setEsal(int esal) {
		this.esal = esal;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getMob() {
		return mob;
	}

	public void setMob(int mob) {
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", dept=" + dept + "]";
	}
	
	
	
}
