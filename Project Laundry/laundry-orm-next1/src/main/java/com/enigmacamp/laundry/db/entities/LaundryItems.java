package com.enigmacamp.laundry.db.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "laundry_items")
public class LaundryItems {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column (name = "jenis_cucian")
	private String jenisCucian;
	
	@Column (name = "harga_cuci_item")
	private Double hargaItemCucian;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Transaksi> transaksiService;
	
	@ManyToMany(mappedBy = "laundryItems")
	private List<Transaksi> transaksiItem;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getJenisCucian() {
		return jenisCucian;
	}
	public void setJenisCucian(String jenisCucian) {
		this.jenisCucian = jenisCucian;
	}
	public Double getHargaCucian() {
		return hargaItemCucian;
	}
	public void setHargaCucian(Double hargaCucian) {
		this.hargaItemCucian = hargaCucian;
	}
	
	@Override
	public String toString() {
		return "LaundryItems [id=" + id + ", jenisCucian=" + jenisCucian
				+ ", hargaItemCucian=" + hargaItemCucian + "]";
	}
	
	

}
