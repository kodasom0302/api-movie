package com.javaex.vo;

public class MovieVo {

	private int m_no;
	private String m_name;
	private int m_price;
	private String filePath;
	private String orgName;
	private String saveName;
	private long fileSize;
	private String m_remarks;
	private int m_count;
	private int s_no;
	private String s_date;
	private int m_r_no;
	private String m_r_date;
	private int m_p_no;
	private String m_s_no;

	public MovieVo() {
	}

	public MovieVo(int m_no, String s_date) {
		this.m_no = m_no;
		this.s_date = s_date;
	}

	public MovieVo(int m_no, String m_name, String filePath, String orgName, String saveName, long fileSize) {
		this.m_no = m_no;
		this.m_name = m_name;
		this.filePath = filePath;
		this.orgName = orgName;
		this.saveName = saveName;
		this.fileSize = fileSize;
	}

	public MovieVo(int m_no, String m_name, int m_price, String filePath, String orgName, String saveName,
			long fileSize, String m_remarks, int m_count, int s_no, String s_date, int m_r_no, String m_r_date,
			int m_p_no, String m_s_no) {
		this.m_no = m_no;
		this.m_name = m_name;
		this.m_price = m_price;
		this.filePath = filePath;
		this.orgName = orgName;
		this.saveName = saveName;
		this.fileSize = fileSize;
		this.m_remarks = m_remarks;
		this.m_count = m_count;
		this.s_no = s_no;
		this.s_date = s_date;
		this.m_r_no = m_r_no;
		this.m_r_date = m_r_date;
		this.m_p_no = m_p_no;
		this.m_s_no = m_s_no;
	}

	public int getM_no() {
		return m_no;
	}

	public void setM_no(int m_no) {
		this.m_no = m_no;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public int getM_price() {
		return m_price;
	}

	public void setM_price(int m_price) {
		this.m_price = m_price;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getSaveName() {
		return saveName;
	}

	public void setSaveName(String saveName) {
		this.saveName = saveName;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public String getM_remarks() {
		return m_remarks;
	}

	public void setM_remarks(String m_remarks) {
		this.m_remarks = m_remarks;
	}

	public int getM_count() {
		return m_count;
	}

	public void setM_count(int m_count) {
		this.m_count = m_count;
	}

	public int getS_no() {
		return s_no;
	}

	public void setS_no(int s_no) {
		this.s_no = s_no;
	}

	public String getS_date() {
		return s_date;
	}

	public void setS_date(String s_date) {
		this.s_date = s_date;
	}

	public int getM_r_no() {
		return m_r_no;
	}

	public void setM_r_no(int m_r_no) {
		this.m_r_no = m_r_no;
	}

	public String getM_r_date() {
		return m_r_date;
	}

	public void setM_r_date(String m_r_date) {
		this.m_r_date = m_r_date;
	}

	public int getM_p_no() {
		return m_p_no;
	}

	public void setM_p_no(int m_p_no) {
		this.m_p_no = m_p_no;
	}

	public String getM_s_no() {
		return m_s_no;
	}

	public void setM_s_no(String m_s_no) {
		this.m_s_no = m_s_no;
	}

	@Override
	public String toString() {
		return "MovieVo [m_no=" + m_no + ", m_name=" + m_name + ", m_price=" + m_price + ", filePath=" + filePath
				+ ", orgName=" + orgName + ", saveName=" + saveName + ", fileSize=" + fileSize + ", m_remarks="
				+ m_remarks + ", m_count=" + m_count + ", s_no=" + s_no + ", s_date=" + s_date + ", m_r_no=" + m_r_no
				+ ", m_r_date=" + m_r_date + ", m_p_no=" + m_p_no + ", m_s_no=" + m_s_no + "]";
	}

}
