package com.zcbspay.platform.cnaps.application.dao.pojo;
// default package
// Generated 2017-3-1 11:22:17 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TCnapsLog generated by hbm2java
 */
@Entity
@Table(name = "T_CNAPS_LOG", schema = "PDTT")
public class CnapsLogDO implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4079024438903417843L;
	private String msgid;
	private String syscode;
	private String msgtype;
	private String createdate;
	private String instructingdirectparty;
	private String instructingparty;
	private String instructeddirectparty;
	private String instructedparty;
	private String orgnlmsgid;
	private String orgnlinstgpty;
	private String originalmessagetype;
	private Integer totalnumber;
	private Integer startnumber;
	private Integer endnumber;
	private String queryreference;
	private String queryname;
	private String addinfo;
	private String notes;
	private String remarks;

	public CnapsLogDO() {
	}

	public CnapsLogDO(String msgid, String syscode, String msgtype,
			String createdate, String instructingdirectparty,
			String instructeddirectparty) {
		this.msgid = msgid;
		this.syscode = syscode;
		this.msgtype = msgtype;
		this.createdate = createdate;
		this.instructingdirectparty = instructingdirectparty;
		this.instructeddirectparty = instructeddirectparty;
	}

	public CnapsLogDO(String msgid, String syscode, String msgtype,
			String createdate, String instructingdirectparty,
			String instructingparty, String instructeddirectparty,
			String instructedparty, String orgnlmsgid, String orgnlinstgpty,
			String originalmessagetype, Integer totalnumber,
			Integer startnumber, Integer endnumber, String queryreference,
			String queryname, String addinfo, String notes, String remarks) {
		this.msgid = msgid;
		this.syscode = syscode;
		this.msgtype = msgtype;
		this.createdate = createdate;
		this.instructingdirectparty = instructingdirectparty;
		this.instructingparty = instructingparty;
		this.instructeddirectparty = instructeddirectparty;
		this.instructedparty = instructedparty;
		this.orgnlmsgid = orgnlmsgid;
		this.orgnlinstgpty = orgnlinstgpty;
		this.originalmessagetype = originalmessagetype;
		this.totalnumber = totalnumber;
		this.startnumber = startnumber;
		this.endnumber = endnumber;
		this.queryreference = queryreference;
		this.queryname = queryname;
		this.addinfo = addinfo;
		this.notes = notes;
		this.remarks = remarks;
	}

	@Id
	@Column(name = "MSGID", unique = true, nullable = false, length = 35)
	public String getMsgid() {
		return this.msgid;
	}

	public void setMsgid(String msgid) {
		this.msgid = msgid;
	}

	@Column(name = "SYSCODE", nullable = false, length = 4)
	public String getSyscode() {
		return this.syscode;
	}

	public void setSyscode(String syscode) {
		this.syscode = syscode;
	}

	@Column(name = "MSGTYPE", nullable = false, length = 3)
	public String getMsgtype() {
		return this.msgtype;
	}

	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}

	@Column(name = "CREATEDATE", nullable = false, length = 14)
	public String getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	@Column(name = "INSTRUCTINGDIRECTPARTY", nullable = false, length = 14)
	public String getInstructingdirectparty() {
		return this.instructingdirectparty;
	}

	public void setInstructingdirectparty(String instructingdirectparty) {
		this.instructingdirectparty = instructingdirectparty;
	}

	@Column(name = "INSTRUCTINGPARTY", length = 14)
	public String getInstructingparty() {
		return this.instructingparty;
	}

	public void setInstructingparty(String instructingparty) {
		this.instructingparty = instructingparty;
	}

	@Column(name = "INSTRUCTEDDIRECTPARTY", nullable = false, length = 14)
	public String getInstructeddirectparty() {
		return this.instructeddirectparty;
	}

	public void setInstructeddirectparty(String instructeddirectparty) {
		this.instructeddirectparty = instructeddirectparty;
	}

	@Column(name = "INSTRUCTEDPARTY", length = 14)
	public String getInstructedparty() {
		return this.instructedparty;
	}

	public void setInstructedparty(String instructedparty) {
		this.instructedparty = instructedparty;
	}

	@Column(name = "ORGNLMSGID", length = 35)
	public String getOrgnlmsgid() {
		return this.orgnlmsgid;
	}

	public void setOrgnlmsgid(String orgnlmsgid) {
		this.orgnlmsgid = orgnlmsgid;
	}

	@Column(name = "ORGNLINSTGPTY", length = 14)
	public String getOrgnlinstgpty() {
		return this.orgnlinstgpty;
	}

	public void setOrgnlinstgpty(String orgnlinstgpty) {
		this.orgnlinstgpty = orgnlinstgpty;
	}

	@Column(name = "ORIGINALMESSAGETYPE", length = 35)
	public String getOriginalmessagetype() {
		return this.originalmessagetype;
	}

	public void setOriginalmessagetype(String originalmessagetype) {
		this.originalmessagetype = originalmessagetype;
	}

	@Column(name = "TOTALNUMBER", precision = 8, scale = 0)
	public Integer getTotalnumber() {
		return this.totalnumber;
	}

	public void setTotalnumber(Integer totalnumber) {
		this.totalnumber = totalnumber;
	}

	@Column(name = "STARTNUMBER", precision = 8, scale = 0)
	public Integer getStartnumber() {
		return this.startnumber;
	}

	public void setStartnumber(Integer startnumber) {
		this.startnumber = startnumber;
	}

	@Column(name = "ENDNUMBER", precision = 8, scale = 0)
	public Integer getEndnumber() {
		return this.endnumber;
	}

	public void setEndnumber(Integer endnumber) {
		this.endnumber = endnumber;
	}

	@Column(name = "QUERYREFERENCE", length = 35)
	public String getQueryreference() {
		return this.queryreference;
	}

	public void setQueryreference(String queryreference) {
		this.queryreference = queryreference;
	}

	@Column(name = "QUERYNAME", length = 14)
	public String getQueryname() {
		return this.queryname;
	}

	public void setQueryname(String queryname) {
		this.queryname = queryname;
	}

	@Column(name = "ADDINFO", length = 512)
	public String getAddinfo() {
		return this.addinfo;
	}

	public void setAddinfo(String addinfo) {
		this.addinfo = addinfo;
	}

	@Column(name = "NOTES", length = 256)
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "REMARKS", length = 256)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}