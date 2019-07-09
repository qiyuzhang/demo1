/**
 * 
 */
package com.bw.bean;

/**
 * @作者 张玉琪
 *
 * @时间 /2019年7月9日
 */
public class Shop {
	private Integer sid;
	private String sname;
	private String sdate;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Shop [sid=" + sid + ", sname=" + sname + ", sdate=" + sdate + "]";
	}
	/**
	 * @param sid
	 * @param sname
	 * @param sdate
	 */
	public Shop(Integer sid, String sname, String sdate) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sdate = sdate;
	}
	/**
	 * 
	 */
	public Shop() {
		super();
	}
	/**
	 * @return the sid
	 */
	public Integer getSid() {
		return sid;
	}
	/**
	 * @param sid the sid to set
	 */
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	/**
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}
	/**
	 * @param sname the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}
	/**
	 * @return the sdate
	 */
	public String getSdate() {
		return sdate;
	}
	/**
	 * @param sdate the sdate to set
	 */
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	
	
}
