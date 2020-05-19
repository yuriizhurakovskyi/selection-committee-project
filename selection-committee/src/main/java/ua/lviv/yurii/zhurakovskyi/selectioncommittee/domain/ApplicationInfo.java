package ua.lviv.yurii.zhurakovskyi.selectioncommittee.domain;

import java.util.List;

public class ApplicationInfo {
	private Integer id;
	private Integer applicantId;
	private List<Subject> subjects;
	private Integer certificateId;
	private Integer directionId;

	public ApplicationInfo() {
	}

	public ApplicationInfo(Integer applicantId, List<Subject> subjects, Integer certificateId, Integer directionId) {
		this.applicantId = applicantId;
		this.subjects = subjects;
		this.certificateId = certificateId;
		this.directionId = directionId;
	}

	public ApplicationInfo(Integer id, Integer applicantId, List<Subject> subjects, Integer certificateId,
			Integer directionId) {
		this.id = id;
		this.applicantId = applicantId;
		this.subjects = subjects;
		this.certificateId = certificateId;
		this.directionId = directionId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(Integer applicantId) {
		this.applicantId = applicantId;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public Integer getCertificateId() {
		return certificateId;
	}

	public void setCertificateId(Integer certificateId) {
		this.certificateId = certificateId;
	}

	public Integer getDirectionId() {
		return directionId;
	}

	public void setDirectionId(Integer directionId) {
		this.directionId = directionId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applicantId == null) ? 0 : applicantId.hashCode());
		result = prime * result + ((certificateId == null) ? 0 : certificateId.hashCode());
		result = prime * result + ((directionId == null) ? 0 : directionId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((subjects == null) ? 0 : subjects.hashCode());
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
		ApplicationInfo other = (ApplicationInfo) obj;
		if (applicantId == null) {
			if (other.applicantId != null)
				return false;
		} else if (!applicantId.equals(other.applicantId))
			return false;
		if (certificateId == null) {
			if (other.certificateId != null)
				return false;
		} else if (!certificateId.equals(other.certificateId))
			return false;
		if (directionId == null) {
			if (other.directionId != null)
				return false;
		} else if (!directionId.equals(other.directionId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (subjects == null) {
			if (other.subjects != null)
				return false;
		} else if (!subjects.equals(other.subjects))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ApplicationInfo [id=" + id + ", applicantId=" + applicantId + ", subjects=" + subjects
				+ ", certificateId=" + certificateId + ", directionId=" + directionId + "]";
	}

}
