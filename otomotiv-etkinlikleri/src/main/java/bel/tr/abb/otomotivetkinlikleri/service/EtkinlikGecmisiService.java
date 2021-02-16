package bel.tr.abb.otomotivetkinlikleri.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import bel.tr.abb.otomotivetkinlikleri.entity.EtkinlikGecmisi;

public interface EtkinlikGecmisiService {
	
	EtkinlikGecmisi save(EtkinlikGecmisi etkinlikGecmisi);
	
	EtkinlikGecmisi getByID(Long id);
	
	Page<EtkinlikGecmisi> getAllPageable(Pageable pageable);
	
	Boolean delete(EtkinlikGecmisi etkinlikGecmisi);
}
