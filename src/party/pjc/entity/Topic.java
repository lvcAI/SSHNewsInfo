package party.pjc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="topic")
public class Topic {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="tid",length=10)
	private Integer tid;
	@Column(name="tname",length=20)
	private String tname;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	
	
}
