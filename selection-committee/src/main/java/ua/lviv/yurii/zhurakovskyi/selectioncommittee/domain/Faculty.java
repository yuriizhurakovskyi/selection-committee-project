package ua.lviv.yurii.zhurakovskyi.selectioncommittee.domain;

import java.util.List;

public class Faculty {
	private Integer id;
	private String name;
	private Integer numberOfStudents;
	private List<Direction> directions;

	public Faculty() {
	}

	public Faculty(String name, Integer numberOfStudents, List<Direction> directions) {
		this.name = name;
		this.directions = directions;
		this.numberOfStudents = numberOfStudents;
	}

	public Faculty(Integer id, String name, Integer numberOfStudents, List<Direction> directions) {
		this.id = id;
		this.name = name;
		this.directions = directions;
		this.numberOfStudents = numberOfStudents;
	}

	public Integer getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(Integer numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Direction> getDirections() {
		return directions;
	}

	public void setDirections(List<Direction> directions) {
		this.directions = directions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((directions == null) ? 0 : directions.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((numberOfStudents == null) ? 0 : numberOfStudents.hashCode());
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
		Faculty other = (Faculty) obj;
		if (directions == null) {
			if (other.directions != null)
				return false;
		} else if (!directions.equals(other.directions))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfStudents == null) {
			if (other.numberOfStudents != null)
				return false;
		} else if (!numberOfStudents.equals(other.numberOfStudents))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", numberOfStudents=" + numberOfStudents + ", directions="
				+ directions + "]";
	}

}
