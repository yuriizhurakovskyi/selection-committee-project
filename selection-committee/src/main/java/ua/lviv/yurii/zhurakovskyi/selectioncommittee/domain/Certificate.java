package ua.lviv.yurii.zhurakovskyi.selectioncommittee.domain;

public class Certificate {
	private Integer id;
	private Integer applicantId;
	private String schoolName;
	private Integer score;

	public Certificate() {
	}

	public Certificate(String schoolName, Integer score, Integer entrantId) {
		this.schoolName = schoolName;
		this.score = score;
		this.applicantId = entrantId;
	}

	public Certificate(Integer id, String schoolName, Integer score, Integer entrantId) {
		this.id = id;
		this.schoolName = schoolName;
		this.score = score;
		this.applicantId = entrantId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getEntrantId() {
		return applicantId;
	}

	public void setEntrantId(Integer entrantId) {
		this.applicantId = entrantId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applicantId == null) ? 0 : applicantId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((schoolName == null) ? 0 : schoolName.hashCode());
		result = prime * result + ((score == null) ? 0 : score.hashCode());
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
		Certificate other = (Certificate) obj;
		if (applicantId == null) {
			if (other.applicantId != null)
				return false;
		} else if (!applicantId.equals(other.applicantId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (schoolName == null) {
			if (other.schoolName != null)
				return false;
		} else if (!schoolName.equals(other.schoolName))
			return false;
		if (score == null) {
			if (other.score != null)
				return false;
		} else if (!score.equals(other.score))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Certificate [id=" + id + ", schoolName=" + schoolName + ", entrantId=" + applicantId + ", score=" + score
				+ "]";
	}

}
