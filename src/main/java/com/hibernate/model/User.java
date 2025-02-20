package com.hibernate.model;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {

	@Id
	private int uid;
	private String uname;

	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private Collection<Laptop> laps = new ArrayList<Laptop>();

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Collection<Laptop> getLaps() {
		return laps;
	}

	public void setLaps(Collection<Laptop> laps) {
		this.laps = laps;
	}

//	@Override
//	public String toString() {
//		return "User [uid=" + uid + ", uname=" + uname + ", laps=" + laps + "]";
//	}
}
