package bel.tr.abb.otomotivetkinlikleri.entity;

import java.util.Date;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "etkinlik")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Etkinlik extends Temel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "etkinlik_adi", length = 100)
	private String etkinlikAdi;
	
	@Column(name = "aciklama", length = 5000)
	private String aciklama;
	
	@Column(name = "etkinlik_tarihi")
	@Temporal(TemporalType.TIMESTAMP)
	private Date etkinlikTarihi;
	
	@Column(name = "etkinlik_durumu")
	@Enumerated(EnumType.STRING)
	private EtkinlikDurumu durum;
	
	@JoinColumn(name = "katilimci_kullanici_id")
	@ManyToMany(fetch = FetchType.LAZY)
	private Kullanici katilimci;
	
	@JoinColumn(name = "duzenleyen_kullanici_id")
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	private Kullanici duzenleyenKullanici;
}
