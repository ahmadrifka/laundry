package com.enigmacamp.laundry.db.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "customers")
public class Customers {

	@Id()
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column (name = "nama")
	private String name;
	
	@Column
	private String alamat;
	
	@Column(name = "telepon")
	private String telepon;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Transaksi> listTransaksi;
		
	
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
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	
	public String getTelepon() {
		return telepon;
	}
	public void setTelepon(String telepon) {
		this.telepon = telepon;
	}
	
	@Override
	public String toString() {
		return "Customers [id=" + id + ", name=" + name + ", alamat=" + alamat + ", telepon=" + telepon + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
