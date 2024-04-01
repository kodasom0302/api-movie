package com.javaex.vo;

public class MovieVo {
	
	private int mNo;
	private String mName;
	private String mTicketing;
	private int mPrice;
	private String mDate;
	private int mAccumulatedPoints;
	private String mRemarks;
	private String filePath;
	private String orgName;
	private String saveName;
	private long fileSize;
	
	public MovieVo() {
	}
	public MovieVo(String filePath, String orgName, String saveName, long fileSize) {
		this.filePath = filePath;
		this.orgName = orgName;
		this.saveName = saveName;
		this.fileSize = fileSize;
	}
	public MovieVo(int mNo, String mName, String mTicketing, int mPrice, String mDate, int mAccumulatedPoints,
			String mRemarks, String filePath, String orgName, String saveName, long fileSize) {
		this.mNo = mNo;
		this.mName = mName;
		this.mTicketing = mTicketing;
		this.mPrice = mPrice;
		this.mDate = mDate;
		this.mAccumulatedPoints = mAccumulatedPoints;
		this.mRemarks = mRemarks;
		this.filePath = filePath;
		this.orgName = orgName;
		this.saveName = saveName;
		this.fileSize = fileSize;
	}
	
	public int getmNo() {
		return mNo;
	}
	public void setmNo(int mNo) {
		this.mNo = mNo;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmTicketing() {
		return mTicketing;
	}
	public void setmTicketing(String mTicketing) {
		this.mTicketing = mTicketing;
	}
	public int getmPrice() {
		return mPrice;
	}
	public void setmPrice(int mPrice) {
		this.mPrice = mPrice;
	}
	public String getmDate() {
		return mDate;
	}
	public void setmDate(String mDate) {
		this.mDate = mDate;
	}
	public int getmAccumulatedPoints() {
		return mAccumulatedPoints;
	}
	public void setmAccumulatedPoints(int mAccumulatedPoints) {
		this.mAccumulatedPoints = mAccumulatedPoints;
	}
	public String getmRemarks() {
		return mRemarks;
	}
	public void setmRemarks(String mRemarks) {
		this.mRemarks = mRemarks;
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
	
	@Override
	public String toString() {
		return "MovieVo [mNo=" + mNo + ", mName=" + mName + ", mTicketing=" + mTicketing + ", mPrice=" + mPrice
				+ ", mDate=" + mDate + ", mAccumulatedPoints=" + mAccumulatedPoints + ", mRemarks=" + mRemarks
				+ ", filePath=" + filePath + ", orgName=" + orgName + ", saveName=" + saveName + ", fileSize="
				+ fileSize + "]";
	}

}
