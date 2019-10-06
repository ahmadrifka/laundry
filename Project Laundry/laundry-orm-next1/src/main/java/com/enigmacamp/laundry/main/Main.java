package com.enigmacamp.laundry.main;

import java.sql.SQLException;
import java.util.List;

import com.enigmacamp.laundry.db.entities.Customers;
import com.enigmacamp.laundry.db.entities.LaundryItems;
import com.enigmacamp.laundry.db.entities.LaundryService;
import com.enimgacamp.laundry.db.repository.AdminRepository;
import com.enimgacamp.laundry.db.repository.CustomersRepository;
import com.enimgacamp.laundry.db.repository.LaundryItemsRepository;
import com.enimgacamp.laundry.db.repository.LaundryServiceRepository;
import com.enimgacamp.laundry.db.repository.TransaksiRepository;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		hibernateSample();
	}
	
	
	private static void hibernateSample() throws SQLException {
		System.out.println("PROJECT: laundry-orm-hibernate");
		CustomersRepository customRepo = new CustomersRepository();
		LaundryItemsRepository itemRepo = new LaundryItemsRepository();
		LaundryServiceRepository serviceRepo = new LaundryServiceRepository();
		TransaksiRepository transRepo = new TransaksiRepository();
		
		System.out.println("==================LIST COSTUMERS===========================");
		List<Customers> custom = customRepo.findAll();
		for (Customers ab : custom) {
			System.out.println(ab);
		}
		
		
		System.out.println("=====================ADD CUSTOMERS==============================");
	
		Customers surya =  new Customers();
		surya.setName("Rizal Abdi");
		surya.setAlamat("Jl.Tiger No. 8");
		surya.setTelepon("082561723312");
		
//		surya = customRepo.addCustom(surya);
//		System.out.println(surya);
		
		
		System.out.println("==========================LIST JENIS CUCIAN==========================");
		List<LaundryItems> jenis = itemRepo.findAll();
		for (LaundryItems ab : jenis ) {
			System.out.println(ab);
		}
		
		System.out.println("=========================ADD JENIS CUCIAN=============================");
		
		LaundryItems baju = new LaundryItems();
		baju.setJenisCucian("Paket perKilo");
		baju.setHargaCucian((double) 6000);
		
//		itemRepo.addItem(baju);
//		System.out.println(baju);
		
		System.out.println("========================LIST SERVICE==========================");
		List<LaundryService> services = serviceRepo.findAll();
		for (LaundryService ab : services ) {
			System.out.println(ab);
		}
		System.out.println("========================ADD SERVICE==================================");
		
		LaundryService service = new LaundryService();
		service.setName("Express");
		service.setHargaService((double) 12000);
		
//		serviceRepo.addService(service);
//		System.out.println(service);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
