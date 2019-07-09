/**
 * 
 */
package com.bw.bean;

/**
 * @作者 张玉琪
 *
 * @时间 /2019年7月9日
 */
public class Goods {
	private Integer gid;
	private String gname;
	private Double price;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", price=" + price + "]";
	}
	/**
	 * @param gid
	 * @param gname
	 * @param price
	 */
	public Goods(Integer gid, String gname, Double price) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.price = price;
	}
	/**
	 * 
	 */
	public Goods() {
		super();
	}
	/**
	 * @return the gid
	 */
	public Integer getGid() {
		return gid;
	}
	/**
	 * @param gid the gid to set
	 */
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	/**
	 * @return the gname
	 */
	public String getGname() {
		return gname;
	}
	/**
	 * @param gname the gname to set
	 */
	public void setGname(String gname) {
		this.gname = gname;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
