package com.example.demo.entity;
import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Student")
public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String name;
	private String lop;
	private int tuoi;
	public Student(int id, String name, String lop, int tuoi) {
		super();
		this.id = id;
		this.name = name;
		this.lop = lop;
		this.tuoi = tuoi;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
