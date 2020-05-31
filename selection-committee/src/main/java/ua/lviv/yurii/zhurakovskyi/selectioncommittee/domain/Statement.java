package ua.lviv.yurii.zhurakovskyi.selectioncommittee.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "statement")
public class Statement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private Date date;
	@Column
	private Integer adminId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "faculty_id")
	private Faculty faculty;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "statement")
	private List<ApplicationInfo> applicationInfos;

	public Statement() {
	}

	public Statement(Date date, Integer adminId, Faculty faculty, List<ApplicationInfo> applicationInfos) {
		this.date = date;
		this.adminId = adminId;
		this.faculty = faculty;
		this.applicationInfos = applicationInfos;
	}

	public Statement(Integer id, Date date, Integer adminId, Faculty faculty, List<ApplicationInfo> applicationInfos) {
		this.id = id;
		this.date = date;
		this.adminId = adminId;
		this.faculty = faculty;
		this.applicationInfos = applicationInfos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adminId == null) ? 0 : adminId.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((faculty == null) ? 0 : faculty.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Statement other = (Statement) obj;
		if (adminId == null) {
			if (other.adminId != null)
				return false;
		} else if (!adminId.equals(other.adminId))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (faculty == null) {
			if (other.faculty != null)
				return false;
		} else if (!faculty.equals(other.faculty))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Statement [id=" + id + ", date=" + date + ", adminId=" + adminId + ", faculty=" + faculty
				+ ", applicationInfos=" + applicationInfos + "]";
	}

}
