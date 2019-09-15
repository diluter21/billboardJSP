package com.diluter.pojo;

/*
id id
標題 title
發佈日期 releaseDate
截止日期 dueDate
公布內容 detail
附檔 Attachment
 */

public class Billboard {

	private int id;

	private String title ;
	private String releaseDate  ;
	private String dueDate ;
	private String detail  ;
	private String Attachment ;
	private String page;
	
	
	
	
	public Billboard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	



	public String getPage() {
		return page;
	}





	public void setPage(String page) {
		this.page = page;
	}





	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getAttachment() {
		return Attachment;
	}
	public void setAttachment(String attachment) {
		Attachment = attachment;
	}
	@Override
	public String toString() {
		return "Billboard [id=" + id + ", title=" + title + ", releaseDate=" + releaseDate + ", dueDate=" + dueDate
				+ ", detail=" + detail + ", Attachment=" + Attachment + "]";
	}
	
	
	
	
}
