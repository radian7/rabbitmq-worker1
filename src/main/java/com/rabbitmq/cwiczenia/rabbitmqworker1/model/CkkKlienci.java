package com.rabbitmq.cwiczenia.rabbitmqworker1.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the CKK_KLIENCI database table.
 * 
 */
@Entity
@Table(name="CKK_KLIENCI")
@NamedQuery(name="CkkKlienci.findAll", query="SELECT c FROM CkkKlienci c")
public class CkkKlienci implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="KL_KOD", unique=true, nullable=false, precision=10)
	private long klKod;

	@Column(name="KL_AUDYT_KM", length=100)
	private String klAudytKm;

	@Column(name="KL_AUDYT_KT", length=100)
	private String klAudytKt;

	@Column(name="KL_AUDYT_LM")
	private BigDecimal klAudytLm;

	@Temporal(TemporalType.DATE)
	@Column(name="KL_DATA_KONTA_EBOK")
	private Date klDataKontaEbok;

	@Column(name="KL_F_OSOBA_FIZYCZNA", length=1)
	private String klFOsobaFizyczna;

	@Column(name="KL_F_SYNCHRONIZED", length=1)
	private String klFSynchronized;

	@Column(name="KL_IDENTYFIKACJA", length=256)
	private String klIdentyfikacja;

	@Temporal(TemporalType.DATE)
	@Column(name="KL_KIEDY_MODYFIKOWAL")
	private Date klKiedyModyfikowal;

	@Temporal(TemporalType.DATE)
	@Column(name="KL_KIEDY_UTWORZYL", nullable=false)
	private Date klKiedyUtworzyl;

	@Column(name="KL_KOD_OBCY", length=10)
	private String klKodObcy;

	@Column(name="KL_MODYFIKOWAL", length=30)
	private String klModyfikowal;

	@Column(name="KL_SKROT", nullable=false, length=50)
	private String klSkrot;

	@Column(name="KL_SKROT2", length=50)
	private String klSkrot2;

	@Column(name="KL_SKROT3", length=50)
	private String klSkrot3;

	@Column(name="KL_SKROT4", length=50)
	private String klSkrot4;

	@Column(name="KL_SKROT5", length=50)
	private String klSkrot5;

	@Column(name="KL_SKROT6", length=50)
	private String klSkrot6;

	@Column(name="KL_SKROT7", length=50)
	private String klSkrot7;

	@Column(name="KL_SKROT8", length=50)
	private String klSkrot8;

	@Column(name="KL_SKROT9", length=50)
	private String klSkrot9;

	@Column(name="KL_UTWORZYL", nullable=false, length=30)
	private String klUtworzyl;

	@Column(name="KL_UZYTKOWNIK", length=256)
	private String klUzytkownik;

	@Column(name="KL_WAP_ID", nullable=false, precision=10)
	private BigDecimal klWapId;

	@Column(name="KL_WLASCICIEL", length=1)
	private String klWlasciciel;

	@Column(name="KL_ZRODLO_DANYCH", length=3)
	private String klZrodloDanych;

	//bi-directional many-to-one association to CkkAdresy
	@OneToMany(mappedBy="ckkKlienci")
	private List<CkkAdresy> ckkAdresies;

	//bi-directional many-to-one association to CkkKlienciDane
	@OneToMany(mappedBy="ckkKlienci")
	private List<CkkKlienciDane> ckkKlienciDanes;

	//bi-directional many-to-one association to CkkTelefony
	@OneToMany(mappedBy="ckkKlienci")
	private List<CkkTelefony> ckkTelefonies;

	public CkkKlienci() {
	}

	public long getKlKod() {
		return this.klKod;
	}

	public void setKlKod(long klKod) {
		this.klKod = klKod;
	}

	public String getKlAudytKm() {
		return this.klAudytKm;
	}

	public void setKlAudytKm(String klAudytKm) {
		this.klAudytKm = klAudytKm;
	}

	public String getKlAudytKt() {
		return this.klAudytKt;
	}

	public void setKlAudytKt(String klAudytKt) {
		this.klAudytKt = klAudytKt;
	}

	public BigDecimal getKlAudytLm() {
		return this.klAudytLm;
	}

	public void setKlAudytLm(BigDecimal klAudytLm) {
		this.klAudytLm = klAudytLm;
	}

	public Date getKlDataKontaEbok() {
		return this.klDataKontaEbok;
	}

	public void setKlDataKontaEbok(Date klDataKontaEbok) {
		this.klDataKontaEbok = klDataKontaEbok;
	}

	public String getKlFOsobaFizyczna() {
		return this.klFOsobaFizyczna;
	}

	public void setKlFOsobaFizyczna(String klFOsobaFizyczna) {
		this.klFOsobaFizyczna = klFOsobaFizyczna;
	}

	public String getKlFSynchronized() {
		return this.klFSynchronized;
	}

	public void setKlFSynchronized(String klFSynchronized) {
		this.klFSynchronized = klFSynchronized;
	}

	public String getKlIdentyfikacja() {
		return this.klIdentyfikacja;
	}

	public void setKlIdentyfikacja(String klIdentyfikacja) {
		this.klIdentyfikacja = klIdentyfikacja;
	}

	public Date getKlKiedyModyfikowal() {
		return this.klKiedyModyfikowal;
	}

	public void setKlKiedyModyfikowal(Date klKiedyModyfikowal) {
		this.klKiedyModyfikowal = klKiedyModyfikowal;
	}

	public Date getKlKiedyUtworzyl() {
		return this.klKiedyUtworzyl;
	}

	public void setKlKiedyUtworzyl(Date klKiedyUtworzyl) {
		this.klKiedyUtworzyl = klKiedyUtworzyl;
	}

	public String getKlKodObcy() {
		return this.klKodObcy;
	}

	public void setKlKodObcy(String klKodObcy) {
		this.klKodObcy = klKodObcy;
	}

	public String getKlModyfikowal() {
		return this.klModyfikowal;
	}

	public void setKlModyfikowal(String klModyfikowal) {
		this.klModyfikowal = klModyfikowal;
	}

	public String getKlSkrot() {
		return this.klSkrot;
	}

	public void setKlSkrot(String klSkrot) {
		this.klSkrot = klSkrot;
	}

	public String getKlSkrot2() {
		return this.klSkrot2;
	}

	public void setKlSkrot2(String klSkrot2) {
		this.klSkrot2 = klSkrot2;
	}

	public String getKlSkrot3() {
		return this.klSkrot3;
	}

	public void setKlSkrot3(String klSkrot3) {
		this.klSkrot3 = klSkrot3;
	}

	public String getKlSkrot4() {
		return this.klSkrot4;
	}

	public void setKlSkrot4(String klSkrot4) {
		this.klSkrot4 = klSkrot4;
	}

	public String getKlSkrot5() {
		return this.klSkrot5;
	}

	public void setKlSkrot5(String klSkrot5) {
		this.klSkrot5 = klSkrot5;
	}

	public String getKlSkrot6() {
		return this.klSkrot6;
	}

	public void setKlSkrot6(String klSkrot6) {
		this.klSkrot6 = klSkrot6;
	}

	public String getKlSkrot7() {
		return this.klSkrot7;
	}

	public void setKlSkrot7(String klSkrot7) {
		this.klSkrot7 = klSkrot7;
	}

	public String getKlSkrot8() {
		return this.klSkrot8;
	}

	public void setKlSkrot8(String klSkrot8) {
		this.klSkrot8 = klSkrot8;
	}

	public String getKlSkrot9() {
		return this.klSkrot9;
	}

	public void setKlSkrot9(String klSkrot9) {
		this.klSkrot9 = klSkrot9;
	}

	public String getKlUtworzyl() {
		return this.klUtworzyl;
	}

	public void setKlUtworzyl(String klUtworzyl) {
		this.klUtworzyl = klUtworzyl;
	}

	public String getKlUzytkownik() {
		return this.klUzytkownik;
	}

	public void setKlUzytkownik(String klUzytkownik) {
		this.klUzytkownik = klUzytkownik;
	}

	public BigDecimal getKlWapId() {
		return this.klWapId;
	}

	public void setKlWapId(BigDecimal klWapId) {
		this.klWapId = klWapId;
	}

	public String getKlWlasciciel() {
		return this.klWlasciciel;
	}

	public void setKlWlasciciel(String klWlasciciel) {
		this.klWlasciciel = klWlasciciel;
	}

	public String getKlZrodloDanych() {
		return this.klZrodloDanych;
	}

	public void setKlZrodloDanych(String klZrodloDanych) {
		this.klZrodloDanych = klZrodloDanych;
	}

	public List<CkkAdresy> getCkkAdresies() {
		return this.ckkAdresies;
	}

	public void setCkkAdresies(List<CkkAdresy> ckkAdresies) {
		this.ckkAdresies = ckkAdresies;
	}

	public CkkAdresy addCkkAdresy(CkkAdresy ckkAdresy) {
		getCkkAdresies().add(ckkAdresy);
		ckkAdresy.setCkkKlienci(this);

		return ckkAdresy;
	}

	public CkkAdresy removeCkkAdresy(CkkAdresy ckkAdresy) {
		getCkkAdresies().remove(ckkAdresy);
		ckkAdresy.setCkkKlienci(null);

		return ckkAdresy;
	}
	
	public List<CkkKlienciDane> getCkkKlienciDanes() {
		return this.ckkKlienciDanes;
	}

	public void setCkkKlienciDanes(List<CkkKlienciDane> ckkKlienciDanes) {
		this.ckkKlienciDanes = ckkKlienciDanes;
	}

	public CkkKlienciDane addCkkKlienciDane(CkkKlienciDane ckkKlienciDane) {
		getCkkKlienciDanes().add(ckkKlienciDane);
		ckkKlienciDane.setCkkKlienci(this);

		return ckkKlienciDane;
	}

	public CkkKlienciDane removeCkkKlienciDane(CkkKlienciDane ckkKlienciDane) {
		getCkkKlienciDanes().remove(ckkKlienciDane);
		ckkKlienciDane.setCkkKlienci(null);

		return ckkKlienciDane;
	}

	public List<CkkTelefony> getCkkTelefonies() {
		return this.ckkTelefonies;
	}

	public void setCkkTelefonies(List<CkkTelefony> ckkTelefonies) {
		this.ckkTelefonies = ckkTelefonies;
	}

	public CkkTelefony addCkkTelefony(CkkTelefony ckkTelefony) {
		getCkkTelefonies().add(ckkTelefony);
		ckkTelefony.setCkkKlienci(this);

		return ckkTelefony;
	}

	public CkkTelefony removeCkkTelefony(CkkTelefony ckkTelefony) {
		getCkkTelefonies().remove(ckkTelefony);
		ckkTelefony.setCkkKlienci(null);

		return ckkTelefony;
	}

	
}