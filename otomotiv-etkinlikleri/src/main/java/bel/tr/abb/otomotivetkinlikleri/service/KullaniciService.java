package bel.tr.abb.otomotivetkinlikleri.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import bel.tr.abb.otomotivetkinlikleri.entity.Kullanici;

public interface KullaniciService {
	
	Kullanici save(Kullanici kullanici);
	
	Kullanici getByID(Long id);
	
	Page<Kullanici> getAllPageable(Pageable pageable);
	
	Kullanici getByKullaniciAdi(String kullaniciAdi);
	
}
