package bel.tr.abb.otomotivetkinlikleri.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class Temel implements Serializable{
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "olusturulma_zamani")
	private Date olusuturulmaZamani;
	
	@Column(name = "olusturan", length = 20)
	private String olusturan;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "guncelleme_zamani")
	private Date guncellenmeZamani;
	
	@Column(name = "guncelleyen", length = 20)
	private String guncelleyen;
	
	@Column(name = "durumu")
	private Boolean durumu;

}
