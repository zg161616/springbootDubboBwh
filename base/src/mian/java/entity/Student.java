package entity;

import com.sun.istack.internal.NotNull;

import java.io.Serializable;

/**
 * 学生信息实体
 * @author Administrator
 *
 */
public class Student implements Serializable{
	private static final long serialVersionUID = -1L;

	private Integer id;
	private String name;
	
	private Integer age;

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
