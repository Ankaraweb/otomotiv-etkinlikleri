package bel.tr.abb.otomotivetkinlikleri.entity;

import java.util.Date;
import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "etkinlik_gecmisi")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class EtkinlikGecmisi extends Temel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JoinColumn(name = "etkinlik_id")
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	private Etkinlik etkinlik;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date")
	private Date date;
	
	@Column(name = "etkinlik_durumu")
	@Enumerated(EnumType.STRING)
	private EtkinlikDurumu etkinlikDurumu;
	
	@Column(name = "aciklama", length = 5000)
	private String aciklama;
	
	@JoinColumn(name = "katilimci_kullanici_id")
	@ManyToMany(fetch = FetchType.LAZY)
	private Kullanici katilimci;
}
