package bel.tr.abb.otomotivetkinlikleri.implementation;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import bel.tr.abb.otomotivetkinlikleri.entity.Kullanici;
import bel.tr.abb.otomotivetkinlikleri.repositories.KullaniciRepository;
import bel.tr.abb.otomotivetkinlikleri.service.KullaniciService;

@Service
public class KullaniciServiceImplementation implements KullaniciService {
	
	private final KullaniciRepository kullaniciRepository;
	
	public KullaniciServiceImplementation(KullaniciRepository kullaniciRepository) {
		this.kullaniciRepository = kullaniciRepository;
	}
	
	@Override
	public Kullanici save(Kullanici kullanici) {
		if (kullanici.getEmail() == null) {
			throw new IllegalArgumentException("Lütfen bir e-posta adresi giriniz.");
		}
		
		kullanici = kullaniciRepository.save(kullanici);
		return kullanici;
	}

	@Override
	public Kullanici getByID(Long id) {
		return kullaniciRepository.getOne(id);
	}

	@Override
	public Page<Kullanici> getAllPageable(Pageable pageable) {
		return kullaniciRepository.findAll(pageable);
	}

	@Override
	public Kullanici getByKullaniciAdi(String kullaniciAdi) {
		return kullaniciRepository.findByKullaniciAdi(kullaniciAdi);
	}

}
