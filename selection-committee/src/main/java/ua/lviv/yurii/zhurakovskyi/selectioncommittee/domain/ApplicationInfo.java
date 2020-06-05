package ua.lviv.yurii.zhurakovskyi.selectioncommittee.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "application_info")
public class ApplicationInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "applicant_id")
	private User applicant;
	@ManyToMany
	private List<Subject> subjects;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "certificate_id")
	private Certificate certificate;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "direction_id")
	private Direction direction;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "statement_id")
	private Statement statement;

	public ApplicationInfo() {
	}

	public ApplicationInfo(User applicant, List<Subject> subjects, Certificate certificate, Direction direction,
			Statement statement) {
		this.applicant = applicant;
		this.subjects = subjects;
		this.certificate = certificate;
		this.direction = direction;
		this.statement = statement;
	}

	public ApplicationInfo(Integer id, User applicant, List<Subject> subjects, Certificate certificate,
			Direction direction, Statement statement) {
		this.id = id;
		this.applicant = applicant;
		this.subjects = subjects;
		this.certificate = certificate;
		this.direction = direction;
		this.statement = statement;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getApplicant() {
		return applicant;
	}

	public void setApplicant(User applicant) {
		this.applicant = applicant;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Statement getStatement() {
		return statement;
	}

	public void setStatement(Statement statement) {
		this.statement = statement;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applicant == null) ? 0 : applicant.hashCode());
		result = prime * result + ((certificate == null) ? 0 : certificate.hashCode());
		result = prime * result + ((direction == null) ? 0 : direction.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((statement == null) ? 0 : statement.hashCode());
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
		if (applicant == null) {
			if (other.applicant != null)
				return false;
		} else if (!applicant.equals(other.applicant))
			return false;
		if (certificate == null) {
			if (other.certificate != null)
				return false;
		} else if (!certificate.equals(other.certificate))
			return false;
		if (direction == null) {
			if (other.direction != null)
				return false;
		} else if (!direction.equals(other.direction))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (statement == null) {
			if (other.statement != null)
				return false;
		} else if (!statement.equals(other.statement))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ApplicationInfo [id=" + id + ", applicant=" + applicant + ", certificate=" + certificate
				+ ", direction=" + direction + ", statement=" + statement + "]";
	}

}
