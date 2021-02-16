package bel.tr.abb.otomotivetkinlikleri.dto;

import java.util.Date;

import bel.tr.abb.otomotivetkinlikleri.entity.EtkinlikDurumu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EtkinlikDto {
	private Long id;
	private String aciklama;
	private String etkinlikAdi;
	private Date etkinlikTarihi;
	private EtkinlikDurumu durum;
	private KullaniciDto katilimci;
	private KullaniciDto duzenleyenKullanici;
}
