package ua.lviv.yurii.zhurakovskyi.selectioncommittee.domain;

import java.util.Date;
import java.util.List;

public class Statement {
	private Integer id;
	private Date date;
	private Integer adminId;
	private Integer facultyId;
	private List<ApplicationInfo> applicationInfos;

	public Statement() {
	}

	public Statement(Date date, Integer adminId, Integer facultyId, List<ApplicationInfo> entrantStatement) {
		this.date = date;
		this.adminId = adminId;
		this.facultyId = facultyId;
		this.applicationInfos = entrantStatement;
	}

	public Statement(Integer id, Date date, Integer adminId, Integer facultyId,
			List<ApplicationInfo> entrantStatement) {
		this.id = id;
		this.date = date;
		this.adminId = adminId;
		this.facultyId = facultyId;
		this.applicationInfos = entrantStatement;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public Integer getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(Integer facultyId) {
		this.facultyId = facultyId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public List<ApplicationInfo> getApplicationInfos() {
		return applicationInfos;
	}

	public void setApplicationInfos(List<ApplicationInfo> applicationInfos) {
		this.applicationInfos = applicationInfos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adminId == null) ? 0 : adminId.hashCode());
		result = prime * result + ((applicationInfos == null) ? 0 : applicationInfos.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((facultyId == null) ? 0 : facultyId.hashCode());
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
		if (applicationInfos == null) {
			if (other.applicationInfos != null)
				return false;
		} else if (!applicationInfos.equals(other.applicationInfos))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (facultyId == null) {
			if (other.facultyId != null)
				return false;
		} else if (!facultyId.equals(other.facultyId))
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
		return "Statement [id=" + id + ", date=" + date + ", adminId=" + adminId + ", facultyId=" + facultyId
				+ ", applicationInfos=" + applicationInfos + "]";
	}

}
