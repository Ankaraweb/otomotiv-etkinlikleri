package bel.tr.abb.otomotivetkinlikleri.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "kullanici")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Kullanici extends Temel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "kullanici_adi", length = 20, unique = true)
	private String kullaniciAdi;
	
	@Column(name = "parola", length = 14)
	private String parola;
	
	@Column(name = "ad_soyad", length = 100)
	private String adSoyad;
	
	@Column(name = "email", length = 50)
	private String email;
	
	@JoinColumn(name = "katilimci_kullanici_id")
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Etkinlik> etkinlikler;
	
}
