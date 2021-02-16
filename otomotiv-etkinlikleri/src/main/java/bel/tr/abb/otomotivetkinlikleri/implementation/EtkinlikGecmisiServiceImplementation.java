package bel.tr.abb.otomotivetkinlikleri.implementation;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import bel.tr.abb.otomotivetkinlikleri.entity.EtkinlikGecmisi;
import bel.tr.abb.otomotivetkinlikleri.repositories.EtkinlikGecmisiRepository;
import bel.tr.abb.otomotivetkinlikleri.service.EtkinlikGecmisiService;

@Service
public class EtkinlikGecmisiServiceImplementation implements EtkinlikGecmisiService {
	
	private final EtkinlikGecmisiRepository etkinlikGecmisiRepository;
	
	public EtkinlikGecmisiServiceImplementation (EtkinlikGecmisiRepository etkinlikGecmisiRepository) {
		this.etkinlikGecmisiRepository = etkinlikGecmisiRepository;
	}
	
	@Override
	public EtkinlikGecmisi save(EtkinlikGecmisi etkinlikGecmisi) {
		
		if (etkinlikGecmisi.getEtkinlik() == null) {
			throw new IllegalArgumentException("Lütfen bir etkinlik giriniz.");			
		}
		
		etkinlikGecmisi = etkinlikGecmisiRepository.save(etkinlikGecmisi);
		return etkinlikGecmisi;
		
	}

	@Override
	public EtkinlikGecmisi getByID(Long id) {
		return etkinlikGecmisiRepository.getOne(id);
	}

	@Override
	public Page<EtkinlikGecmisi> getAllPageable(Pageable pageable) {
		return etkinlikGecmisiRepository.findAll(pageable);
	}

	@Override
	public Boolean delete(EtkinlikGecmisi etkinlikGecmisi) {
		etkinlikGecmisiRepository.delete(etkinlikGecmisi);
		return Boolean.TRUE;
	}
	
	
	
}
