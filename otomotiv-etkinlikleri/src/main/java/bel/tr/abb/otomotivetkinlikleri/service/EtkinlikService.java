package bel.tr.abb.otomotivetkinlikleri.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import bel.tr.abb.otomotivetkinlikleri.dto.EtkinlikDto;
import bel.tr.abb.otomotivetkinlikleri.util.TPage;

public interface EtkinlikService {
	
	EtkinlikDto save(EtkinlikDto etkinlik);
	
	EtkinlikDto getById(Long id);
	
	List<EtkinlikDto> getByEtkinlikAdi(String etkinlikAdi);
	
	List<EtkinlikDto> getByEtkinlikTarihi(Date etkinlikTarihi);
	
	TPage<EtkinlikDto> getAllPageable(Pageable pageable);
	
	boolean delete(EtkinlikDto etkinlik);
}
