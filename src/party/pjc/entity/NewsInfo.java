package party.pjc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="newsinfo")
public class NewsInfo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="nid",length=10)
	private Integer nid;
	@Column(name="ntid",length=10)
	private Integer ntid;
	@Column(name="ntitle",length=20)
	private String ntitle;
	@Column(name="nauthor",length=50)
	private String nauthor;
	@Column(name="ncreatedate",length=20)
	private String ncreatedate;
	@Column(name="npicpath",length=100)
	private String npicpath;
	@Column(name="ncontent")
	private String ncontent;
	@Column(name="nmodifydate",length=20)
	private String nmodifydate;
	@Column(name="nsummary",length=50)
	private String nsummary;
	public Integer getNid() {
		return nid;
	}
	public void setNid(Integer nid) {
		this.nid = nid;
	}
	public Integer getNtid() {
		return ntid;
	}
	public void setNtid(Integer ntid) {
		this.ntid = ntid;
	}
	public String getNtitle() {
		return ntitle;
	}
	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}
	public String getNauthor() {
		return nauthor;
	}
	public void setNauthor(String nauthor) {
		this.nauthor = nauthor;
	}

	public String getNcreatedate() {
		return ncreatedate;
	}
	public void setNcreatedate(String ncreatedate) {
		this.ncreatedate = ncreatedate;
	}
	public String getNpicpath() {
		return npicpath;
	}
	public void setNpicpath(String npicpath) {
		this.npicpath = npicpath;
	}
	public String getNcontent() {
		return ncontent;
	}
	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}
	public String getNmodifydate() {
		return nmodifydate;
	}
	public void setNmodifydate(String nmodifydate) {
		this.nmodifydate = nmodifydate;
	}
	public String getNsummary() {
		return nsummary;
	}
	public void setNsummary(String nsummary) {
		this.nsummary = nsummary;
	}
	
	
}
