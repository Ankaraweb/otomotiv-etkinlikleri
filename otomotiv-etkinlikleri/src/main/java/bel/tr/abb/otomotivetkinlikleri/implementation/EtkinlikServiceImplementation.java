package bel.tr.abb.otomotivetkinlikleri.implementation;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import bel.tr.abb.otomotivetkinlikleri.dto.EtkinlikDto;
import bel.tr.abb.otomotivetkinlikleri.entity.Etkinlik;
import bel.tr.abb.otomotivetkinlikleri.repositories.EtkinlikRepository;
import bel.tr.abb.otomotivetkinlikleri.service.EtkinlikService;
import bel.tr.abb.otomotivetkinlikleri.util.TPage;

@Service
public class EtkinlikServiceImplementation implements EtkinlikService {
	
	private final EtkinlikRepository etkinlikRepository;
	private final ModelMapper modelMapper;
	
	public EtkinlikServiceImplementation(EtkinlikRepository etkinlikRepository, ModelMapper modelMapper) {
		this.etkinlikRepository = etkinlikRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public EtkinlikDto save(EtkinlikDto etkinlik) {
		
		if (etkinlik.getAciklama() == null) {
			throw new IllegalArgumentException("Lütfen etkinlik için bir açıklama yazınız.");
		}
		
		Etkinlik etkinlikEntity = modelMapper.map(etkinlik, Etkinlik.class);
		etkinlikEntity = etkinlikRepository.save(etkinlikEntity);
		etkinlik.setId(etkinlikEntity.getId());
		
		return etkinlik;
		
	}

	@Override
	public EtkinlikDto getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EtkinlikDto> getByEtkinlikTarihi(Date etkinlikTarihi) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TPage<EtkinlikDto> getAllPageable(Pageable pageable) {
		
		Page<Etkinlik> data = etkinlikRepository.findAll(pageable);
		TPage<EtkinlikDto> response = new TPage<EtkinlikDto>();
		response.setStat(data, Arrays.asList(modelMapper.map(data.getContent(), EtkinlikDto[].class)));
		return response;
		
	}

	@Override
	public boolean delete(EtkinlikDto etkinlik) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<EtkinlikDto> getByEtkinlikAdi(String etkinlikAdi) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
