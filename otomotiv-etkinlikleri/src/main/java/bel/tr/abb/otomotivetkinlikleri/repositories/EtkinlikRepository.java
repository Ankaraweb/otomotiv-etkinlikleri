package bel.tr.abb.otomotivetkinlikleri.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import bel.tr.abb.otomotivetkinlikleri.entity.Etkinlik;

public interface EtkinlikRepository extends JpaRepository<Etkinlik, Long>{
	
	List<Etkinlik> getByEtkinlikAdi(String etkinlikAdi);
	
	List<Etkinlik> getByEtkinlikTarihi(Date etkinlikTarihi);
	
	Page<Etkinlik> findAll(Pageable pageable);
	
	List<Etkinlik> findAll(Sort sort);
	
}