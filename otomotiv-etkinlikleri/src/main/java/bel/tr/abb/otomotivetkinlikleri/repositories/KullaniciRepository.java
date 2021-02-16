package bel.tr.abb.otomotivetkinlikleri.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bel.tr.abb.otomotivetkinlikleri.entity.Kullanici;

public interface KullaniciRepository extends JpaRepository<Kullanici, Long> {
	
	Kullanici findByKullaniciAdi(String kullaniciAdi);
	
}
