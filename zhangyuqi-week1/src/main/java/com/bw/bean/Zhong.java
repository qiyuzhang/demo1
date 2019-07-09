/**
 * 
 */
package com.bw.bean;

/**
 * @作者 张玉琪
 *
 * @时间 /2019年7月9日
 */
public class Zhong {
	private Integer zid;
	private Integer sid;
	private Integer gid;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Zhong [zid=" + zid + ", sid=" + sid + ", gid=" + gid + "]";
	}
	/**
	 * @param zid
	 * @param sid
	 * @param gid
	 */
	public Zhong(Integer zid, Integer sid, Integer gid) {
		super();
		this.zid = zid;
		this.sid = sid;
		this.gid = gid;
	}
	/**
	 * 
	 */
	public Zhong() {
		super();
	}
	/**
	 * @return the zid
	 */
	public Integer getZid() {
		return zid;
	}
	/**
	 * @param zid the zid to set
	 */
	public void setZid(Integer zid) {
		this.zid = zid;
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
	
	
}
