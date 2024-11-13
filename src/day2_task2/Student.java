package day2_task2;

public class Student {
	private int sid;
	private String sname;
	private String dept;
	private int mob;
	private int gyear;
	
	
	public void setSid(int sid)
	{
		this.sid=sid;
		
	}
	
	public void setSname(String sname)
	{
		this.sname=sname;
	}
	
	public void setDept(String dept)
	{
		this.dept=dept;
	}
	
	public void setMob(int mob)
	{
		this.mob=mob;
	}
	
	public void setGyear(int gyear)
	{
		this.gyear=gyear;
	}
	
	public int getSid()
	{
		return this.sid;
	}
	
	public int getMob()
	{
		return this.mob;
	}
	
	public int getGyear()
	{
		return this.gyear;
	}
	
	public String getSname()
	{
		return this.sname;
	}
	
	public String getDept()
	{
		return this.dept;
	}
	
	public String toString()
	{
		return "sid:"+sid+" name:"+sname+" dept:"+dept;
	}
}
